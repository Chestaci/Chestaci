package Thinking_in_Java.Chapter_15;

public class Ex26 {
    public static void main(String[] args) {
        Number[] numbers = new Integer[10];
        numbers[0] = new Integer(0);
        numbers[1] = new Integer(0);
        numbers[2] = new Integer(0);
        numbers[3] = new Integer(0);
        numbers[4] = new Integer(0);
        numbers[5] = new Integer(0);
        numbers[6] = new Integer(0);
        numbers[7] = new Integer(0);
        numbers[8] = new Integer(0);
        numbers[9] = new Integer(0);



        // Number abstract, cannot instantiate:
        // numbers[0] = new Number();
        try { // compile OK; runtime ArrayStoreException:
            numbers[1] = new Double(3.4);
        } catch(Exception e) {
            System.out.println(e);
        }
        for(Number n : numbers)
            System.out.println(n);
        // compile errors: incompatible types:
        // Integer[] ints = numbers;
        // for(Integer n : numbers)
        //	System.out.println(n);
        // even though runtime type is Integer:
        for(Number n : numbers)
            System.out.println(n.getClass().getSimpleName());
    }
}
