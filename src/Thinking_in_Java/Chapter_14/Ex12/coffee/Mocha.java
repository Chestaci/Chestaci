package Thinking_in_Java.Chapter_14.Ex12.coffee;

public class Mocha extends Coffee {
    public static class Factory implements Thinking_in_Java.Chapter_14.Ex11.typeinfo.factory.Factory<Mocha> {
        @Override
        public Mocha create() {
            return new Mocha();
        }
    }
}
