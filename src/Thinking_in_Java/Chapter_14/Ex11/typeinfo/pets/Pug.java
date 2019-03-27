package Thinking_in_Java.Chapter_14.Ex11.typeinfo.pets;

public class Pug extends Dog {
    public Pug(String name) {
        super(name);
    }
    public Pug() {
        super();
    }
    public static class Factory implements Thinking_in_Java.Chapter_14.Ex11.typeinfo.factory.Factory<Pug> {
        @Override
        public Pug create() {
            return new Pug();
        }
    }
//    public void speak(){
//        System.out.println(this + "is speak");
//    }

    @Override
    public String toString() {
        return "Pug{" + "name='" + name + '\'' + '}';
    }
}
