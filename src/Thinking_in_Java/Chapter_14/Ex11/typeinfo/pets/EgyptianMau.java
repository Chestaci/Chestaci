package Thinking_in_Java.Chapter_14.Ex11.typeinfo.pets;

public class EgyptianMau extends Cat{
    public EgyptianMau(String name) {
        super(name);
    }
    public EgyptianMau() {
        super();
    }
    public static class Factory implements Thinking_in_Java.Chapter_14.Ex11.typeinfo.factory.Factory<EgyptianMau> {
        @Override
        public EgyptianMau create() {
            return new EgyptianMau();
        }
    }
}
