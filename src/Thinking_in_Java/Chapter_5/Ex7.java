package Thinking_in_Java.Chapter_5;

public class Ex7 {
    void print(){
        System.out.println("Я запустился, " +
                "а значит у значит у моего объекта автоматически создался конструктор по умолчанию " +
                "и это хорошо! =)");
    }

    public static void main(String[] args) {
        Ex7 ex7 = new Ex7();
        ex7.print();
    }
}
