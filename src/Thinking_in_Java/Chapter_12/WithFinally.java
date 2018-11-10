package Thinking_in_Java.Chapter_12;

public class WithFinally { /*Ex15*/
    static Switch sw = new Switch();
    static Integer[] x = new Integer[1];

    public static void main(String[] args) {
        try {
            sw.on();
            OnOffSwitch.f(x[0]);
        } catch (OnOffException1 e) {
            System.out.println("1");
        } catch (OnOffException2 e) {
            System.out.println("2");
        } finally {
            sw.off();
        }
    }
}
