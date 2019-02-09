package Thinking_in_Java.Chapter_14.Ex11.typeinfo.pets;

public class Manx extends Cat {
    public Manx(String name) {
        super(name);
    }
    public Manx() {
        super();
    }
    public static class Factory implements Thinking_in_Java.Chapter_14.Ex11.typeinfo.factory.Factory<Manx> {
        @Override
        public Manx create() {
            return new Manx();
        }
    }
}
