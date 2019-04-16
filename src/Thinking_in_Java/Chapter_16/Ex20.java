package Thinking_in_Java.Chapter_16;

import java.util.Arrays;

public class Ex20 {
    int i;

    public Ex20(int i) {
        this.i = i;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ex20)) return false;

        Ex20 ex20 = (Ex20) o;

        return i == ex20.i;
    }

    @Override
    public int hashCode() {
        return i;
    }

    public static void main(String[] args) {
        Ex20[][] ex20s = new Ex20[5][5];
        Ex20[][] ex20s1 = new Ex20[5][5];
        for(int i = 0; i < ex20s.length; i++){
            Arrays.fill(ex20s[i], new Ex20(1));
        }
        for(int i = 0; i < ex20s.length; i++){
            Arrays.fill(ex20s1[i], new Ex20(1));
        }
        System.out.println(Arrays.deepEquals(ex20s, ex20s1));
    }
}
