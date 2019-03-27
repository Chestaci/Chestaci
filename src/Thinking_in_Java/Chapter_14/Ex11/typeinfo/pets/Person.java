package Thinking_in_Java.Chapter_14.Ex11.typeinfo.pets;

public class Person extends Individual{
    public Person(String name){
        super(name);
    }
//    public void speak(){
//        System.out.println(this + "is speak");
//    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + '}';
    }
}
