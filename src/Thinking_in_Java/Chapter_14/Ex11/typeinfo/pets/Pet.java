package Thinking_in_Java.Chapter_14.Ex11.typeinfo.pets;

public class Pet extends Individual{
    public Pet(String name) {
        super(name);
    }
    public Pet() {
        super();
    }

    @Override
    public String toString() {
        return "Pet{" + "name='" + name + '\'' + '}';
    }
}
