package Thinking_in_Java.Chapter_14.Ex11.typeinfo;

public class RegisteredFactories {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
           System.out.println(Part.createRandom());
        }
    }
}
