package Thinking_in_Java.Chapter_11;

import java.util.Iterator;
import java.util.Random;

public class Ex31 {
    public static void main(String[] args) {
        Shapes.main(args);
    }
}

class Shape{
    public void show(){
        System.out.println("Shape.show()");
        System.out.println(this);
        System.out.println();
    }
    public void draw(){};
    public void erase(){};

    @Override
    public String toString() {
        return "Shape{}";
    }
}

class Circle extends Shape{
    @Override
    public void draw(){
        System.out.println("Circle.draw()");
    };
    @Override
    public void erase(){
        System.out.println("Circle.erase()");
    };
    @Override
    public void show() {
        System.out.println("Circle.show()");
        System.out.println(this);
        System.out.println();
    }
    @Override
    public String toString() {
        return "Circle{}";
    }
}

class Square extends Shape{
    @Override
    public void draw(){
        System.out.println("Square.draw()");
    };
    @Override
    public void erase(){
        System.out.println("Square.erase()");
    };
    @Override
    public void show() {
        System.out.println("Square.show()");
        System.out.println(this);
        System.out.println();
    }
    @Override
    public String toString() {
        return "Square{}";
    }
}

class Triangle extends Shape{
    @Override
    public void draw(){
        System.out.println("Triangle.draw()");
    };
    @Override
    public void erase(){
        System.out.println("Triangle.erase()");
    };
    @Override
    public void show() {
        System.out.println("Triangle.show()");
        System.out.println(this);
        System.out.println();
    }
    @Override
    public String toString() {
        return "Triangle{}";
    }
}

/**
//"Фабрика", случайным образом создающая объекты:
class RandomShapeGenerator{
    private Random rand = new Random(47);
    public Shape next(){
        switch (rand.nextInt(4)){
            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
            case 3: return new Star();
        }
    }
}

class Shapes{
    private static RandomShapeGenerator gen = new RandomShapeGenerator();
    public static void main(String[] args) {
        Shape[] s = new Shape[15];
        //Заполняем массив фигурами
        for(int i = 0; i < s.length; i++)
            s[i] = gen.next();
        //Полиморфные вызовы методов
        for(Shape shp: s) {
            shp.draw();
            shp.show();
        }
    }
}
 */

//"Фабрика", случайным образом создающая объекты:
class RandomShapeGenerator implements Iterable<Shape>{
private int i;
    Shape[] s;
    //Заполняем массив фигурами



    public RandomShapeGenerator(int i) {
        this.i = i;
        s = new Shape[i];
        for(int j = 0; j < s.length; j++)
          s[j] = next();
    }

    private Random rand = new Random(47);
    public Shape next(){
        switch (rand.nextInt(4)){
            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
            case 3: return new Star();
        }
    }

    @Override
    public Iterator<Shape> iterator() {
        return new Iterator<Shape>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < s.length;
            }

            @Override
            public Shape next() {
                return s[index++];
            }
        };
    }



}

class Shapes{
    private static RandomShapeGenerator gen = new RandomShapeGenerator(12);
    public static void main(String[] args) {
       //Полиморфные вызовы методов
        for(Shape shp: gen) {
            shp.draw();
            shp.show();
        }
    }
}

class Star extends Shape{
    @Override
    public void draw(){
        System.out.println("Star.draw()");
    };
    @Override
    public void erase(){
        System.out.println("Star.erase()");
    };
    @Override
    public void show() {
        System.out.println("Star.show()");
        System.out.println(this);
        System.out.println();
    }
    @Override
    public String toString() {
        return "Star{}";
    }
}