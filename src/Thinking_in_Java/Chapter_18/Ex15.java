package Thinking_in_Java.Chapter_18;

import java.io.*;

public class Ex15 {
}


class StoringAndRecoveringData {
    public static void main(String[] args)
            throws IOException {
        DataOutputStream out = new DataOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream("src/Thinking_in_Java/Chapter_18/Data.txt")));
        out.writeDouble(3.14159);
        out.writeUTF("That was pi");
        out.writeDouble(1.41413);
        out.writeUTF("Square root of 2");
        out.writeBoolean(true);
        out.writeByte(11);
        out.writeByte(255);
        out.writeChar('R');
        out.writeFloat(0.56f);
        out.writeInt(11);
        out.writeLong(100L);
        out.writeShort(11);
        out.writeShort(65535);
        out.close();
        DataInputStream in = new DataInputStream(
        new BufferedInputStream(
                new FileInputStream("src/Thinking_in_Java/Chapter_18/Data.txt")));
        System.out.println(in.readDouble());
// Only readUTF() will recover the
// Java-UTF String properly:
        System.out.println(in.readUTF());
        System.out.println(in.readDouble());
        System.out.println(in.readUTF());
        System.out.println(in.readBoolean());
        System.out.println(in.readByte());
        System.out.println(in.readUnsignedByte());
        System.out.println(in.readChar());
        System.out.println(in.readFloat());
        System.out.println(in.readInt());
        System.out.println(in.readLong());
        System.out.println(in.readShort());
        System.out.println(in.readUnsignedShort());
    }
}