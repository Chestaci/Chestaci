package Thinking_in_Java.Chapter_5;

public class Ex20 {
    public static void main(String[] args) {
        A.main("sdfsdf","sdfsdf","sdfsdf","sdfsdf","sdfsdf");
        System.out.println();
        A.main(new String[]{"sdfsdf","sdfsdf","sdfsdf","sdfsdf","sdfsdf"});
    }
}
class A{
    public static void main(String... args) {
        for (String s: args){
            System.out.print(s + " ");
        }
    }
}