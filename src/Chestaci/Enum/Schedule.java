package Chestaci.Enum;

public class Schedule {
    public enum Month {
        JANUARY ("Январь"), FEBRUARY ("Февраль"), MARCH ("Март"),
        APRIL ("Апрель"), MAY ("Май"), JUNE ("Июнь"),
        JULY ("Июль"), AUGUST ("Август"), SEPTEMBER ("Сентябрь"),
        OCTOBER ("Октябрь"), NOVEMBER ("Ноябрь"), DECEMBER ("Декабрь");

        String value;
        Month(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }
    }


    public static void main(String[] args) {
        Month m = Month.DECEMBER;
        System.out.println(m.toString());
        System.out.println(m);
        System.out.println(Month.DECEMBER);
    }
}
