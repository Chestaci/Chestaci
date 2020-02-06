package Thinking_in_Java.Chapter_19;

import static Thinking_in_Java.Chapter_19.Signal.*;
import static net.mindview.util.Print.print;

public class Ex1 {
}


class TrafficLight {

    Signal color = RED;

    public void change() {
        switch (color) {
// Note that you don’t have to say Signal.RED
// in the case statement:
            case RED:
                color = GREEN;
                break;
            case GREEN:
                color = YELLOW;
                break;
            case YELLOW:
                color = RED;
                break;
        }
    }
    public String toString() {
        return "The traffic light is " + color;
    }
    public static void main(String[] args) {
        TrafficLight t = new TrafficLight();
        for(int i = 0; i < 7; i++) {
            print(t);
            t.change();
        }
    }
}
