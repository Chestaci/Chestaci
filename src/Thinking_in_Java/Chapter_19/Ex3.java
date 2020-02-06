package Thinking_in_Java.Chapter_19;

import net.mindview.util.Enums;

public class Ex3 {
}

class Meal {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            for(Course course : Course.values()) {
                Food food = course.randomSelection();
                System.out.println(food);
            }
            System.out.println("---");
        }
    }
}
