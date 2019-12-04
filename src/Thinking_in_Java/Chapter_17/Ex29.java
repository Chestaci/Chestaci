package Thinking_in_Java.Chapter_17;

import net.mindview.util.*;

import java.util.*;

public class Ex29 {
}

abstract class Test2<C> {
    String name;
    public Test2(String name) { this.name = name; }
    // Override this method for different tests.
// Returns actual number of repetitions of test.
    abstract int test(C container, TestParam tp);
}

class TestParam {
    public final int size;
    public final int loops;
    public TestParam(int size, int loops) {
        this.size = size;
        this.loops = loops;
    }
    // Create an array of TestParam from a varargs sequence:
    public static TestParam[] array(int... values) {
        int size = values.length/2;
        TestParam[] result = new TestParam[size];
        int n = 0;
        for(int i = 0; i < size; i++)
            result[i] = new TestParam(values[n++], values[n++]);
        return result;
    }
    // Convert a String array to a TestParam array:
    public static TestParam[] array(String[] values) {
        int[] vals = new int[values.length];
        for(int i = 0; i < vals.length; i++)
            vals[i] = Integer.decode(values[i]);
        return array(vals);
    }
}

class Tester<C> {
    public static int fieldWidth = 8;
    public static TestParam[] defaultParams= TestParam.array(
            10, 5000, 100, 5000, 1000, 5000, 10000, 500);
    // Override this to modify pre-test initialization:
    protected C initialize(int size) { return container; }
    protected C container;
    private String headline = "";
    private List<Test2<C>> tests;
    private static String stringField() {
        return "%" + fieldWidth + "s";
    }
    private static String numberField() {
        return "%" + fieldWidth + "d";
    }
    private static int sizeWidth = 5;
    private static String sizeField = "%" + sizeWidth + "s";
    private TestParam[] paramList = defaultParams;
    public Tester(C container, List<Test2<C>> tests) {
        this.container = container;
        this.tests = tests;
        if(container != null)
            headline = container.getClass().getSimpleName();
    }
    public Tester(C container, List<Test2<C>> tests,
                  TestParam[] paramList) {
        this(container, tests);
        this.paramList = paramList;
    }
    public void setHeadline(String newHeadline) {
        headline = newHeadline;
    }
    // Generic methods for convenience :
    public static <C> void run(C cntnr, List<Test2<C>> tests){
        new Tester<C>(cntnr, tests).timedTest();
    }
    public static <C> void run(C cntnr,
                               List<Test2<C>> tests, TestParam[] paramList) {
        new Tester<C>(cntnr, tests, paramList).timedTest();
    }
    private void displayHeader() {
// Calculate width and pad with '-':
        int width = fieldWidth * tests.size() + sizeWidth;
        int dashLength = width - headline.length() - 1;
        StringBuilder head = new StringBuilder(width);
        for(int i = 0; i < dashLength/2; i++)
            head.append('-');
        head.append(' ');
        head.append(headline);
        head.append(' ');
        for(int i = 0; i < dashLength/2; i++)
            head.append('-');
        System.out.println(head);
// Print column headers:
        System.out.format(sizeField, "size");
        for(Test2 test : tests)
            System.out.format(stringField(), test.name);
        System.out.println();
    }
    // Run the tests for this container:
    public void timedTest() {
        displayHeader();
        for(TestParam param : paramList) {
            System.out.format(sizeField, param.size);
            for(Test2<C> test : tests) {
                C kontainer = initialize(param.size);
                long start = System.nanoTime();
// Call the overriden method:
                int reps = test.test(kontainer, param);
                long duration = System.nanoTime() - start;
                long timePerRep = duration / reps; // Nanoseconds
                System.out.format(numberField(), timePerRep);
            }
            System.out.println();
        }
    }
}




