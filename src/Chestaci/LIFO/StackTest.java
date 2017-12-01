package Chestaci.LIFO;

public class StackTest {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.pop("dog");
        s.pop("cat");
        s.pop("mouse");
        s.pop("raccoon");
        s.pop("rabbit");
        s.pop("dog2");
        s.pop("cat2");
        s.pop("mouse2");
        s.pop("raccoon2");
        s.pop("rabbit2");
        System.out.println(s.getSize());
        System.out.println(s.pull());
        System.out.println(s.size());
        System.out.println(s.pull());
        System.out.println(s.size());
        System.out.println(s.pull());
        System.out.println(s.size());
        System.out.println(s.pull());
        System.out.println(s.size());
        System.out.println(s.pull());
        System.out.println(s.size());
        System.out.println(s.pull());
        System.out.println(s.size());
        System.out.println(s.pull());
        System.out.println(s.size());
        System.out.println(s.pull());
        System.out.println(s.size());
        System.out.println(s.pull());
        System.out.println(s.size());
        System.out.println(s.pull());
        System.out.println(s.size());
    }
}
