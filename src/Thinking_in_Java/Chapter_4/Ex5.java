package Thinking_in_Java.Chapter_4;

public class Ex5 {
    static void binaryPrint (int q) {
            if(q == 0) System.out.print(0);
            else {
                int nlz = Integer.numberOfLeadingZeros(q);
                q <<= nlz;
                for(int p = 0; p < 32 - nlz; p++) {
                    int n = (Integer.numberOfLeadingZeros(q) == 0) ? 1 : 0;
                    System.out.print(n);
                    q <<= 1;
                }
            }
            System.out.println("");
    }
    public static void main(String[] args) {


        int bByte = 0b01010101;
        int sByte = 0b10101010;
        System.out.println(bByte);
        System.out.println(sByte);
        System.out.println("bByte = 01010101" + "\n" + "sByte = 10101010");

        System.out.println("Использование метода Integer.toBinaryString()");
        System.out.println("bByte = " + Integer.toBinaryString(bByte));
        System.out.println("sByte = " + Integer.toBinaryString(sByte));
        System.out.println("bByte &(И) sByte = " + Integer.toBinaryString(bByte & sByte));
        System.out.println("bByte |(ИЛИ) sByte  = " + Integer.toBinaryString(bByte | sByte));
        System.out.println("bByte ^(XOR, ИСКЛЮЧАЮЩЕЕ ИЛИ) sByte = " + Integer.toBinaryString(bByte ^ sByte));
        System.out.println("~(НЕ) bByte = " + Integer.toBinaryString(~bByte));
        System.out.println("~(НЕ) sByte = " + Integer.toBinaryString(~sByte));


        System.out.println("Использование метода binaryPrint()");
        System.out.print("bByte = ");
        binaryPrint(bByte);
        System.out.print("sByte = ");
        binaryPrint(sByte);
        System.out.print("bByte &(И) sByte = ");
        binaryPrint(bByte & sByte);
        System.out.print("bByte |(ИЛИ) sByte  = ");
        binaryPrint(bByte | sByte);
        System.out.print("bByte ^(XOR, ИСКЛЮЧАЮЩЕЕ ИЛИ) sByte = ");
        binaryPrint(bByte ^ sByte);
        System.out.print("~(НЕ) bByte = ");
        binaryPrint(~bByte);
        System.out.print("~(НЕ) sByte = ");
        binaryPrint(~sByte);
    }
}
