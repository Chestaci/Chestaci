package Thinking_in_Java.Chapter_14;

public class Ex26 {

}
interface Playable{
    void play(Note n);
}

enum Note{
    MIDDLE_C, C_SHARP, B_FLAT;
}

abstract class Instrument{
    private int i;
    public String toString(){return "Instrument";}
    abstract void adjust();
    abstract void prepareInstrument();

}

class Wind extends Instrument implements Playable{
    public void play(Note n){
        System.out.println(this + ".play() " + n);
    }

    @Override
    public String toString() {
        return "Wind";
    }

    public void adjust(){
        System.out.println(this + ".adjust()");
    }

    public void clearSpitValve(){
        System.out.println("Cleared!");
    }

    @Override
   public void prepareInstrument() {
        clearSpitValve();
    }
}

class Percussion extends Instrument implements Playable{
    public void play(Note n){
        System.out.println(this + ".play() " + n);
    }

    @Override
    public String toString() {
        return "Percussion";
    }

    public void adjust(){
        System.out.println(this + ".adjust()");
    }

    @Override
   public void prepareInstrument() {

    }
}

class Stringed extends Instrument implements Playable{
    public void play(Note n){
        System.out.println(this + ".play() " + n);
    }

    @Override
    public String toString() {
        return "Stringed";
    }

    public void adjust(){
        System.out.println(this + ".adjust()");
    }

    @Override
   public void prepareInstrument() {

    }
}

class Brass extends Wind{
    @Override
    public String toString() {
        return "Brass";
    }
}

class Woodwind extends Wind{
    @Override
    public String toString() {
        return "Woodwind";
    }
}

class Music {
    //Работа метода не зависит от фактического типа объекта,
    //поэтому типы, добавленные в систему, будут работать правильно:
    static void tune(Playable i) {
        //...
        i.play(Note.MIDDLE_C);
    }

    static void tuneAll(Instrument[] e) {
        for (Instrument i : e)
            tune((Playable) i);
    }

    public static void main(String[] args) {
        //Восходящее преобразование при добавлении в массив:
        Instrument[] orchestra = {new Wind(), new Percussion(), new Stringed(), new Brass(), new Woodwind()};
        tuneAll(orchestra);
       Instrument b = new Brass();
       b.prepareInstrument();
    }
}