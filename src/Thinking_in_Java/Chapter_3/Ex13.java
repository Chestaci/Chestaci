package Thinking_in_Java.Chapter_3;

public class Ex13 {
    public static void main(String[] args) {
        char i1 = '#';
        printBinaryChar("#", i1);
        char i2 = '@';
        printBinaryChar("@", i2);
        char i3 = '$';
        printBinaryChar("$", i3);
        char i4 = '%';
        printBinaryChar("%", i4);
        char i5 = '&';
        printBinaryChar("&", i5);

    }
    static void printBinaryChar(String s, char c){
        System.out.println(s + ", char: " + c + ", двоичное: \n " + Integer.toBinaryString(c));
    }
}