class ListPerformance {
    static Random rand = new Random();
    static int reps = 1000;
    static List<Test2<List<String>>> tests =
            new ArrayList<Test2<List<String>>>();
    static List<Test2<LinkedList<String>>> qTests =
            new ArrayList<Test2<LinkedList<String>>>();
    static {
        tests.add(new Test2<List<String>>("add") {
            int test(List<String> list, TestParam tp) {
                int loops = tp.loops;
                int listSize = tp.size;
                for(int i = 0; i < loops; i++) {
                    list.clear();
                    for(int j = 0; j < listSize; j++)
                        list.add(Integer.toString(j));
                }
                return loops * listSize;
            }
        });
        tests.add(new Test2<List<String>>("get") {
            int test(List<String> list, TestParam tp) {
                int loops = tp.loops * reps;
                int listSize = list.size();
                for(int i = 0; i < loops; i++)
                    list.get(rand.nextInt(listSize));
                return loops;
            }
        });
        tests.add(new Test2<List<String>>("set") {
            int test(List<String> list, TestParam tp) {
                int loops = tp.loops * reps;
                int listSize = list.size();
                for(int i = 0; i < loops; i++)
                    list.set(rand.nextInt(listSize), Integer.toString(47));
                return loops;
            }
        });
        tests.add(new Test2<List<String>>("iteradd") {
            int test(List<String> list, TestParam tp) {
                final int LOOPS = 1000000;
                int half = list.size() / 2;
                ListIterator<String> it = list.listIterator(half);
                for(int i = 0; i < LOOPS; i++)
                    it.add(Integer.toString(47));
                return LOOPS;
            }
        });
        tests.add(new Test2<List<String>>("insert") {
            int test(List<String> list, TestParam tp) {
                int loops = tp.loops;
                for(int i = 0; i < loops; i++)
                    list.add(5, Integer.toString(47)); // Minimize random-access cost
                return loops;
            }
        });
        tests.add(new Test2<List<String>>("remove") {
            int test(List<String> list, TestParam tp) {
                int loops = tp.loops;
                int size = tp.size;
                for(int i = 0; i < loops; i++) {
                    list.clear();
                    list.addAll(new CollectionData<String>(new CountingGenerator.String(),size));
                    while(list.size() > 5)
                        list.remove(5); // Minimize random-access cost
                }
                return loops * size;
            }
        });
// Tests for queue behavior:
        qTests.add(new Test2<LinkedList<String>>("addFirst") {
            int test(LinkedList<String> list, TestParam tp) {
                int loops = tp.loops;
                int size = tp.size;
                for(int i = 0; i < loops; i++) {
                    list.clear();
                    for(int j = 0; j < size; j++)
                        list.addFirst(Integer.toString(47));
                }
                return loops * size;
            }
        });
        qTests.add(new Test2<LinkedList<String>>("addLast") {
            int test(LinkedList<String> list, TestParam tp) {
                int loops = tp.loops;
                int size = tp.size;
                for(int i = 0; i < loops; i++) {
                    list.clear();
                    for(int j = 0; j < size; j++)
                        list.addLast(Integer.toString(47));
                }
                return loops * size;
            }
        });
        qTests.add(
                new Test2<LinkedList<String>>("rmFirst") {
                    int test(LinkedList<String> list, TestParam tp) {
                        int loops = tp.loops;
                        int size = tp.size;
                        for(int i = 0; i < loops; i++) {
                            list.clear();
                            list.addAll(new CollectionData<String>(new CountingGenerator.String(),size));
                            while(list.size() > 0)
                                list.removeFirst();
                        }
                        return loops * size;
                    }
                });
        qTests.add(new Test2<LinkedList<String>>("rmLast") {
            int test(LinkedList<String> list, TestParam tp) {
                int loops = tp.loops;
                int size = tp.size;
                for(int i = 0; i < loops; i++) {
                    list.clear();
                    list.addAll(new CollectionData<String>(new CountingGenerator.String(),size));
                    while(list.size() > 0)
                        list.removeLast();
                }
                return loops * size;
            }
        });
    }
    static class ListTester extends Tester<List<String>> {
        public ListTester(List<String> container,
                          List<Test2<List<String>>> tests) {
            super(container, tests);
        }
        // Fill to the appropriate size before each test:
        @Override protected List<String> initialize(int size){
            container.clear();
            container.addAll(new CollectionData<String>(new CountingGenerator.String(),size));
            return container;
        }
        // Convenience method:
        public static void run(List<String> list,
                               List<Test2<List<String>>> tests) {
            new ListTester(list, tests).timedTest();
        }
    }
    public static void main(String[] args) {
        if(args.length > 0)
            Tester.defaultParams = TestParam.array(args);
// Can only do these two tests on an array:
        Tester<List<String>> arrayTest =
                new Tester<List<String>>(null, tests.subList(1, 3)){
                    // This will be called before each test. It
// produces a non-resizeable array-backed list:
                    @Override protected
                    List<String> initialize(int size) {
                        String[] ia = Generated.array(String.class,
                                new CountingGenerator.String(), size);
                        return Arrays.asList(ia);
                    }
                };
        arrayTest.setHeadline("Array as List");
        arrayTest.timedTest();
        Tester.defaultParams= TestParam.array(
                10, 5000, 100, 5000, 1000, 1000, 10000, 200);
        if(args.length > 0)
            Tester.defaultParams = TestParam.array(args);
        ListTester.run(new ArrayList<String>(), tests);
        ListTester.run(new LinkedList<String>(), tests);
        ListTester.run(new Vector<String>(), tests);
        Tester.fieldWidth = 12;
        Tester<LinkedList<String>> qTest =
                new Tester<LinkedList<String>>(
                        new LinkedList<String>(), qTests);
        qTest.setHeadline("Queue tests");
        qTest.timedTest();
    }
}