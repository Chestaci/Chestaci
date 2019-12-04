package Thinking_in_Java.Chapter_17;

import net.mindview.util.FiveTuple;
import net.mindview.util.FourTuple;
import net.mindview.util.ThreeTuple;
import net.mindview.util.TwoTuple;

import static net.mindview.util.Print.print;

public class Ex28 {
}

class Tuple {
    static class Tuple2<A, B> implements Comparable<Tuple2<A, B>> {
        public final A first;
        public final B second;

        public Tuple2(A a, B b) {
            first = a;
            second = b;
        }

        public String toString() {
            return "(" + first + ", " + second + ")";
        }

        @Override
        public int hashCode() {
            int result = 17;
            if (first != null)
                result = result * 37 + first.hashCode();
            if (second != null)
                result = result * 37 + second.hashCode();
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Tuple2) {
                return (first == null ?
                        ((Tuple2) obj).first == null : first.equals(((Tuple2) obj).first)) &&
                        (second == null ?
                                ((Tuple2) obj).second == null : second.equals(((Tuple2) obj).second));
            }
            return false;
        }

        @Override
        public int compareTo(Tuple2<A, B> o) {
            int res = ((Comparable<A>) first).compareTo(o.first);
            if (res != 0) return res;
            return ((Comparable<B>) second).compareTo(o.second);
        }
    }

    static class Tuple3<A, B, C> implements Comparable<Tuple3<A, B, C>> {
        private final Tuple2<A, B> tuple2;
        public final C third;

        public Tuple3(A a, B b, C c) {
            tuple2 = new Tuple2<A, B>(a, b);
            third = c;
        }

        public String toString() {
            return "(" + tuple2.first + ", " + tuple2.second + ", " + third + ")";
        }

        @Override
        public int hashCode() {
            int result = tuple2.hashCode();
            if (third != null)
                result = result * 37 + third.hashCode();
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Tuple3) {
                return (third == null ?
                        ((Tuple3) obj).third == null : third.equals(((Tuple3) obj).third)) &&
                        tuple2.equals(((Tuple3) obj).tuple2);
            }
            return false;
        }

        @Override
        public int compareTo(Tuple3<A, B, C> o) {
            int res = tuple2.compareTo(o.tuple2);
            if (res != 0) return res;
            return ((Comparable<C>) third).compareTo(o.third);
        }
    }

    static class Tuple4<A, B, C, D> implements Comparable<Tuple4<A, B, C, D>> {
        private final Tuple3<A, B, C> tuple3;
        public final D fourth;

        public Tuple4(A a, B b, C c, D d) {
            tuple3 = new Tuple3<A, B, C>(a, b, c);
            fourth = d;
        }

        public String toString() {
            return "(" + tuple3.tuple2.first + ", " + tuple3.tuple2.second + ", " +
                    tuple3.third + ", " + fourth + ")";
        }

        @Override
        public int hashCode() {
            int result = tuple3.hashCode();
            if (fourth != null)
                result = result * 37 + fourth.hashCode();
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Tuple4) {
                return (fourth == null ?
                        ((Tuple4) obj).fourth == null : fourth.equals(((Tuple4) obj).fourth)) &&
                        tuple3.equals(((Tuple4) obj).tuple3);
            }
            return false;
        }

        @Override
        public int compareTo(Tuple4<A, B, C, D> o) {
            int res = tuple3.compareTo(o.tuple3);
            if (res != 0) return res;
            return ((Comparable<D>) fourth).compareTo(o.fourth);
        }
    }

    static class Tuple5<A, B, C, D, E> implements Comparable<Tuple5<A, B, C, D, E>> {
        private final Tuple4<A, B, C, D> tuple4;
        public final E fifth;

        public Tuple5(A a, B b, C c, D d, E e) {
            tuple4 = new Tuple4<>(a, b, c, d);
            fifth = e;
        }

        public String toString() {
            return "(" + tuple4.tuple3.tuple2.first + ", " + tuple4.tuple3.tuple2.second + ", " +
                    tuple4.tuple3.third + ", " + tuple4.fourth + ", " + fifth + ")";
        }

        @Override
        public int hashCode() {
            int result = tuple4.hashCode();
            if (fifth != null)
                result = result * 37 + fifth.hashCode();
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Tuple5) {
                return (fifth == null ?
                        ((Tuple5) obj).fifth == null : fifth.equals(((Tuple5) obj).fifth)) &&
                        tuple4.equals(((Tuple5) obj).tuple4);
            }
            return false;
        }

        @Override
        public int compareTo(Tuple5<A, B, C, D, E> o) {
            int res = tuple4.compareTo(o.tuple4);
            if (res != 0) return res;
            return ((Comparable<E>) fifth).compareTo(o.fifth);
        }
    }
    public static <A,B> Tuple2<A,B> tuple(A a, B b) {
        return new Tuple2<A,B>(a, b);
    }
    public static <A,B,C> Tuple3<A,B,C> tuple(A a, B b, C c) {
        return new Tuple3<A,B,C>(a, b, c);
    }
    public static <A,B,C,D> Tuple4<A,B,C,D>
    tuple(A a, B b, C c, D d) {
        return new Tuple4<A,B,C,D>(a, b, c, d);
    }
    public static <A,B,C,D,E>
    Tuple5<A,B,C,D,E> tuple(A a, B b, C c, D d, E e) {
        return new Tuple5<A,B,C,D,E>(a, b, c, d, e);
    }

    public static void main(String[] args) {
        Tuple.Tuple5<String,Integer,Boolean,Short,Long>
                t5_1 = Tuple.tuple("a", 1, false, (short)2, 3L),
                t5_2 = Tuple.tuple("b", 2, true, (short)3, 4L);
        print("t5_1 = " + t5_1);
        print("t5_2 = " + t5_2);
        print("t5_1.equals(t5_1) = " + t5_1.equals(t5_1));
        print("t5_1.equals(t5_2) = " + t5_1.equals(t5_2));
        print("t5_1.compareTo(t5_1) = " + t5_1.compareTo(t5_1));
        print("t5_1.compareTo(t5_2) = " + t5_1.compareTo(t5_2));
    }
}