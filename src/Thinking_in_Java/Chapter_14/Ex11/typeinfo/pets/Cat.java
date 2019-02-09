package Thinking_in_Java.Chapter_14.Ex11.typeinfo.pets;

public class Cat extends Pet {
    public Cat(String name) {
        super(name);
    }
    public Cat() {
        super();
    }

    @Override
    public String toString() {
        return "Cat{" + "name='" + name + '\'' + '}';
    }
}
