package Thinking_in_Java.Chapter_7;

public class Ex23 extends LoadClass{
    private int d = printInit("Ex23.d initialized");

    public static void main(String[] args) {
        System.out.println("Ex23()");
        Ex23 ex23 = new Ex23();
        LoadClass.main(args);
    }
    static int r = printInit("static Ex23.r initialized");
}

class A1 {
    static int j = printInit("static A1.j initialized");
    private int y = printInit("A1.y initialized");
    static int printInit(String s) {
        System.out.println(s);
        return 1;
    }
    A1() {
        System.out.println("A1() constructor");
    }

    @Override
    public String toString() {
        return "Объект A1{}";
    }
}

class B1 extends A1 {
    static int k = printInit("static B1.k initialized");
    private int u = printInit("B1.u initialized");
    B1() {
        System.out.println("B1() constructor");
    }
}

class C1 {
    static int n = printInitC("C1.n initialized");
    static A1 a = new A1();
    private int o = printInitC("C1.o initialized");
    C1() {
        System.out.println("C1() constructor");
    }
    static int printInitC(String s) {
        System.out.println(s);
        return 1;
    }
}

class D1 {
        D1() { System.out.println("D1() constructor"); }
}

class LoadClass extends B1 {
    static int i = printInit("LoadClass.i initialized");
    LoadClass() {
        System.out.println("LoadClass() constructor");
    }
    private int p = printInit("LoadClass.p initialized");
    public static void main(String[] args) {
        // accessing static main causes loading (and initialization)
        // of A, B, & LoadClass
        System.out.println("hi");
        // call constructors from loaded classes:
        LoadClass lc = new LoadClass();
        // call to static field loads & initializes C:
        System.out.println(C1.a);
        // call to constructor loads D:
        D1 d = new D1();
    }
}


