package Thinking_in_Java.Chapter_16;

import java.util.Arrays;

public class Ex19 {
    int i;

    public Ex19(int i) {
        this.i = i;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ex19)) return false;

        Ex19 ex19 = (Ex19) o;

        return i == ex19.i;
    }

    @Override
    public int hashCode() {
        return i;
    }

    @Override
    public String toString() {
        return "Ex19{" + "i=" + i + '}';
    }

    public static void main(String[] args) {
        Ex19[] ex19s = new Ex19[5];
        Ex19[] ex19s1 = new Ex19[5];
        Arrays.fill(ex19s, new Ex19(1));
        Arrays.fill(ex19s1, new Ex19(1));
        System.out.println(Arrays.equals(ex19s, ex19s1));
    }
}
