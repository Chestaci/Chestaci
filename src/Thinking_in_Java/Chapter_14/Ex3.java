package Thinking_in_Java.Chapter_14;

import java.util.Arrays;
import java.util.List;

public class Ex3 {
}

abstract class Shape {
    void draw() { System.out.println(this + ".draw()"); }
    abstract public String toString();
}

class Circle extends Shape {
    public String toString() { return "Circle"; }
}

class Square extends Shape {
    public String toString() { return "Square"; }
}

class Triangle extends Shape {
    public String toString() { return "Triangle"; }
}

class Rhomboid extends Shape {
    public String toString() { return "Rhomboid"; }
}

class Shapes3 {
    public static void main(String[] args) {
        // upcasting to Shape:
        List<Shape> shapeList = Arrays.asList(
                new Circle(), new Square(), new Triangle(), new Rhomboid()
        );
        // downcasting back to specific shape:
        for(Shape shape : shapeList)
            shape.draw();
        Rhomboid r = new Rhomboid();
        ((Shape)r).draw();
        // inconvertible types:
        // ((Circle)r).draw();
    }
}