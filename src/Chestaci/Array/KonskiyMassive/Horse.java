package Chestaci.Array.KonskiyMassive;

import java.util.ArrayList;

public class Horse {
    private int i = 0;
    private int j = 0;
    private int num = 1;
    private int size;
    private HorseField hfh;

    private ArrayList<VarStepHorse> var = new ArrayList<VarStepHorse>();

    public HorseField getHfh() {
        return hfh;
    }

    static int[] vSx = {2, 2, 1, -1, -2, -2, -1, 1};
    static int[] vSy = {-1, 1, 2, 2, 1, -1, -2, -2};

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

    public Horse(int i, int j, int size) {
        this.i = i;
        this.j = j;
        this.size = size;
        hfh = new HorseField(this.size);
        int[][] p = hfh.getArr();
        p[i][j] = num;

    }

    @Override
    public String toString() {
        return "Horse{" + "lines = " + i + ", column = " + j + ", текущий ход = " + num + '}';
    }

    public void forward() {

//        final int iOld = i;
//        final int jOld = j;
        int[] pVsX = new int[8];
        System.arraycopy(vSx, 0, pVsX, 0, 8);
        int[] pVsY = new int[8];
        System.arraycopy(vSy, 0, pVsY, 0, 8);
        for (int i = 0; i < 8; i++) {
            pVsX[i] = pVsX[i] + getJ();
            pVsY[i] = pVsY[i] + getI();

        }
        int[][] t = hfh.getArr();
        for (int i = 0; i < 8; i++) {
            int xx = pVsX[i];
            int yy = pVsY[i];

            if ((xx < size) && (yy < size) && (xx >= 0) && (yy >= 0)) {
                int er = t[yy][xx];
                if (er == 0) {
                    var.add(new VarStepHorse(xx, yy));
                }
            }
        }


        for (int w : pVsX) {
            System.out.format("%4d", w);
        }
        System.out.println();
        for (int w : pVsY) {
            System.out.format("%4d", w);
        }
        System.out.println();


    }

    public void printArr() {
        for (int[] q : hfh.getArr()) {
            for (int q1 : q) {
                System.out.format("%4d", q1);
            }
            System.out.println();
        }
    }

    public ArrayList<VarStepHorse> getVar() {
        return var;
    }
}


