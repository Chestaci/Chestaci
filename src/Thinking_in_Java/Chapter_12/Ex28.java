package Thinking_in_Java.Chapter_12;

public class Ex28 {
    static void m() throws MySecondException2{
        System.out.println("Ошибка возбуждена в методе m()");
        throw new MySecondException2("Создано в методе m()");
    }
    public static void main(String[] args) {
       m();
    }
}

class MySecondException2 extends RuntimeException{
    private String string;

    public MySecondException2(String string) {
        super(string);
        this.string = string;
    }

    public void showString() {
        System.out.println(string + " " + "из метода showString()");
    }
}