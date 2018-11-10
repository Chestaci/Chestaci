package Thinking_in_Java.Chapter_12;

public class Ex1 {
    void m() throws MyFirstException{
        System.out.println("Возбуждаем Exception из метода m()");
        throw new MyFirstException("Создано в m()");
    }
    public static void main(String[] args) {
        Ex1 ex1 = new Ex1();
        try{
            ex1.m();
        } catch (Exception e){
            System.out.println("Перехвачено!");
            System.err.println("Перехвачено!");
            e.printStackTrace();
        } finally {
            System.out.println("Блок finally выполнился!");
        }
    }
}

class MyFirstException extends Exception{
    public MyFirstException() {
    }

    public MyFirstException(String msg) {
        super(msg);
    }
}