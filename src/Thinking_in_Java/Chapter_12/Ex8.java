package Thinking_in_Java.Chapter_12;

public class Ex8 {
    void m() throws MySecondException{
        System.out.println("Ошибка возбуждена в методе m()");
        throw new MySecondException("Создано в методе m()");
    }
//    public static void main(String[] args) {
//        try {
//            m();
//        }catch (MySecondException e){
//            e.printStackTrace();
//            e.showString();
//        }
//    }
}

class TestEx8{
    public static void main(String[] args) {
        Ex8 ex8 = new Ex8();
        try {
            ex8.m();
        } catch (MySecondException e) {
            e.printStackTrace();
        }
    }
}