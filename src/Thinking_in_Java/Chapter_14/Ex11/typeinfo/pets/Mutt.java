package Thinking_in_Java.Chapter_14.Ex11.typeinfo.pets;

public class Mutt extends Dog {
    public Mutt(String name) {
        super(name);
    }
    public Mutt() {
        super();
    }
    public static class Factory implements Thinking_in_Java.Chapter_14.Ex11.typeinfo.factory.Factory<Mutt> {
        @Override
        public Mutt create() {
            return new Mutt();
        }
    }
//    public void speak(){
//        System.out.println(this + "is speak");
//    }

    @Override
    public String toString() {
        return "Mutt{" + "name='" + name + '\'' + '}';
    }
}
