package Thinking_in_Java.Chapter_12;

public class Ex4 {
    static void m() throws MySecondException{
        System.out.println("Ошибка возбуждена в методе m()");
        throw new MySecondException("Создано в методе m()");
    }
    public static void main(String[] args) {
        try {
            m();
        }catch (MySecondException e){
            e.printStackTrace();
            e.showString();
        }
    }
}

class MySecondException extends Exception{
    private String string;

    public MySecondException(String string) {
        super(string);
        this.string = string;
    }

    public void showString() {
        System.out.println(string + " " + "из метода showString()");
    }
}