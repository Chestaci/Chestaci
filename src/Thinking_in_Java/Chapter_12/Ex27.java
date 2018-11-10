package Thinking_in_Java.Chapter_12;

public class Ex27 {
    public static void main(String[] args) {
        Integer[] integers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        try{
            System.out.println(integers[11]);
        }catch (ArrayIndexOutOfBoundsException e){
            throw new RuntimeException(e);
        }
    }
}
