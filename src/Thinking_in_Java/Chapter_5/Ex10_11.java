package Thinking_in_Java.Chapter_5;

public class Ex10_11 {
    public static void main(String[] args) {


    Test t = new Test();
    Test t2 = new Test();
    Test t3 = new Test();
    t2 = t3;
    t3 = t;
    t = null;
    t2 = null;
    t3 = null;
    System.out.println(t);
    System.out.println(t2);
    System.out.println(t3);

    System.gc();

//        Test test = new Test(true);
//       // test.fin();
//        new Test(true);
//        new Test();
//        Runtime.getRuntime().gc();
//        new Test();
//        new Test();
//        System.runFinalization();
//        Runtime.getRuntime().runFinalization();

//        System.gc();
//        System.gc();

    }
}

class Test{
//    boolean b = false;
//
//    void fin(){
//        b = false;
//    }
//
//    Test(boolean b){
//        this.b = b;
//    }

    protected void finalize() throws Throwable {

//        if(this.b){
//            System.out.println("Ошибка завершения");
//            System.out.println("Cработал метод финализации");
//
//        }

           System.out.println("Ошибка завершения");
           System.out.println("Cработал метод финализации");
           //  super.finalize();
    }
}