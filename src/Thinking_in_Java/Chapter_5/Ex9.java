package Thinking_in_Java.Chapter_5;

public class Ex9 {
    Ex9(){
        this("Строка", 42);
        System.out.println("Сработал конструктор по умолчанию");
    }
    Ex9(String s, int i){
        this("!");
        System.out.println("Сработал перегруженный конструктор с параметром String: " + s + " и параметром int: " + i);
    }
    Ex9(String d){
        System.out.println("Фиг знает зачем меня вызвали" + d);
    }

    public static void main(String[] args) {
        Ex9 ex9 = new Ex9();
    }
}
