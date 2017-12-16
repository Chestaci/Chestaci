package Chestaci.Array.KonskiyMassive.KM2;

public class Horse2 {
    private int i = 0;
    private int j = 0;
    private int num = 1;
    private int size;
    int[][] hf;
    int[] d = {8, 0, 0};

    static int[] vSi = {-2, -2, -1, 1, 2, 2, 1, -1};
    static int[] vSj = {-1, 1, 2, 2, 1, -1, -2, -2};

    public Horse2(int i, int j, int size) {
        this.i = i;
        this.j = j;
        this.size = size;
        hf = new int[size][size];
    }

    public void forward() {
        d[0] = 8;
        hf[i][j] = num;
        for (int ii = 0; ii < 8; ii++) {
            if ((0 <= (vSi[ii] + i))&&((vSi[ii] + i) < size)&&(0 <= (vSj[ii] + j))&&((vSj[ii] + j) < size)&&(hf[(vSi[ii] + i)][(vSj[ii] + j)] == 0)&&(CheckStep((vSi[ii] + i), (vSj[ii] + j)) <= d[0])) {
                d[0] = CheckStep((vSi[ii] + i), (vSj[ii] + j));
                d[1] = (vSi[ii] + i);
                d[2] = (vSj[ii] + j);
            }
        }
        i = d[1];
        j = d[2];
        num++;
    }

    public int CheckStep(int i, int j) {
        int met = 0;
        for (int r = 0; r < 8; r++) {
            if ((0 <= (vSi[r] + i))&&((vSi[r] + i) < size)&&(0 <= (vSj[r] + j))&&((vSj[r] + j) < size)&&(hf[(vSi[r] + i)][(vSj[r] + j)] == 0)) {
                met++;
            }
        }
        return met;
    }

    public void printArr() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (hf[i][j] == 0) {
                    System.out.print("   0");
                } else {
                    System.out.format("%4d", hf[i][j]);
                }
            }
            System.out.println();
        }
    }

    public int[][] getHf() {
        return hf;
    }

    public void setHf(int[][] hf) {
        this.hf = hf;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Horse{" + "lines = " + i + ", column = " + j + ", текущий ход = " + num + '}';
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

}
