package Thinking_in_Java.Chapter_15;

import Thinking_in_Java.Chapter_14.Ex11.typeinfo.pets.Cat;

import static Thinking_in_Java.Chapter_15.Tuple.tuple;
import static Thinking_in_Java.Chapter_15.Tuple2.tuple2;

public class Ex15_16 {
}

class Tuple {
    public static <A,B> TwoTuple<A,B> tuple(A a, B b) {
        return new TwoTuple<A,B>(a, b);
    }
    public static <A,B,C> ThreeTuple<A,B,C>
    tuple(A a, B b, C c) {
        return new ThreeTuple<A,B,C>(a, b, c);
    }
    public static <A,B,C,D> FourTuple<A,B,C,D>
    tuple(A a, B b, C c, D d) {
        return new FourTuple<A,B,C,D>(a, b, c, d);
    }
    public static <A,B,C,D,E>
    FiveTuple<A,B,C,D,E> tuple(A a, B b, C c, D d, E e) {
        return new FiveTuple<A,B,C,D,E>(a, b, c, d, e);
    }
    public static <A,B,C,D,E,F>
    SixTuple<A,B,C,D,E,F> tuple(A a, B b, C c, D d, E e, F f) {return new SixTuple<A,B,C,D,E,F>(a, b, c, d, e, f);}
}

class TupleTest2 {

    ///////////////
    static TwoTuple<String,Integer> fff = f2();

    ///////////////

    static TwoTuple<String,Integer> f() {
        return tuple("hi", 47);
    }
    static TwoTuple f2() { return tuple("hi", 47); }
    static ThreeTuple<Amphibian,String,Integer> g() {
        return tuple(new Amphibian(), "hi", 47);
    }
    static
    FourTuple<Vehicle,Amphibian,String,Integer> h() {
        return tuple(new Vehicle(), new Amphibian(), "hi", 47);
    }
    static
    FiveTuple<Vehicle,Amphibian,String,Integer,Double> k() {
        return tuple(new Vehicle(), new Amphibian(),
                "hi", 47, 11.1);
    }
    static
    SixTuple<Vehicle,Amphibian,String,Integer,Double,Integer> l() {
        return tuple(new Vehicle(), new Amphibian(),
                "hi", 47, 11.1, 5);
    }
    public static void main(String[] args) {
        TwoTuple<String,Integer> ttsi = f();
        System.out.println(ttsi);
        System.out.println(f2());
        System.out.println(g());
        System.out.println(h());
        System.out.println(k());
        System.out.println(l());
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        TwoTuple<String,Integer> twoTupleNoParametrs = f2();
        System.out.println(twoTupleNoParametrs);





        /////////////////
//        TwoTuple twoTuple = new TwoTuple("",1);
//        twoTuple = f();
//        twoTuple = f2();
//        TwoTuple twoTuple2 = new TwoTuple(1,1);
//        twoTuple2 = f();
//        twoTuple2 = f2();
//        TwoTuple<String,String> twoTuple3 = new TwoTuple<String,String>("","");
//        //twoTuple3 = f();
//        twoTuple3 = f2();
//        System.out.println(twoTuple3.first.getClass() + "" + twoTuple3.second.getClass());
//        TwoTuple<Cat,String> twoTuple4 = new TwoTuple<Cat,String>(new Cat("Murzic"),"");
////        twoTuple4 = f();
//        twoTuple4 = f2();

        /////////////////
// Какая-то лажа.. надо разбираться... почему работает? версия поменялась?
    }
}
class Tuple2 {
    public static <A, B> net.mindview.util.TwoTuple<A, B> tuple2(A a, B b) {
        return new net.mindview.util.TwoTuple<A, B>(a, b);
    }
}

class TupleTest3 {
    static net.mindview.util.TwoTuple<String, Integer> f11() {
        return tuple2("hi", 47);
    }

    static net.mindview.util.TwoTuple f12() {
        return tuple2("hi", 47);
    }

    public static void main(String[] args) {
        net.mindview.util.TwoTuple<String,Integer> t = f11();
        net.mindview.util.TwoTuple<String,Integer> t2 = f12();
    }
}
/*
class TupleTest15 {
    static TwoTuple<String,Integer> f() {
        return tuple("hi", 47);
    }
    static TwoTuple f2() { return tuple("hi", 47); }
    static ThreeTuple<Amphibian,String,Integer> g() {
        return tuple(new Amphibian(), "hi", 47);
    }
    static FourTuple<Vehicle,Amphibian,String,Integer> h() {
        return tuple(new Vehicle(), new Amphibian(), "hi", 47);
    }
    static FiveTuple<Vehicle,Amphibian,String,Integer,Double> k() {
        return tuple(new Vehicle(), new Amphibian(), "hi", 47,
                11.1);
    }
    public static void main(String[] args) {
        TwoTuple<String,Integer> ttsi = f();
        // compiler warning: unchecked conversion:
        TwoTuple<String,Integer> ttsi2 = f2();
        System.out.println(ttsi);
        System.out.println(f2());
        System.out.println(g());
        System.out.println(h());
        System.out.println(k());
    }
}
*/