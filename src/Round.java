import java.math.BigDecimal;
import java.util.Scanner;

public class Round {
    public static void main(String[] args) {
        double num;
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число: ");
        num = s.nextDouble();
        BigDecimal newnum = new BigDecimal(num);
        newnum = newnum.setScale(3, BigDecimal.ROUND_HALF_UP);

        System.out.println("Округлённое число: " + newnum.doubleValue() );
    }

}