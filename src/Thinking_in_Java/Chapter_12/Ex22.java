package Thinking_in_Java.Chapter_12;

public class Ex22 {
    public static void main(String[] args) {
        try {
            FailingConstructor constractor = new FailingConstructor();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class FailingConstructor {
    public FailingConstructor() throws Exception {
    }
}
