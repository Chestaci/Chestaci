package Thinking_in_Java.Chapter_12;

class VeryImportantException1 extends Exception {
    public String toString() {
        return "A very important exception!";
    }
}

class HoHumException1 extends Exception {
    public String toString() {
        return "A trivial exception";
    }
}

public class LostMessage19 {
    void f() throws VeryImportantException1 {
        throw new VeryImportantException1();
    }
    void dispose() throws HoHumException1 {
        throw new HoHumException1();
    }

    public static void main(String[] args) {
        try {
            LostMessage19 lm = new LostMessage19();
            try {
                    lm.f();
                }catch(Exception e) {
                System.out.println(e);
            } finally {
                lm.dispose();
                }
            } catch(Exception e) {
                System.out.println(e);
            }

    }
}

