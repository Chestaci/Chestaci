

//ОШИБКА НА САЙТЕ НАДО РАЗБИРАТЬСЯ




package Chestaci.Array;

public class Horse {


        public static void main(String[] args) {

            int size=10;
            int ar[][]=new int[size+4][size+4];
            for (int i1=0; i1<ar.length;i1++){
                for(int j1=0; j1<ar[i1].length; j1++){
      //              if (i1ar.length-3 || j1ar[i1].length-3)
                        ar[i1][j1]=1;
    //                else
                        ar[i1][j1]=0;
                    System.out.format("%4d",ar[i1][j1]);
                }
                System.out.println();
            }

            int i3=0;
            int j3=0;
            int min;
            int m;
            int k=1;
            int i=2;
            int j=2;
            while(k<=size*size){
                ar[i][j]=k;
                min=9;
                m=horse(ar,i+2,j+1);
                if (m<min){
                    i3=i+2;
                    j3=j+1;
                    min=m;
                }
                m=horse(ar,i+1,j+2);
                if (m<min){
                    i3=i+1;
                    j3=j+2;
                    min=m;
                }
                m=horse(ar,i-2,j+1);
                if (m<min){
                    i3=i-2;
                    j3=j+1;
                    min=m;
                }
                m=horse(ar,i-1,j+2);
                if (m<min){
                    i3=i-1;
                    j3=j+2;
                    min=m;
                }
                m=horse(ar,i+2,j-1);
                if (m<min){
                    i3=i+2;
                    j3=j-1;
                    min=m;
                }
                m=horse(ar,i+1,j-2);
                if (m<min){
                    i3=i+1;
                    j3=j-2;
                    min=m;
                }
                m=horse(ar,i-2,j-1);
                if (m<min){
                    i3=i-2;
                    j3=j-1;
                    min=m;
                }
                m=horse(ar,i-1,j-2);
                if (m<min){
                    i3=i-1;
                    j3=j-2;
                    min=m;
                }
                i=i3;
                j=j3;
                k++;
            }
            System.out.println();
            for (int i1=0; i1<ar.length;i1++){
                for(int j1=0; j1<ar[i1].length; j1++){

                    System.out.format("%4d",ar[i1][j1]);
                }
                System.out.println();
            }
        }

        public static int horse (int ar[][],int i, int j){
            int k=0;
            if (ar[i][j]!=0)
                return 9;
            if (ar[i+2][j+1]==0)
                k++;
            if (ar[i+1][j+2]==0)
                k++;
            if (ar[i-2][j+1]==0)
                k++;
            if (ar[i-1][j+2]==0)
                k++;
            if (ar[i+2][j-1]==0)
                k++;
            if (ar[i+1][j-2]==0)
                k++;
            if (ar[i-2][j-1]==0)
                k++;
            if (ar[i-1][j-2]==0)
                k++;
            return k;

    }
}
