package Thinking_in_Java.Chapter_14.Ex11.typeinfo.pets;

public class Mouse extends Rodent {
    public Mouse(String name) {
        super(name);
    }
    public Mouse() {
        super();
    }
    public static class Factory implements Thinking_in_Java.Chapter_14.Ex11.typeinfo.factory.Factory<Mouse> {
        @Override
        public Mouse create() {
            return new Mouse();
        }
    }
//    public void speak(){
//        System.out.println(this + "is speak");
//    }

    @Override
    public String toString() {
        return "Mouse{" + "name='" + name + '\'' + '}';
    }
}
