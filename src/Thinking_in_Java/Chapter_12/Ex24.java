package Thinking_in_Java.Chapter_12;

public class Ex24 {
    public static void main(String[] args) {
        try {
            FailingConstructor3 constructor = new FailingConstructor3();
            try {
                constructor.showFC3();
            } catch (Exception e) {
                System.out.println("Ошибка в методе showFC3()");
                e.printStackTrace();
            } finally {
                constructor.dispose();
            }
        } catch (Exception e) {
            System.out.println("Ошибка конструирования объекта FailingConstructor3");
            e.printStackTrace();
        }
    }
}

class FailingConstructor3 {
    private Integer[] integers = new Integer[1];
    public FailingConstructor3() throws Exception {
        integers[0] = 1;
    }
    public void showFC3() throws Exception{
        System.out.println(integers[0]);
    }
    public void dispose () {
        System.out.println("dispose()");
    }
}
