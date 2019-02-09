package Thinking_in_Java.Chapter_14.Ex12.coffee;

public class Breve extends Coffee {
    public static class Factory implements Thinking_in_Java.Chapter_14.Ex11.typeinfo.factory.Factory<Breve> {
        @Override
        public Breve create() {
            return new Breve();
        }
    }
}
