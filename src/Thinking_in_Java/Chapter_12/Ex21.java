package Thinking_in_Java.Chapter_12;

public class Ex21 {
    public static void main(String[] args) {
       try {
           GreenTea greenTea = new GreenTea();
       } catch (Exception e) {
           System.out.println(e);
       }
    }
}

class Tea{
    public Tea() throws Exception{
    }
}

class GreenTea extends Tea{

    public GreenTea() throws Exception {
        super();
//        try {
//           Tea ex21 = new Tea();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
    }
}