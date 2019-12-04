package Thinking_in_Java.Chapter_17;

import java.util.*;

public class Ex32 {
    static final int LOOPS = 10000;
    static List<Test2<List<Integer>>> alTests =
            new ArrayList<Test2<List<Integer>>>();
    static List<Test2<MyCont2>> scTests =
            new ArrayList<Test2<MyCont2>>();
    static {
        alTests.add(new Test2<List<Integer>>("addget") {
            int test(List<Integer> list, TestParam tp) {
                for(int i = 0; i < LOOPS; i++) {
                    list.add(i);
                    list.set(i, list.get(i) + 1);
                }
                return LOOPS;
            }
        });
        scTests.add(new Test2<MyCont2>("addget") {
            int test(MyCont2 sc, TestParam tp) {
                for(int i = 0; i < LOOPS; i++) {
                    sc.add(i);
                    sc.set(i, sc.get(i) + 1);
                }
                return LOOPS;
            }
        });
    }
    public static void main(String[] args) {
// Parameters are also hard-coded inside tests.
        Tester.defaultParams = TestParam.array(LOOPS, 1);
        Tester.run(new ArrayList<Integer>(LOOPS), alTests);
        Tester.run(new MyCont2(LOOPS), scTests);
    }
}

class MyCont2 {
    int count = 0;
    int a[] = new int[10];

    public MyCont2(int r) {
        a = new int[r];
    }

    public MyCont2() {
    }

    public void add(int s) {
        if (count < a.length) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] == 0) {
                    a[i] = s;
                    count++;
                    return;
                }
            }

        } else {
            int r = (int) (a.length * 1.5);
            //int a1[] = Arrays.copyOf(a, (2 * a.length));
            int a1[] = new int[r];
            for(int j = 0; j < a.length; j++) {
                a1[j] = a[j];
            }
                    a = a1;
            for (int i = 0; i < a.length; i++) {
                if (a[i] == 0) {
                    a[i] = s;
                    count++;
                    return;
                }
            }
        }
    }
//private static final int INCR = 255;
//
//    public void add(int i) {
//        if(count >= a.length) {
//            int[] tmp = new int[a.length + INCR];
//            for(int j = 0; j < a.length; j++)
//                tmp[j] = a[j];
//            count = a.length;
//            a = tmp;
//        }
//        a[count++] = i;
//    }


    public int get(int i) { return a[i]; }

    public void set(int i, int val) { a[i] = val; }

    public int size() { return count; }


    public int remove(int c) {
        if (c < a.length && c >= 0) {
            int f = a[c];
            a[c] = 0;
            count--;
            return f;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "MyCont2{" +
                "a=" + Arrays.toString(a) +
                '}';
    }

    public static void main(String[] args) {
        MyCont2 a = new MyCont2();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);
        a.add(7);
        a.add(8);
        a.add(9);
        a.add(10);

        System.out.println(a);
        System.out.println(a.a.length);
        System.out.println(a.count);
        a.add(11);
        System.out.println(a);
        System.out.println(a.a.length);
        System.out.println(a.count);
        System.out.println(a.remove(5));
        System.out.println(a);
        System.out.println(a.a.length);
        System.out.println(a.count);
        a.add(6);
        System.out.println(a);
        System.out.println(a.a.length);
        System.out.println(a.count);
    }
}
