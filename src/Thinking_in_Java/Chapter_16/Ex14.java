package Thinking_in_Java.Chapter_16;

import net.mindview.util.ConvertTo;
import net.mindview.util.CountingGenerator;
import net.mindview.util.Generated;
import net.mindview.util.Generator;

import java.lang.reflect.Array;
import java.util.Arrays;

import static net.mindview.util.Print.print;

public class Ex14 {
    public static void main(String[] args) {
        int [] ints;
        ints = ConvertTo.primitive(Generated.array(Integer.class, new CountingGenerator.Integer(), 10));
        System.out.println(Arrays.toString(ints));

        double [] doubles;
        doubles = ConvertTo.primitive(Generated.array(Double.class, new CountingGenerator.Double(), 10));
        System.out.println(Arrays.toString(doubles));

        long [] longs;
        longs = ConvertTo.primitive(Generated.array(Long.class, new CountingGenerator.Long(), 10));
        System.out.println(Arrays.toString(longs));

        short [] shorts;
        shorts = ConvertTo.primitive(Generated.array(Short.class, new CountingGenerator.Short(), 10));
        System.out.println(Arrays.toString(shorts));

        float [] floats;
        floats = ConvertTo.primitive(Generated.array(Float.class, new CountingGenerator.Float(), 10));
        System.out.println(Arrays.toString(floats));

        byte [] bytes;
        bytes = ConvertTo.primitive(Generated.array(Byte.class, new CountingGenerator.Byte(), 10));
        System.out.println(Arrays.toString(bytes));

        boolean [] booleans;
        booleans = ConvertTo.primitive(Generated.array(Boolean.class, new CountingGenerator.Boolean(), 10));
        System.out.println(Arrays.toString(booleans));

        char [] chars;
        chars = ConvertTo.primitive(Generated.array(Character.class, new CountingGenerator.Character(), 10));
        System.out.println(Arrays.toString(chars));

    }
}

class Fill {
    public static void
    primitive(Object array, Generator<?> gen) {
        int size = Array.getLength(array);
        Class<?> type = array.getClass().getComponentType();
        for(int i = 0; i < size; i++)
            if(type == Boolean.TYPE)
                Array.setBoolean(array, i, (Boolean)gen.next());
            else if (type == Byte.TYPE)
                Array.setByte(array, i, (Byte)gen.next());
            else if (type == Short.TYPE)
                Array.setShort(array, i, (Short)gen.next());
            else if (type == Integer.TYPE)
                Array.setInt(array, i, (Integer)gen.next());
            else if (type == Character.TYPE)
                Array.setChar(array, i, (Character)gen.next());
            else if (type == Float.TYPE)
                Array.setFloat(array, i, (Float)gen.next());
            else if (type == Double.TYPE)
                Array.setDouble(array, i, (Double)gen.next());
            else if (type == Long.TYPE)
                Array.setLong(array, i, (Long)gen.next());
    }
}

class E14_PrimitiveArraysFill {
    public static void main(String[] args) {
        int size = 6;
// First create all primitive arrays
        boolean[] a1 = new boolean[size];
        byte[] a2 = new byte[size];
        char[] a3 = new char[size];
        short[] a4 = new short[size];
        int[] a5 = new int[size];
        long[] a6 = new long[size];
        float[] a7 = new float[size];
        double[] a8 = new double[size];
// Now fill them using a matching generator
        Fill.primitive(a1, new CountingGenerator.Boolean());
        print("a1 = " + Arrays.toString(a1));
        Fill.primitive(a2, new CountingGenerator.Byte());
        print("a2 = " + Arrays.toString(a2));
        Fill.primitive(a3, new CountingGenerator.Character());
        print("a3 = " + Arrays.toString(a3));
        Fill.primitive(a4, new CountingGenerator.Short());
        print("a4 = " + Arrays.toString(a4));
        Fill.primitive(a5, new CountingGenerator.Integer());
        print("a5 = " + Arrays.toString(a5));
        Fill.primitive(a6, new CountingGenerator.Long());
        print("a6 = " + Arrays.toString(a6));
        Fill.primitive(a7, new CountingGenerator.Float());
        print("a7 = " + Arrays.toString(a7));
        Fill.primitive(a8, new CountingGenerator.Double());
        print("a8 = " + Arrays.toString(a8));
    }
}