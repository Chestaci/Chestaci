package Thinking_in_Java.Chapter_7;

public class Cartoon extends Drawing{

    public Cartoon(){
        System.out.println("Конструктор Cartoon");
    }

    public static void main(String[] args) {
        Cartoon x = new Cartoon();
//        System.out.println(x);
//        System.out.println(new Cartoon());
    }
}

class Art{
    Art(){
        System.out.println("Конструктор Art");
    }
}

class Drawing extends Art{
    Drawing(){
        System.out.println("Конструктор Drawing");
    }
}
