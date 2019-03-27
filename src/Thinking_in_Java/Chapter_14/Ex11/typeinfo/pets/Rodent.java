package Thinking_in_Java.Chapter_14.Ex11.typeinfo.pets;

public class Rodent extends Pet {
    public Rodent(String name) {
        super(name);
    }
    public Rodent() {
        super();
    }
//    public void speak(){
//        System.out.println(this + "is speak");
//    }

    @Override
    public String toString() {
        return "Rodent{" + "name='" + name + '\'' + '}';
    }
}
