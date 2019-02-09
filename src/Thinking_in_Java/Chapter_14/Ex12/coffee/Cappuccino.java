package Thinking_in_Java.Chapter_14.Ex12.coffee;

public class Cappuccino extends Coffee {
    public static class Factory implements Thinking_in_Java.Chapter_14.Ex11.typeinfo.factory.Factory<Cappuccino> {
        @Override
        public Cappuccino create() {
            return new Cappuccino();
        }
    }
}
