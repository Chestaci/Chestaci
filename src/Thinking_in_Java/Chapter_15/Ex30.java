package Thinking_in_Java.Chapter_15;

public class Ex30 {
    public static void main(String[] args) {
        Holder<Integer> integerHolder = new Holder<>();
        integerHolder.set(1);
        int i = integerHolder.get();
        Holder<Double> doubleHolder = new Holder<>();
        doubleHolder.set(1.1);
        double d = doubleHolder.get();
        Holder<Float> floatHolder = new Holder<>();
        floatHolder.set(0.023f);
        float f = floatHolder.get();
        Holder<Character> characterHolder = new Holder<>();
        characterHolder.set('s');
        char c = characterHolder.get();
        Holder<Long> longHolder = new Holder<>();
        longHolder.set(55L);
        long l = longHolder.get();
        Holder<Byte> byteHolder = new Holder<>();
        byteHolder.set((byte) 1);
        byte b = byteHolder.get();
        Holder<Short> shortHolder = new Holder<>();
        shortHolder.set((short) 55);
        short s = shortHolder.get();
        Holder<Boolean> booleanHolder = new Holder<>();
        booleanHolder.set(true);
        boolean bool = booleanHolder.get();
        System.out.println(i);
        System.out.println(d);
        System.out.println(f);
        System.out.println(c);
        System.out.println(l);
        System.out.println(b);
        System.out.println(s);
        System.out.println(bool);

    }
}
