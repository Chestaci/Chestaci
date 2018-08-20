package Thinking_in_Java.Chapter_10;

public class Ex7 {
    private String string;
    private String m(){
        return "Hello";
    }
    class Inner{
        public void f() {
            string = "Mr.White";
            System.out.println(m());
        }

    }
    public void f2(){
//        Ex7 ex7 = new Ex7();
//        Inner inner = ex7.new Inner();
        Inner inner = this.new Inner();
        inner.f();
        System.out.println(string);
    }

    public static void main(String[] args) {
        Ex7 ex72 =  new Ex7();
        ex72.f2();
    }
}
