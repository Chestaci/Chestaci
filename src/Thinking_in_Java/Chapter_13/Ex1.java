package Thinking_in_Java.Chapter_13;

public class Ex1 {
    public static void main(String[] args) {
        SprinklerSystem sprinklers = new SprinklerSystem();
        System.out.println(sprinklers);
    }
}

class WaterSource{
    private String s;

    public WaterSource() {
        System.out.println("WaterSource()");
        s = "сконструирован";
    }

    public String toString() {
        return s;
    }
}

class SprinklerSystem{
    private String valve1, valve2, valve3, valve4;
    private WaterSource source = new WaterSource();
    private int i;
    private float f;

    public String toString() {
//        StringBuilder result = new StringBuilder();
//        String a = " ";
//        result.append("valve1 = ");
//        result.append(valve1);
//        result.append(a);
//        result.append("valve2 = ");
//        result.append(valve2);
//        result.append(a);
//        result.append("valve3 = ");
//        result.append(valve3);
//        result.append(a);
//        result.append("valve4 = ");
//        result.append(valve4);
//        result.append("\n");
//        result.append("i = ");
//        result.append(i);
//        result.append(a);
//        result.append("f = ");
//        result.append(f);
//        result.append(a);
//        result.append("source = ");
//        result.append(source);
//        return result.toString();

        return
                "valve1 = " + valve1 + " " +
                "valve2 = " + valve2 + " " +
                "valve3 = " + valve3 + " " +
                "valve4 = " + valve4 + "\n" +
                "i = " + i + " " + "f = " + f + " " +
                "source = " + source;
    }
}