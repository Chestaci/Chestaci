package Thinking_in_Java.Chapter_7;

public class Ex4_6 extends F{
    public Ex4_6() {
        System.out.println("lxikjvog");
    }

    public Ex4_6(String n) {
        super(n);
        System.out.println("menya vizvali ^_^");
    }
    public Ex4_6(int i){
        System.out.println(i);
    }

    public static void main(String[] args) {
        Ex4_6 x = new Ex4_6("dfh");
        Ex4_6 x2 = new Ex4_6();
        Ex4_6 x3 = new Ex4_6(1);
    }
}
class F{
    F(){
       // this("перегруз");
        System.out.println("F()");
    }
    F(String s){
        System.out.println("F() " + s);
    }
}