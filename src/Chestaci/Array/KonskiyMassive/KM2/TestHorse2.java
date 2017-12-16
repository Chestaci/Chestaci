package Chestaci.Array.KonskiyMassive.KM2;

public class TestHorse2 {
    public static void main(String[] args) {
        Horse2 horse = new Horse2(0, 0, 5);

        for (int i = (horse.getSize()*horse.getSize()); i > 0; i-- ){
        System.out.println(horse.toString());
        horse.forward();
        horse.printArr();
        System.out.println();}
    }
}
