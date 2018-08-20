package Thinking_in_Java.Chapter_10;

public class Ex8 {
    class I{
        private String string = "Проверка";
        private void m(){
            System.out.println("Проверка 2");
        }
    }

    public static void main(String[] args) {
        Ex8 ex8 = new Ex8();
//        ex8.m();
//        ex8.string = "Привет";
        Ex8.I i = ex8.new I();
        i.m();
        System.out.println(i.string);
    }
}
