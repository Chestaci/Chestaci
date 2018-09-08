package Thinking_in_Java.Chapter_10;

public class Ex21 {
}

interface U{
    void one();
    void two();
    void three();
}

class Aa{
    U uuu(){
        return new U() {

            @Override
            public void one() {
                System.out.println("one()");
            }

            @Override
            public void two() {
                System.out.println("two()");
            }

            @Override
            public void three() {
                System.out.println("three()");
            }
        };
    }
}

class Bb {
    private U[] uMassive = new U[10];

    void method1(U u) {
        int i = 0;
        if (i < uMassive.length) {
            while ((uMassive[i] != null)) {
                i++;
            }
            uMassive[i] = u;
        } else {
            System.out.println("Error");
        }


    }
    void method2(int i) {
        if((i < uMassive.length) && (i >= 0)){
            uMassive[i] = null;
        }else {
            System.out.println("Error");
        }
    }

    void method3(){
        for (int i = 0; i < uMassive.length; i++){
            if(uMassive[i] != null){
                System.out.println("Запускаются методы объекта находящегося в ячейке uMassive[" + i + "]");
                uMassive[i].one();
                uMassive[i].two();
                uMassive[i].three();
            }
        }
    }

    public static void main(String[] args) {

        Aa a1 = new Aa();
        Aa a2 = new Aa();
        Aa a3 = new Aa();
        Aa a4 = new Aa();
        Aa a5 = new Aa();
        Aa a6 = new Aa();
        Aa a7 = new Aa();
        Aa a8 = new Aa();
        Aa a9 = new Aa();
        Aa a10 = new Aa();

        Bb bb = new Bb();
        bb.method1(a1.uuu());
        bb.method1(a2.uuu());
        bb.method1(a3.uuu());
        bb.method1(a4.uuu());
        bb.method1(a5.uuu());
        bb.method1(a6.uuu());
        bb.method1(a7.uuu());
        bb.method1(a8.uuu());
        bb.method1(a9.uuu());
        bb.method1(a10.uuu());

        bb.method3();

        bb.method2(5);

        bb.method3();

    }
}