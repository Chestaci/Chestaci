package Thinking_in_Java.Chapter_5;

public class Ex5_6_Dog {
    String name;

    public Ex5_6_Dog(String name) {
        this.name = name;
    }

    void bark(){
        System.out.println(name + " внезапно заговорил человеческим языком!" + "\n" + name + " говорит: ''Слышь! Есть чё? Колбаски бы... Или косточки!..''");
    }
    void bark(char c){
        System.out.println(name + " скулит!");
    }
    void bark(byte b){
        System.out.println(name + " воет!");
    }
    void bark(short s){
        System.out.println(name + " лает!");
    }
    void bark(int i){
        System.out.println(name + " завывает!");
    }
    void bark(long l){
        System.out.println(name + " гавкает!");
    }
    void bark(float f){
        System.out.println(name + " рычит!");
    }
    void bark(double d){
        System.out.println(name + " тяфкает!");
    }
    void bark(int r, String s){
        System.out.println(name + " издал звук: Rrrrrwaff " + r + " раз" + ", а хозяин " + name + "а на это ответил - " + s + "!");
    }
    void bark(String s, int r ){
        System.out.println("Хозяин " + name + "а сказал " + s + ", а " + name + " на это ответил Rrrrrwaff " + r + " раз " + ".");
    }

    public static void main(String[] args) {
        Ex5_6_Dog dog = new Ex5_6_Dog("Бобик");
        char c = 'd';
        byte b = (byte)1;
        short s = (short)1;
        int i = 1;
        long l = 1L;
        float f = 1.0f;
        double d = 1.0;

        dog.bark();
        dog.bark(c);
        dog.bark(b);
        dog.bark(s);
        dog.bark(i);
        dog.bark(l);
        dog.bark(f);
        dog.bark(d);
        dog.bark(5,"Параллелепипед");
        dog.bark("Vingardium leveosa", 8);

    }
}
