package Thinking_in_Java.Chapter_7;

public class Ex24 extends Beetle{
    private int e = 7;
    protected int w;
    private int q = printInit("Поле Ex24.q инициализированно");
    private static int x3 = printInit("Поле static Ex24.x3 инициализированно");

    public Ex24(int w) {
        System.out.println("e = " + e + ", w = " + this.w + ", q = " + q + ", x3 = " + x3);
        this.w = w;
        System.out.println("w = " + w);
    }

    public static void main(String[] args) {
        System.out.println("Конструктор Ex24");
        Ex24 ex24 = new Ex24(42);
    }
}

class Insect{
    private int i = 9;
    protected int j;
    Insect(){
        System.out.println("i = " + i + ", j = " + j);
        j = 39;
    }
    private static int x1 = printInit("Поле static Insect.x1 инициализированно");
    static int printInit(String s){
        System.out.println(s);
        return 47;
    }

}
class Beetle extends Insect{
    private int k = printInit("Поле Beetle.k инициализированно");
    public Beetle(){
        System.out.println("k = " + k);
        System.out.println("j = " + j);
    }
    private static int x2 = printInit("Поле static Beetle.x2 инициализированно");

    public static void main(String[] args) {
        System.out.println("Конструктор Beetle");
        Beetle b = new Beetle();
    }
}