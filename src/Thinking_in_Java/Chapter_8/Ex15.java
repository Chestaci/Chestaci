package Thinking_in_Java.Chapter_8;

public class Ex15 {
    public static void main(String[] args) {
        PolyConstructors.main(args);
    }
}

class Glyph{
    void draw(){
        System.out.println("Glyph.draw()");
    }

    public Glyph() {
        System.out.println("Glyph() перед вызовом draw()");
        draw();
        System.out.println("Glyph() после вызова draw()");
    }
}

class RoundGlyph extends Glyph{
    private int radius = 1;

    public RoundGlyph(int radius) {
        this.radius = radius;
        System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
    }
    void draw(){
        System.out.println("RoundGlyph.draw(), radius = " + radius);
    }
}

class RectangularGlyph extends Glyph{
    private int sideA = 2;
    private int sideB = 3;

    public RectangularGlyph(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
        System.out.println("RectangularGlyph.RectangularGlyph(), sideA = " + sideA + ", sideB = " + sideB);
    }
    void draw(){
        System.out.println("RectangularGlyph.draw(), sideA = " + sideA + ", sideB = " + sideB);
    }
}

class PolyConstructors{
    public static void main(String[] args) {
        new RoundGlyph(5);
        new RectangularGlyph(1,2);
    }
}