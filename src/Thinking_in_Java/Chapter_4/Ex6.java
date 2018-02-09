package Thinking_in_Java.Chapter_4;

public class Ex6 {
    public static void main(String[] args) {
        //тест примера
//        for(int i = 1, j = i + 10; i < 5; i++, j = i * 2  ){
//            System.out.println("i = " + i + " j = " + j);
//        }
        //задание 6
        System.out.println(test(0, 5 , 1, 11));
        System.out.println(test(12, 10, 1, 11));
        System.out.println(test(5, 5, 1, 11));
    }
    static int test(int testVal, int target, int begin, int end) {
        if ((testVal <= end) & (testVal >= begin)) {
            if (testVal > target) return +1;
            else if (testVal < target) return -1;
            else return 0; //одинаковые значения
        }/*else можно не писать =)*/
        System.out.println("Error");
        return -1111111111;
    }
}
