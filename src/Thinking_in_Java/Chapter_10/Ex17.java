package Thinking_in_Java.Chapter_10;

public class Ex17 {
    class Ex17_1 {
        class Ex17_2 {

        }
    }

    static class Ex17_1s{
        static class Ex17_2s{

        }
    }

    public static void main(String[] args) {
     Ex17 ex17 = new Ex17();
     Ex17.Ex17_1 ex17_1 = ex17.new Ex17_1();
     Ex17.Ex17_1.Ex17_2 ex17_2 = ex17_1.new Ex17_2();

     Ex17_1s ex17_1s = new Ex17_1s();
     Ex17_1s.Ex17_2s ex17_2s = new Ex17_1s.Ex17_2s();

    }
}
