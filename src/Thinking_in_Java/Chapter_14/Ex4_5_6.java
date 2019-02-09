package Thinking_in_Java.Chapter_14;

import java.util.Arrays;
import java.util.List;

public class Ex4_5_6 {
}

abstract class Shape1 {
    boolean b;
    abstract void setBoolean();
    //boolean b = false;
    void draw() { System.out.println(this + ".draw()"); }
    //void setBoolean(){
   //     b = true;
   // }
    @Override
    public String toString() {
        return "Shape1{" + "b =" + b + '}';
    }
}

class Circle1 extends Shape1 {
    boolean b = false;
    void setBoolean(){
        b = true;
    }
    public String toString() { return b + " " + "Circle1"; }
}

class Square1 extends Shape1 {
    boolean b = false;
    void setBoolean(){
        b = true;
    }
    public String toString() { return b + " " + "Square1"; }
}

class Triangle1 extends Shape1 {
    boolean b = false;
    void setBoolean(){
        b = true;
    }
    public String toString() { return b + " " + "Triangle1"; }
}

class Rhomboid1 extends Shape1 {
    boolean b = false;
    void setBoolean(){
        b = true;
    }
    public String toString() { return b + " " + "Rhomboid1"; }
}

class Shapes31 {
    public static void flag (Shape1 shape1, String string){
        String name = shape1.getClass().getSimpleName();
            if(string.equals(name)){
                System.out.println("Я ВЫПОЛНИЛСЯ");
                shape1.setBoolean();
            }
    }

    public static  <T> boolean isInstance(Shape1 shape1, Class<T> type){
        return type.isInstance(shape1);
       }

    public static void flag2 (Shape1 shape1, Class type){

        if(isInstance(shape1, type)){
            System.out.println("Я ВЫПОЛНИЛСЯ");
            shape1.setBoolean();
        }
    }




    public static void rotate(Shape1 shape1){
        if(shape1 instanceof Circle1) System.out.println("rotate() не требуется!");
        else if(!(shape1 instanceof Circle1))
            System.out.println(shape1 + " использует метод rotate()");
    }
    public static void main(String[] args) {
        // upcasting to Shape1:
        List<Shape1> shapeList = Arrays.asList(
                new Circle1(), new Square1(), new Triangle1(), new Rhomboid1()
        );
        // downcasting back to specific shape:
        for(Shape1 shape : shapeList) {
            shape.draw();
            rotate(shape);
            //flag(shape, "Triangle1");
            flag2(shape, Square1.class);
            System.out.println(shape.toString());
        }

        Rhomboid1 r = new Rhomboid1();
        ((Shape1)r).draw();

        Shape1 s = (Shape1)r;
        s.draw();
        if(s instanceof Circle1)
            ((Circle1)s).draw();
        else if(!(s instanceof Circle1))
            System.out.println("(Shape1)r is not a Circle1");
        // inconvertible types:
        // ((Circle1)r).draw();
    }
}