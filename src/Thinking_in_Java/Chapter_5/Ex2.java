package Thinking_in_Java.Chapter_5;

public class Ex2 {
    String sIni = "Инициализация в точке определения";
    String sCon;
//    String sCre;
//    String sDef;

//    Ex2(String sCre){
//        this.sCre = sCre;
//        sCon = "Инициализация в конструкторе";
//    }

    Ex2(){
        sCon = "Инициализация в конструкторе";
    };

    public static void main(String[] args) {

//        Ex2 ex2 = new Ex2("Инициализация при создании объекта");
//        System.out.println("sIni: " + ex2.sIni + "\n" + "sCre: " + ex2.sCre + "\n" + "sCon: " + ex2.sCon + "\n" + "sDef: " + ex2.sDef);
//        System.out.println();
//        Ex2 ex21 = new Ex2();
//        System.out.println("sIni: " + ex21.sIni + "\n" + "sCre: " + ex21.sCre + "\n" + "sCon: " + ex21.sCon + "\n" + "sDef: " + ex21.sDef);
        Ex2 q = new Ex2();
        System.out.println("sCon: " + q.sCon + "\n" + "sIni: "+ q.sIni);

    }
}
