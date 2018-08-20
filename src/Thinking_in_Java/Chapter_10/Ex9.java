package Thinking_in_Java.Chapter_10;

public interface Ex9 {
    void mpx();
}

class AB {
    Ex9 f() {
        class B implements Ex9 {
            public void mpx() {
                System.out.println("Hello");
            }
        }
        return new B();
    }

    public static void main(String[] args) {
        AB ab = new AB();
        ab.f().mpx();
    }
}