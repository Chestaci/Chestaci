package Thinking_in_Java.Chapter_12;

public class Ex9 {
    void m(int i) throws Except1, Except2, Except3{
        if (i < 0) {throw new Except1("i < 0");}
        if (i == 0) {throw new Except2("i == 0");}
        if (i > 0) {throw new Except3("i > 0");}
    }

    public static void main(String[] args) {
        Ex9 ex9 = new Ex9();
        try{
            ex9.m(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Except111 extends Exception{
    public Except111(String s) {
        super(s);
    }
}

class Except211 extends Exception{
    public Except211(String s) {
        super(s);
    }
}

class Except311 extends Exception{
    public Except311(String s) {
        super(s);
    }
}