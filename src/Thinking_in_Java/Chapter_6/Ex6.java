package Thinking_in_Java.Chapter_6;

public class Ex6 {
    public static void main(String[] args) {
        E6 e6 = new E6();
        Ex6 ex6 = new Ex6();
        //System.out.println(e6.print());

        //ex6.p(e6.print());
        ex6.p(e6.getS());
    }
    void p(String s){
        System.out.println("метод, который принимает защищенные данные из другого класса и свободно с ними работает. эти данные вот: " + "' " + s + " '");
    }
}

class E6{
    private String s = "private s класса E6";
//    public String print(){
//        return s;
//    }

    public String getS() {
        return s;
    }
}
