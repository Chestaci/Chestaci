package Chestaci.Array.KonskiyMassive;

public class HorseField {
    private int size;
    int[][] arr;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int[][] getArr() {
        return arr;
    }

    public HorseField(int size) {
        this.size = size;
        arr = new int[getSize()][getSize()];
    }

//    public void printArr() {
//        for (int[] q: arr) {
//            for (int q1 : q) {
//                System.out.format("%4d", q1);
//            }
//            System.out.println();
//        }
//
//    }
}
