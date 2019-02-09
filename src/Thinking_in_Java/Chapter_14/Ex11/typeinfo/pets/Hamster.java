package Thinking_in_Java.Chapter_14.Ex11.typeinfo.pets;

public class Hamster extends Rodent {
    public Hamster(String name) {
        super(name);
    }
    public Hamster() {
        super();
    }
    public static class Factory implements Thinking_in_Java.Chapter_14.Ex11.typeinfo.factory.Factory<Hamster> {
        @Override
        public Hamster create() {
            return new Hamster();
        }
    }
}
