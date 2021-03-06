package Thinking_in_Java.Chapter_17;

import net.mindview.util.CountingGenerator;


import java.util.*;

public class Ex34 {

}

class SetPerformance {
    static List<Test2<Set<String>>> tests =
            new ArrayList<Test2<Set<String>>>();
    static {
        tests.add(new Test2<Set<String>>("add") {
            int test(Set<String> set, TestParam tp) {
                int loops = tp.loops;
                int size = tp.size;
                for(int i = 0; i < loops; i++) {
                    set.clear();
                    for(int j = 0; j < size; j++)
                        set.add(new CountingGenerator.String(j).next());
                }
                return loops * size;
            }
        });
        tests.add(new Test2<Set<String>>("contains") {
            int test(Set<String> set, TestParam tp) {
                int loops = tp.loops;
                int span = tp.size * 2;
                for(int i = 0; i < loops; i++)
                    for(int j = 0; j < span; j++)
                        set.contains(new CountingGenerator.String(j).next());
                return loops * span;
            }
        });
        tests.add(new Test2<Set<String>>("iterate") {
            int test(Set<String> set, TestParam tp) {
                int loops = tp.loops * 10;
                for(int i = 0; i < loops; i++) {
                    Iterator<String> it = set.iterator();
                    while(it.hasNext())
                        it.next();
                }
                return loops * set.size();
            }
        });
    }
    public static void main(String[] args) {
        if(args.length > 0)
            Tester.defaultParams = TestParam.array(args);
        Tester.fieldWidth = 10;
        Tester.run(new TreeSet<String>(), tests);
        Tester.run(new HashSet<String>(), tests);
        Tester.run(new LinkedHashSet<String>(), tests);
    }
}