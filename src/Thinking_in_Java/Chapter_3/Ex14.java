package Thinking_in_Java.Chapter_3;

public class Ex14 {
    void f(boolean b){
        if (b == true){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
    void stringTest(String x, String y){
        // Арифметические операции
//        x = x * y;
//        x = x / y;
//        x = x % y;
        x = x + y;
        System.out.println(x);
//        x = x - y;
//        x++;
//        x--;
//        x = +y;
//        x = -y;
        // Операции сравнения и логические операци
//        f(x > y);
//        f(x >= y);
//        f(x < y);
//        f(x <= y);
        f(x == y);
        f(x.equals(y));
        f(y.equals(x));
        f(x != y);
//        f(!x);
//        f(x && y);
//        f(x || y);
        // Поразрядные операции
//        x = ~y;
//        x = x & y;
//        x = x | y;
//        x = x ^ y;
//        x = x << 1;
//        x = x >> 1;
//        x = x >>> 1;
        // Совмещенное присваивание
        x += y;
        System.out.println(x);
//        x -= y;
//        x *= y;
//        x /= y;
//        x %= y;
//        x <<= y;
//        x >>= y;
//        x >>>= y;
//        x &= y;
//        x ^= y;
//        x |= y;
        // Приведение
//        boolean b = (boolean)x;
//        char c = (char)x;
//        byte c = (byte)x;
//        short c = (short)x;
//        int c = (int)x;
//        float c = (float)x;
//        double c = (double)x;
    }

    public static void main(String[] args) {
        Ex14 q = new Ex14();
        q.stringTest("Привет", "Привет");
        System.out.println();
        q.stringTest("Mr.White ", "TEA!");
        String s = new String("=)");
        System.out.println();
        q.stringTest(s,s);

    }
}
