import java.math.BigDecimal;

public class ArrayUtils {

    int[] arr;

    ArrayUtils(int[] arr) {
        this.arr = arr;
    }

    public int Min() {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i])
                min = arr[i];

        }
        return min;

    }
    public int Max() {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];

        }
        return max;
    }

    public BigDecimal Average() {
        double sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
        }
        double average = sum / arr.length;
        BigDecimal newaverage = new BigDecimal(average);
        newaverage = newaverage.setScale(2, BigDecimal.ROUND_HALF_UP);
        return newaverage;
    }
}