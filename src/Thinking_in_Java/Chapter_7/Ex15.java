package Thinking_in_Java.Chapter_7;

import Thinking_in_Java.Chapter_7.Ac7.Ac7;

public class Ex15 extends Ac7 {
    public void p(){
        System.out.println("Я публичный метод объекта Ex15, " +
                "наследника объекта Ас7, " +
                "вызывающий протектед метод объекта Ас7, " +
                "находящегося в пакете Ас7");
        print();
    }
    public static void main(String[] args) {
       Ex15 ex15 = new Ex15();
       ex15.p();
       ex15.print();
    }
}

class Ex15_2{

    public static void main(String[] args) {
        Ac7 ac7_2 = new Ac7();
      //  ac7_2.print(); // Не работает так как print() протектед
    }
}