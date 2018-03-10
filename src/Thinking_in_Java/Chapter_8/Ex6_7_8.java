package Thinking_in_Java.Chapter_8;

import java.util.Random;

public class Ex6_7_8 {
    public static void main(String[] args) {
        Music3.main(args);
    }
}
//Расширяемая программа
enum Note{
    MIDDLE_C, C_SHARP, B_FLAT;
}

class Instrument{
    void play(Note n){
        System.out.println("Instrument.play() " + n);
    }
//    String what(){
//        return "Instrument";
//    }
    void adjust(){
        System.out.println("Adjusting Instrument");
    }

    @Override
    public String toString() {
        return "Instrument{}";
    }
}

class Keyboard extends Instrument{
    void play(Note n) {
        System.out.println("Keyboard.play() " + n);
    }

    //    String what(){
//        return "Keyboard";
//    }
    @Override
    public String toString() {
        return "Keyboard{}";
    }

    void adjust() {
        System.out.println("Adjusting Keyboard");
    }
}

class Wind extends Instrument {
    void play(Note n) {
        System.out.println("Wind.play() " + n);
    }

    //    String what(){
//        return "Wind";
//    }
    @Override
    public String toString() {
        return "Wind{}";
    }

    void adjust() {
        System.out.println("Adjusting Wind");
    }
}

class Percussion extends Instrument {
    void play(Note n) {
        System.out.println("Percussion.play() " + n);
    }

    //    String what(){
//        return "Percussion";
//    }
    @Override
    public String toString() {
        return "Percussion{}";
    }

    void adjust() {
        System.out.println("Adjusting Percussion");
    }
}

class Stringed extends Instrument {
    void play(Note n) {
        System.out.println("Stringed.play() " + n);
    }

    //    String what(){
//        return "Stringed";
//    }
    @Override
    public String toString() {
        return "Stringed{}";
    }

    void adjust() {
        System.out.println("Adjusting Stringed");
    }
}

class Brass extends Wind {
    void play(Note n) {
        System.out.println("Brass.play() " + n);
    }

    void adjust() {
        System.out.println("Adjusting Brass");
    }

    @Override
    public String toString() {
        return "Brass{}";
    }
}

class Woodwind extends Wind {
    void play(Note n) {
        System.out.println("Woodwind.play() " + n);
    }
//    String what(){
//        return "Adjusting Woodwind";
//    }

    @Override
    public String toString() {
        return "Woodwind{}";
    }
}

class Music3{
    private static RandomInstrumentGenerator gen = new RandomInstrumentGenerator();
    //Работа метода не зависит от фактического типа объекта,
    //поэтому типы, добавленные в систему, будут работать правильно:
    public static void tune(Instrument i){
        //...
        i.play(Note.MIDDLE_C);
    }
    public static void tuneAll(Instrument[] e){
        for(Instrument i : e) {
            tune(i);
        }
    }

    public static void main(String[] args) {
        //Восходящее преобразование при добавлении в массив:
//        Instrument[] orchestra = {new Wind(), new Percussion(), new Stringed(), new Brass(), new Woodwind(), new Keyboard()};
        Instrument[] orchestra = new Instrument[47];

        for(int i = 0; i < orchestra.length; i++){
            orchestra[i] = gen.next();
        }
        //Полиморфные вызовы методов
        tuneAll(orchestra);
        for(Instrument i : orchestra) {
            System.out.println(i.toString());
        }
    }
}

class RandomInstrumentGenerator{
    private Random rand = new Random(47);
    public Instrument next(){
        switch (rand.nextInt(7)){
            default:
            case 0: return new Wind();
            case 1: return new Percussion();
            case 2: return new Stringed();
            case 3: return new Brass();
            case 4: return new Percussion();
            case 5: return new Woodwind();
            case 6: return new Keyboard();

        }
    }
}