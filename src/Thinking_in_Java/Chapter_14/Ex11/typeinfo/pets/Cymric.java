package Thinking_in_Java.Chapter_14.Ex11.typeinfo.pets;

public class Cymric extends Manx {
    public Cymric(String name) {
        super(name);
    }
    public Cymric() {
        super();
    }

//    public void speak(){
//        System.out.println(this + "is speak");
//    }

    public static class Factory implements Thinking_in_Java.Chapter_14.Ex11.typeinfo.factory.Factory<Cymric> {
        @Override
        public Cymric create() {
            return new Cymric();
        }
    }

    @Override
    public String toString() {
        return "Cymric{" + "name='" + name + '\'' + '}';
    }
}
