package Thinking_in_Java.Chapter_5;

public class Ex19 {
    static void m(String... args){
        for(String s : args){
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        m("sdfsdfsdf");
        m("dfgdfg", "sdfsdgsdgsdg", "skjdhkjhkjhjkh");
        m(new String[]{"dfgdfg", "sdfsdgsdgsdg","dfgdfg", "sdfsdgsdgsdg","dfgdfg", "sdfsdgsdgsdg","dfgdfg", "sdfsdgsdgsdg"});
    }
}
