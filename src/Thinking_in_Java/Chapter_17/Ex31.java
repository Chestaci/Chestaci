package Thinking_in_Java.Chapter_17;

import net.mindview.util.*;

import java.util.*;


public class Ex31 {
    static final int LOOPS = 10000;
    static List<Test2<List<String>>> alTests =
            new ArrayList<Test2<List<String>>>();
    static List<Test2<MyCont>> scTests =
            new ArrayList<Test2<MyCont>>();
    static {
        alTests.add(new Test2<List<String>>("addget") {
            int test(List<String> list, TestParam tp) {
                for(int i = 0; i < LOOPS; i++) {
                    list.add(Integer.toString(i));
                    list.get(i);
                }
                return LOOPS;
            }
        });
        scTests.add(new Test2<MyCont>("addget") {
            int test(MyCont sc, TestParam tp) {
                for(int i = 0; i < 10000; i++) {
                    sc.add(Integer.toString(i));
                    sc.remove(i);
                }
                return 10000;
            }
        });
    }
    public static void main(String[] args) {
// Parameters are also hard-coded inside tests.
        Tester.defaultParams = TestParam.array(LOOPS, 1);
        Tester.run(new ArrayList<String>(LOOPS), alTests);
        Tester.run(new MyCont(), scTests);
    }
}

class MyCont {
    int count = 0;
    String a[] = new String[10];

    public void add(String s) {
        if (count < a.length) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] == null) {
                    a[i] = s;
                    count++;
                    return;
                }
            }

        } else {
            String a1[] = Arrays.copyOf(a, (2 * a.length));
            a = a1;
            for (int i = 0; i < a.length; i++) {
                if (a[i] == null) {
                    a[i] = s;
                    count++;
                    return;
                }
            }
        }
    }

    public String remove(int c) {
        if (c < a.length && c > 0) {
            String f = a[c];
            a[c] = null;
            count--;
            return f;
        }
        return null;
    }

    @Override
    public String toString() {
        return "MyCont{" +
                "a=" + Arrays.toString(a) +
                '}';
    }

    public static void main(String[] args) {
        MyCont a = new MyCont();
        a.add("1");
        a.add("2");
        a.add("3");
        a.add("4");
        a.add("5");
        a.add("6");
        a.add("7");
        a.add("8");
        a.add("9");
        a.add("10");
        a.add("11");
        System.out.println(a);
        System.out.println(a.a.length);
        System.out.println(a.count);
        System.out.println(a.remove(5));
        System.out.println(a);
        System.out.println(a.a.length);
        System.out.println(a.count);
        a.add("six");
        System.out.println(a);
        System.out.println(a.a.length);
        System.out.println(a.count);
    }
}