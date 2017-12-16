package Chestaci.Array.KonskiyMassive.KM1;

import java.util.ArrayList;

public class Horse {
    private int i = 0;
    private int j = 0;
    private int num = 1;
    private int size;

    private HorseField hfh;

    private ArrayList<VarStepHorse> var = new ArrayList<VarStepHorse>();
    private ArrayList<VarStepHorse> varFinish = new ArrayList<VarStepHorse>();

    static int[] vSx = {2, 2, 1, -1, -2, -2, -1, 1};
    static int[] vSy = {-1, 1, 2, 2, 1, -1, -2, -2};

    public Horse(int i, int j, int size) {
        this.i = i;
        this.j = j;
        this.size = size;
        hfh = new HorseField(size);
        int[][] p = hfh.getArr();
        p[i][j] = num;
    }

    public void forward() {

        var.clear();
        varFinish.clear();
        int e = this.j;
        int f = this.i;
        int[] pVsX = new int[8];
        System.arraycopy(vSx, 0, pVsX, 0, 8);
        int[] pVsY = new int[8];
        System.arraycopy(vSy, 0, pVsY, 0, 8);
        for (int i = 0; i < 8; i++) {
            pVsX[i] = pVsX[i] + e;
            pVsY[i] = pVsY[i] + f;
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

        for (VarStepHorse q : var) {
            int x = q.getX();
            int y = q.getY();
            int[] pVsFX = new int[8];
            System.arraycopy(vSx, 0, pVsFX, 0, 8);
            int[] pVsFY = new int[8];
            System.arraycopy(vSy, 0, pVsFY, 0, 8);
            int yt = 0;
            for (int r = 0; r < 8; r++) {
                int met = 0;
                pVsFX[r] = pVsFX[r] + x;
                pVsFY[r] = pVsFY[r] + y;
                for (int g = 0; g < 8; g++) {
                    int xxx = pVsFX[g];
                    int yyy = pVsFY[g];
                    if ((xxx < size) && (yyy < size) && (xxx >= 0) && (yyy >= 0)) {
                        int era = t[yyy][xxx];
                        if (era == 0) {
                            met++;
                        }
                    }
                }
                yt = met;
            }
            if(yt >= 0) {
                varFinish.add(new VarStepHorse(x, y, yt));
            }
        }

        VarStepHorse[] myArray = {};
        myArray = varFinish.toArray(new VarStepHorse[varFinish.size()]);

        for (int i = 1; i < myArray.length; i++) {
            for (int j = i; (j >= 1) && (myArray[j].getMeter() < myArray[j - 1].getMeter()); j--) {
                VarStepHorse a = myArray[j];
                myArray[j] = myArray[j - 1];
                myArray[j - 1] = a;
            }
        }

        VarStepHorse hj = myArray[0];
        int xNew = hj.getX();
        int yNew = hj.getY();
        t[yNew][xNew] = num + 1;
        j = xNew;
        i = yNew;
        num++;
    }

    public void printArr() {
        for (int[] q : hfh.getArr()) {
            for (int q1 : q) {
                System.out.format("%4d", q1);
            }
            System.out.println();
        }
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Horse{" + "lines = " + i + ", column = " + j + ", текущий ход = " + num + '}';
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }
}
