package Thinking_in_Java.Chapter_14.Ex11.typeinfo.pets;

public class Gerbil extends Rodent { // Ex11
    public Gerbil(String name) {
        super(name);
    }
    public Gerbil() {
        super();
    }
//    public void speak(){
//        System.out.println(this + "is speak");
//    }

    @Override
    public String toString() {
        return "Gerbil{" + "name='" + name + '\'' + '}';
    }
}
