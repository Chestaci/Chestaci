package Thinking_in_Java.Chapter_5;

public class Ex17_18 {
    public static void main(String[] args) {
        Ar[] a = new Ar[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = new Ar("1 " + i);
           // a[i] = new Ar(Integer.toString(i)); // можно было и так....
        }
        for (Ar n: a) {
         //   System.out.print(n.print() + ", ");
            //n.print();
            System.out.println(n.toString());
        }
    }
}

class Ar {
    String s;

    public Ar(String s) {
        System.out.println(s);
      this.s = s;
    }
//    String print(){
//        return s;
//    }

    void print() {
        System.out.println(s);
    }

    @Override
    public String toString() {
        return "Ar{" + "s='" + s + '\'' + '}';
    }
}