package Thinking_in_Java.Chapter_16;

import net.mindview.util.ConvertTo;
import net.mindview.util.Generated;
import net.mindview.util.Generator;
import net.mindview.util.RandomGenerator;

import java.util.Arrays;

import static net.mindview.util.Print.print;

public class Ex16 {
}

class TestArrayGeneration {
    public static void main(String[] args) {
        int size = 6;
//        boolean[] a1 = ConvertTo.primitive(Generated.array(
//                Boolean.class, new RandomGenerator.Boolean(), size));
//        print("a1 = " + Arrays.toString(a1));
//        byte[] a2 = ConvertTo.primitive(Generated.array(
//                Byte.class, new RandomGenerator.Byte(), size));
//        print("a2 = " + Arrays.toString(a2));
//        char[] a3 = ConvertTo.primitive(Generated.array(
//                Character.class,
//                new RandomGenerator.Character(), size));
//        print("a3 = " + Arrays.toString(a3));
//        short[] a4 = ConvertTo.primitive(Generated.array(
//                Short.class, new RandomGenerator.Short(), size));
//        print("a4 = " + Arrays.toString(a4));
//        int[] a5 = ConvertTo.primitive(Generated.array(
//                Integer.class, new RandomGenerator.Integer(), size));
//        print("a5 = " + Arrays.toString(a5));
//        long[] a6 = ConvertTo.primitive(Generated.array(
//                Long.class, new RandomGenerator.Long(), size));
//        print("a6 = " + Arrays.toString(a6));
//        float[] a7 = ConvertTo.primitive(Generated.array(
//                Float.class, new RandomGenerator.Float(), size));
//        print("a7 = " + Arrays.toString(a7));
//        double[] a8 = ConvertTo.primitive(Generated.array(
//                Double.class, new RandomGenerator.Double(), size));
//        print("a8 = " + Arrays.toString(a8));

        boolean[] a1 = ConvertTo.primitive(Generated.array(
                Boolean.class, new SkipGenerator.Boolean(true), size));
        print("a1 = " + Arrays.toString(a1));
        byte[] a2 = ConvertTo.primitive(Generated.array(
                Byte.class, new SkipGenerator.Byte((byte)5), size));
        print("a2 = " + Arrays.toString(a2));
        char[] a3 = ConvertTo.primitive(Generated.array(
                Character.class,
                new SkipGenerator.Character(5), size));
        print("a3 = " + Arrays.toString(a3));
        short[] a4 = ConvertTo.primitive(Generated.array(
                Short.class, new SkipGenerator.Short( (short)5), size));
        print("a4 = " + Arrays.toString(a4));
        int[] a5 = ConvertTo.primitive(Generated.array(
                Integer.class, new SkipGenerator.Integer(5), size));
        print("a5 = " + Arrays.toString(a5));
        long[] a6 = ConvertTo.primitive(Generated.array(
                Long.class, new SkipGenerator.Long(5L), size));
        print("a6 = " + Arrays.toString(a6));
        float[] a7 = ConvertTo.primitive(Generated.array(
                Float.class, new SkipGenerator.Float(5f), size));
        print("a7 = " + Arrays.toString(a7));
        double[] a8 = ConvertTo.primitive(Generated.array(
                Double.class, new SkipGenerator.Double(5.0), size));
        print("a8 = " + Arrays.toString(a8));
    }
}

class SkipGenerator {
    public static class
    Boolean implements Generator<java.lang.Boolean> {
        public Boolean(boolean value) {
            this.step = value;
        }

        private boolean value = false;
        private boolean step;
        public java.lang.Boolean next() {
            value = step ? !value : value;
            return value;
        }
    }

    public static class
    Byte implements Generator<java.lang.Byte> {
        private byte value = 0;
        private byte step;

        public Byte(byte step) {
            this.step = step;
        }

        public java.lang.Byte next() {
            byte old = value;
            value += step;
            return old;
        }
    }

    static char[] chars = ("abcdefghijklmnopqrstuvwxyz" +
            "ABCDEFGHIJKLMNOPQRSTUVWXYZ").toCharArray();
    public static class
    Character implements Generator<java.lang.Character> {
        int index;
        private int step;
        public Character(int step) { this.step = step; }
        public java.lang.Character next() {
            char oldValue = chars[index];
            index = (index + step) % chars.length;
            return oldValue;
        }
    }

    public static class
    String implements Generator<java.lang.String> {
        private int length;
        Generator<java.lang.Character> cg;
        public String(int step) { this(step, 7); }
        public String(int step, int length) {
            this.length = length;
            cg = new Character(step);
        }
        public java.lang.String next() {
            char[] buf = new char[length];
            for(int i = 0; i < length; i++)
                buf[i] = cg.next();
            return new java.lang.String(buf);
        }
    }

    public static class
    Short implements Generator<java.lang.Short> {
        private short value = 0;
        private short step;

        public Short(short step) {
            this.step = step;
        }

        public java.lang.Short next() {
            short old = value;
            value += step;
            return old;
        }
    }

    public static class
    Integer implements Generator<java.lang.Integer> {
        private int value = 0;
        private int step;

        public Integer(int step) {
            this.step = step;
        }

        public java.lang.Integer next() {
            int old = value;
            value += step;
            return old;
        }
    }

    public static class
    Long implements Generator<java.lang.Long> {
        private long value = 0;
        private long step;

        public Long(long step) {
            this.step = step;
        }

        public java.lang.Long next() {
            long old = value;
            value += step;
            return old;
        }
    }

    public static class
    Float implements Generator<java.lang.Float> {
        private float value = 0;
        private float step;

        public Float(float step) {
            this.step = step;
        }

        public java.lang.Float next() {
            float old = value;
            value += step;
            return old;
        }
    }
    public static class
    Double implements Generator<java.lang.Double> {
        private double value = 0.0;
        private double step;

        public Double(double step) {
            this.step = step;
        }

        public java.lang.Double next() {
            double old = value;
            value += step;
            return old;
        }
    }
}