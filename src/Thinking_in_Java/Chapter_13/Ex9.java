package Thinking_in_Java.Chapter_13;

public class Ex9 {
    public static void main(String[] args) {
        System.out.println(Ex8.knights.replaceAll("a|A|o|O|e|E|u|U|i|I|y|Y", "_"));
        System.out.println(Ex8.knights.replaceAll("[aAoOeEuUiIyY]", "_"));
    }
}
