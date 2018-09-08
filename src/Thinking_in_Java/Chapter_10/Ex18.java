package Thinking_in_Java.Chapter_10;

interface Ex18 {
    public static class Ex18_1 {
        public void go (){
            System.out.println("Hi!");
        }
    }
}

class Ex18_2 implements Ex18 {
    public static void main(String[] args) {
        Ex18_1 ex = new Ex18_1();
        ex.go();
    }
}
