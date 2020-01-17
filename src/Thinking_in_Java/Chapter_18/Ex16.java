package Thinking_in_Java.Chapter_18;

import java.io.*;

public class Ex16 {
}

class UsingRandomAccessFile {
    static String file = "rtest.dat";
    static void display() throws IOException {
        RandomAccessFile rf = new RandomAccessFile(file, "r");
        for(int i = 0; i < 7; i++)
            System.out.println(
                    "Value " + i + ": " + rf.readDouble());

        System.out.println(rf.readUTF());
        System.out.println(rf.readBoolean());
        System.out.println(rf.readByte());
        System.out.println(rf.readUnsignedByte());
        System.out.println(rf.readChar());
        System.out.println(rf.readFloat());
        System.out.println(rf.readInt());
        System.out.println(rf.readLong());
        System.out.println(rf.readShort());
        System.out.println(rf.readUnsignedShort());
        System.out.println(rf.readUTF());
        rf.close();
    }
    public static void main(String[] args)
            throws IOException {
        RandomAccessFile rf = new RandomAccessFile(file, "rw");
        for(int i = 0; i < 7; i++)
            rf.writeDouble(i*1.414);

        rf.writeUTF("Square root of 2");
        rf.writeBoolean(true);
        rf.writeByte(11);
        rf.writeByte(255);
        rf.writeChar('R');
        rf.writeFloat(0.56f);
        rf.writeInt(11);
        rf.writeLong(100L);
        rf.writeShort(11);
        rf.writeShort(65535);
        rf.writeUTF("The end of the file");
        rf.close();
        display();
        rf = new RandomAccessFile(file, "rw");
        rf.seek(5*8);
        rf.writeDouble(47.0001);
        rf.close();
        display();
    }
}