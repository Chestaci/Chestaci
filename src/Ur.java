import java.util.*;

public class Ur {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a, b, c, D;
        double x, x1, x2;
        System.out.println("Введите а: ");
        a = s.nextDouble();
        System.out.println("Введите b: ");
        b = s.nextDouble();
        System.out.println("Введите c: ");
        c = s.nextDouble();
        D = b * b - 4 * a * c;
        if (D > 0) {
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
        }
        else if (D == 0) {
            x = -b / (2 * a);
            System.out.println("Уравнение имеет единственный корень: x = " + x);

        }
        else {
            System.out.println("Уравнение не имеет действительных корней!");
        }
    }


}
