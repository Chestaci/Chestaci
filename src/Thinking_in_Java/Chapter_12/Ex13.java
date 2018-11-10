package Thinking_in_Java.Chapter_12;

public class Ex13 {
    private static Integer[] integers = new Integer[1];
    void m(int i) throws Except11, Except22, Except33{
        if (i < 0) {throw new Except11("i < 0");}
        if (i == 0) {throw new Except22("i == 0");}
        if (i > 0) {throw new Except33("i > 0");}
    }

    public static void main(String[] args) {
        Ex13 ex13 = new Ex13();
        try{
            ex13.m(integers[0]);
        } catch (Except11 e) {
            e.printStackTrace();
            System.out.println("11");
        } catch (Except22 e) {
            e.printStackTrace();
            System.out.println("22");
        } catch (Except33 e) {
            e.printStackTrace();
            System.out.println("33");
        } finally {
            System.out.println("finally");
        }
    }
}

class Except11 extends Exception{
    public Except11(String s) {
        super(s);
    }
}

class Except22 extends Exception{
    public Except22(String s) {
        super(s);
    }
}

class Except33 extends Exception{
    public Except33(String s) {
        super(s);
    }
}
