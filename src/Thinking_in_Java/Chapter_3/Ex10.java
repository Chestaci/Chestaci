package Thinking_in_Java.Chapter_3;

public class Ex10 {
    public static void main(String[] args) {
    long BBYTE = 0b01010101;
    long SBYTE = 0b10101010;
        System.out.println(BBYTE);
        System.out.println(SBYTE);
        System.out.println(Long.toBinaryString(BBYTE));
        System.out.println(Long.toBinaryString(SBYTE));
        System.out.println(Long.toHexString(BBYTE));
        System.out.println(Long.toHexString(SBYTE));
        System.out.println();
        System.out.println("BBYTE = 01010101" + "\n" + "SBYTE = 10101010");
        System.out.println("BBYTE &(И) SBYTE = " + Long.toBinaryString(BBYTE & SBYTE));
        System.out.println("BBYTE |(ИЛИ) SBYTE  = " + Long.toBinaryString(BBYTE | SBYTE));
        System.out.println("BBYTE ^(XOR, ИСКЛЮЧАЮЩЕЕ ИЛИ) SBYTE = " + Long.toBinaryString(BBYTE ^ SBYTE));
        System.out.println("~(НЕ) BBYTE = " + Long.toBinaryString(~BBYTE));
        System.out.println("~(НЕ) SBYTE = " + Long.toBinaryString(~SBYTE));

}
}
