package Thinking_in_Java.Chapter_14;

public class Ex10 {
    public static void main(String[] args) {
        char primchar[] = {'a', 'b', 'c'};
        Character objchar[] = {'d', 'e', 'f'};
        System.out.println(primchar.getClass().getComponentType());
        System.out.println(objchar.getClass().getComponentType());


    }
}
