package Thinking_in_Java.Chapter_14.Ex12.coffee;

public class Latte extends Coffee {
    public static class Factory implements Thinking_in_Java.Chapter_14.Ex11.typeinfo.factory.Factory<Latte> {
        @Override
        public Latte create() {
            return new Latte();
        }
    }
}
