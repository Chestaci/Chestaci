package Thinking_in_Java.Chapter_17;

import net.mindview.util.*;

import java.util.*;

public class Ex33 {
}

class FastTraversalLinkedList<T> extends AbstractList<T> {
    LinkedList<T> l = new LinkedList<T>();

    public boolean add(T s) {
        return l.add(s);
    }
    public void add(int i, T s) {
        l.add(i, s);
    }

    public T remove(int c) {
       return l.remove(c);
    }
    public boolean remove(Object obj) {
        return l.remove(obj);
    }


    public T get(int i) {
        ArrayList<T> a = new ArrayList<T>(l);
        return a.get(i);
    }

    public T set(int i, T val) {
        ArrayList<T> a = new ArrayList<T>(l);
        T old = a.get(i);
        a.set(i,val);
        l = new LinkedList<T>(a);
        return old;
    }

    public int size() { return l.size(); }

    @Override
    public String toString() {
        return "FastTraversalLinkedList{" +
                "l=" + l +
                '}';
    }

    public void clear() {
        l.clear();
    }

    public ListIterator<T> listIterator(int half) {
        ArrayList<T> a = new ArrayList<T>(l);
       return a.listIterator(half);
    }

    public boolean addAll(Collection integers) {
        return l.addAll(integers);
    }
}

class ListPerformance3 {
    static Random rand = new Random();
    static int reps = 1000;
    static List<Test2<List<Integer>>> tests =
            new ArrayList<Test2<List<Integer>>>();

    static {
        tests.add(new Test2<List<Integer>>("add") {
            int test(List<Integer> list, TestParam tp) {
                int loops = tp.loops;
                int listSize = tp.size;
                for(int i = 0; i < loops; i++) {
                    list.clear();
                    for(int j = 0; j < listSize; j++)
                        list.add(j);
                }
                return loops * listSize;
            }
        });
        tests.add(new Test2<List<Integer>>("get") {
            int test(List<Integer> list, TestParam tp) {
                int loops = tp.loops * reps;
                int listSize = list.size();
                for(int i = 0; i < loops; i++)
                    list.get(rand.nextInt(listSize));
                return loops;
            }
        });
        tests.add(new Test2<List<Integer>>("set") {
            int test(List<Integer> list, TestParam tp) {
                int loops = tp.loops * reps;
                int listSize = list.size();
                for(int i = 0; i < loops; i++)
                    list.set(rand.nextInt(listSize), 47);
                return loops;
            }
        });
        tests.add(new Test2<List<Integer>>("iteradd") {
            int test(List<Integer> list, TestParam tp) {
                final int LOOPS = 1000000;
                int half = list.size() / 2;
                ListIterator<Integer> it = list.listIterator(half);
                for(int i = 0; i < LOOPS; i++)
                    it.add(47);
                return LOOPS;
            }
        });
//        tests.add(new Test2<List<String>>("insert") {
//            int test(List<String> list, TestParam tp) {
//                int loops = tp.loops;
//                for(int i = 0; i < loops; i++)
//                    list.add(5, Integer.toString(47)); // Minimize random-access cost
//                return loops;
//            }
//        });
        tests.add(new Test2<List<Integer>>("remove") {
            int test(List<Integer> list, TestParam tp) {
                int loops = tp.loops;
                int size = tp.size;
                for(int i = 0; i < loops; i++) {
                    list.clear();
                    list.addAll(new CollectionData<Integer>(new CountingGenerator.Integer(),size));
                    while(list.size() > 5)
                        list.remove(5); // Minimize random-access cost
                }
                return loops * size;
            }
        });
// Tests for queue behavior:

    }
    static class ListTester extends Tester<List<Integer>> {
        public ListTester(List<Integer> container,
                          List<Test2<List<Integer>>> tests) {
            super(container, tests);
        }
        // Fill to the appropriate size before each test:
        @Override protected List<Integer> initialize(int size){
            container.clear();
            container.addAll(new CollectionData<Integer>(new CountingGenerator.Integer(),size));
            return container;
        }
        // Convenience method:
        public static void run(List<Integer> list,
                               List<Test2<List<Integer>>> tests) {
            new ListTester(list, tests).timedTest();
        }
    }
//    public static void main(String[] args) {
//        if(args.length > 0)
//            Tester.defaultParams = TestParam.array(args);
//// Can only do these two tests on an array:
//        Tester<FastTraversalLinkedList> arrayTest =
//                new Tester<FastTraversalLinkedList>(null, tests.subList(1, 3)){
//                    // This will be called before each test. It
//// produces a non-resizeable array-backed list:
//                    @Override protected
//                    FastTraversalLinkedList initialize(int size) {
//                        Integer[] ia = Generated.array(Integer.class,
//                                new CountingGenerator.Integer(), size);
//                        FastTraversalLinkedList f = new FastTraversalLinkedList();
//                        LinkedList<Integer> ar = new LinkedList<>(Arrays.asList(ia));
//                        f.addAll(ar);
//                        return f;
//                    }
//                };
//        arrayTest.setHeadline("Array as List");
//        arrayTest.timedTest();
//        Tester.defaultParams= TestParam.array(
//                10, 5000, 100, 5000, 1000, 1000, 10000, 200);
//        if(args.length > 0)
//            Tester.defaultParams = TestParam.array(args);
//        ListTester.run(new FastTraversalLinkedList(), tests);
//       }
public static void main(String[] args) {
    if(args.length > 0)
        Tester.defaultParams = TestParam.array(args);
// Can only do these two tests on an array:
    Tester<List<Integer>> arrayTest =
            new Tester<List<Integer>>(null, tests.subList(1, 3)){
                // This will be called before each test. It
// produces a non-resizeable array-backed list:
                @Override protected
                List<Integer> initialize(int size) {
                    Integer[] ia = Generated.array(Integer.class,
                            new CountingGenerator.Integer(), size);
                    return Arrays.asList(ia);
                }
            };
    arrayTest.setHeadline("Array as List");
    arrayTest.timedTest();
    Tester.defaultParams= TestParam.array(
            10, 5000, 100, 5000, 1000, 1000, 10000, 200);
    if(args.length > 0)
        Tester.defaultParams = TestParam.array(args);
    ListTester.run(new ArrayList<Integer>(), tests);
    ListTester.run(new LinkedList<Integer>(), tests);
    ListTester.run(new FastTraversalLinkedList(), tests);
    //////////////////////////////////////////////



}
}
