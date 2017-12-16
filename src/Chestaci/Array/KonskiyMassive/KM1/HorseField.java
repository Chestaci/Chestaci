package Chestaci.Array.KonskiyMassive.KM1;

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
        arr = new int[size][size];
    }
}
