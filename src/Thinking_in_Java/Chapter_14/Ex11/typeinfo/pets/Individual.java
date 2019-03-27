package Thinking_in_Java.Chapter_14.Ex11.typeinfo.pets;

public class Individual {
    String name;
    public Individual() {
    }
    public Individual(String name) {
        this.name = name;
    }

    public void speak(){
        System.out.println(this + "is speak");
    }

    @Override
    public String toString() {
        return "Individual{" + "name='" + name + '\'' + '}';
    }
}
