package Thinking_in_Java.Chapter_2;

public class Ex11 {
    public static void main(String[] args) {
        AllTheColorOfRainbow acr = new AllTheColorOfRainbow();
        acr.changeTheHueOfTheColor(7);
        System.out.println(acr.anIntegerRepresentingColors);
        acr.changeTheHueOfTheColor(3);
        System.out.println(acr.anIntegerRepresentingColors);
    }
}

class AllTheColorOfRainbow{
    int anIntegerRepresentingColors = 0;
    void changeTheHueOfTheColor(int newHue){
        anIntegerRepresentingColors = anIntegerRepresentingColors + newHue;
    }
}