package Thinking_in_Java.Chapter_5;

public class Ex14 {
    public static void main(String[] args) {
        System.out.println("************main****************");
        Ex14Static ex14 = new Ex14Static();
        ex14.print();
    }
    static Ex14Static ex14Static = new Ex14Static();
}
class Ex14Static{
    static String s = "static String s";
    static String s2;
    static{
        s2 = "static String s2";
        System.out.println(s);
        System.out.println(s2);
    }
    static void print(){
        System.out.println("************print()*************");
        System.out.println("********************************");
        System.out.println(s);
        System.out.println(s2);
        System.out.println("********************************");
    }
    Ex14Static(){
        System.out.println("Ex14Static()");
    }
}