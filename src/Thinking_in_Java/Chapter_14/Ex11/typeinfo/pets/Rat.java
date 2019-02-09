package Thinking_in_Java.Chapter_14.Ex11.typeinfo.pets;

public class Rat extends Rodent {
    public Rat(String name) {
        super(name);
    }
    public Rat() {
        super();
    }
    public static class Factory implements Thinking_in_Java.Chapter_14.Ex11.typeinfo.factory.Factory<Rat> {
        @Override
        public Rat create() {
            return new Rat();
        }
    }
}
