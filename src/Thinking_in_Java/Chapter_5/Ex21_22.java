package Thinking_in_Java.Chapter_5;

public class Ex21_22 {
    enum PaperMany{
        RUBLES, EURO, DOLLAR, YEN, YUAN, POUND
    }
    public static void main(String[] args) {
        for (PaperMany pm: PaperMany.values()){
            System.out.println(pm + ", ordinal " + pm.ordinal());
            if(pm == PaperMany.RUBLES) {
                switch (pm) {
                    case RUBLES:
                        System.out.println("Russia many");
                        break;
                    case EURO:
                        System.out.println("Europe many");
                        break;
                    case DOLLAR:
                        System.out.println("American many");
                        break;
                    case YUAN:
                        System.out.println("Nippon many");
                        break;
                    case YEN:
                        System.out.println("China many");
                        break;
                    case POUND:
                        System.out.println("United Kingdom many");
                        break;
                    default:
                        break;
                }
            }
        }
    }
}
/* enum PaperMany{
    RUBLES, EURO, DOLLAR, YEN, YUAN, POUND
} // можно и тут
*/