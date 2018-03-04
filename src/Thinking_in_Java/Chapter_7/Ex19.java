package Thinking_in_Java.Chapter_7;

public class Ex19 {
    private final Tea tea;

    public Ex19() {
        tea = new Tea(5);
    }

    public Ex19(int i) {
        tea = new Tea(i);
    }

    public Ex19(Tea tea) {
        this.tea = tea;
    }

    @Override
    public String toString() {
        return "Ex19{" + "tea=" + tea + '}';
    }

    public static void main(String[] args) {
        Ex19 x1 = new Ex19();
        Ex19 x2 = new Ex19(11);
        Tea teaPinkmans = new Tea(6);
        Ex19 x3 = new Ex19(teaPinkmans);
       // System.out.println(tea);
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);

//        x1.tea = new Tea(1);
//        x2.tea = new Tea(7);
    }
}

class Tea {
    private int i;

    @Override
    public String toString() {
        return "Tea{" + "i=" + i + '}';
    }

    public Tea(int i) {
        this.i = i;
    }
}