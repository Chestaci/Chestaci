package Thinking_in_Java.Chapter_9;

public class Ex11 {
    public static void main(String[] args) {
        String s = "иМтсреW ihetо ечьнл бютич йа!!!";
        Apply.process(new SwapCharAdapter(new SwapChar()), s);
    }
}

interface Processor{
    String name();
    Object process(Object input);
}

class Apply{
    public static void process(Processor p, Object s){
        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(s));
    }
}

class SwapChar{
    public String name() {
        return getClass().getSimpleName();
    }
    public String swap(String s){
        char[]string = s.toCharArray();
        int i1 = 0;
        int i2 = 1;
        int c = 0;
        while (c++ < string.length) {
            if ((i1 < string.length)&&(i2 < string.length)) {
                char t = string[i1];
                string[i1] = string[i2];
                string[i2] = t;
                i1 += 2;
                i2 += 2;
            }
        }
//        for (char q: string)
//            String s1 += q;
        return new String(string);
    }

    public static void main(String[] args) {
        SwapChar swapChar = new SwapChar();
        System.out.println(swapChar.swap("иМтсреW ihetл бютич йа!"));
        System.out.println(swapChar.swap("иМтсреW ihetо ечьнл бютич йа!!!"));

    }
}

class SwapCharAdapter implements Processor{
    SwapChar swapChar;

    public SwapCharAdapter(SwapChar swapChar) {
        this.swapChar = swapChar;
    }

    @Override
    public String name() {
        return swapChar.name();
    }

    @Override
    public String process(Object input) {
        return swapChar.swap((String) input);
    }
}