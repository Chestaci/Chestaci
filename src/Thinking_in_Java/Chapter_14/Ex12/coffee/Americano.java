package Thinking_in_Java.Chapter_14.Ex12.coffee;

public class Americano extends Coffee {
    public static class Factory implements Thinking_in_Java.Chapter_14.Ex11.typeinfo.factory.Factory<Americano> {
        @Override
        public Americano create() {
            return new Americano();
        }
    }
}
