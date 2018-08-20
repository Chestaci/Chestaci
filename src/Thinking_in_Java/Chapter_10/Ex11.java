package Thinking_in_Java.Chapter_10;

public class Ex11 {
    private class II implements Ii{

        @Override
        public void n() {
            System.out.println("Test");
        }
    }
    Ii ii(){
        return new II();
    }

    public static void main(String[] args) {
        Ex11 ex11 = new Ex11();
        ex11.ii().n();
       // (II) ex11.ii().n();
    }
}

interface Ii{
    void n();
}