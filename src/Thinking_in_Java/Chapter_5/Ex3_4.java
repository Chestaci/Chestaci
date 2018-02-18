package Thinking_in_Java.Chapter_5;

public class Ex3_4 {
    Ex3_4(){
        System.out.println("Хэллоу, Мистер Вайт! Следуй философии чайного пакетика! =)");
    }
    Ex3_4(String m){
        System.out.println("Хэллоу, " + m + "! Следуй философии чайного пакетика! =) ");
    }

    public static void main(String[] args) {
        Ex3_4 ex34 = new Ex3_4();
        Ex3_4 ex3_4_1 = new Ex3_4("Мистер Вайт");
    }
}
