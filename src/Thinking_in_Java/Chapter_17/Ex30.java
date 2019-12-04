package Thinking_in_Java.Chapter_17;

import net.mindview.util.CollectionData;
import net.mindview.util.CountingGenerator;
import net.mindview.util.Generated;

import java.util.*;

public class Ex30 {
}

class ListPerformance2 {
    static Random rand = new Random();
    static int reps = 1000;
    static List<Test2<List<String>>> tests =
            new ArrayList<Test2<List<String>>>();

    static {
        tests.add(new Test2<List<String>>("Collection sort") {
            int test(List<String> list, TestParam tp) {
                int loops = tp.loops;
                int listSize = tp.size;
                for(int i = 0; i < loops; i++) {
                    list.clear();
                    list.addAll(CollectionData.list(
                            new CountingGenerator.String(), tp.size));
                    Collections.sort(list);
                }
                return loops;
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
//        if(args.length > 0)
//            Tester.defaultParams = TestParam.array(args);
//// Can only do these two tests on an array:
//        Tester<List<String>> arrayTest =
//                new Tester<List<String>>(null, tests.subList(1, 3)){
//                    // This will be called before each test. It
//// produces a non-resizeable array-backed list:
//                    @Override protected
//                    List<String> initialize(int size) {
//                        String[] ia = Generated.array(String.class,
//                                new CountingGenerator.String(), size);
//                        return Arrays.asList(ia);
//                    }
//                };
//        arrayTest.setHeadline("Array as List");
//        arrayTest.timedTest();
//        Tester.defaultParams= TestParam.array(
//                10, 5000, 100, 5000, 1000, 1000, 10000, 200);
//        if(args.length > 0)
//            Tester.defaultParams = TestParam.array(args);
//        ListTester.run(new ArrayList<String>(), tests);
//        ListTester.run(new LinkedList<String>(), tests);
//        Tester.fieldWidth = 12;
        if(args.length > 0)
            Tester.defaultParams = TestParam.array(args);
        ListTester.run(new ArrayList<String>(), tests);
        ListTester.run(new LinkedList<String>(), tests);
    }
}