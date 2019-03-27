package Thinking_in_Java.Chapter_14.Ex11.typeinfo.pets;

public class Dog extends Pet {
    public Dog(String name) {
        super(name);
    }
    public Dog() {
        super();
    }
//    public void speak(){
//        System.out.println(this + "is speak");
//    }

    @Override
    public String toString() {
        return "Dog{" + "name='" + name + '\'' + '}';
    }
}
