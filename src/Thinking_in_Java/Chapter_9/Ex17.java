package Thinking_in_Java.Chapter_9;

public class Ex17 implements Tea {
    String string = "Drink";

    public Ex17() {
        System.out.println(VOLUME);
    }

    //    VOLUME = string;
//    VOLUME = "Drink";
public static void main(String[] args) {
    System.out.println(VOLUME + " " + Tea.VOLUME);
    Ex17 ex17 = new Ex17();
}
}

interface Tea{
    String VOLUME = "Only full";
}