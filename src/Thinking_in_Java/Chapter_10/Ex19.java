package Thinking_in_Java.Chapter_10;

//import static Thinking_in_Java.Chapter_10.Ex19.Ex19_1.show;

interface Ex19 {
    String call();
    int count ();
    class Ex19_1 {
        static void show (Ex19 i){
            System.out.println(i.call() + " " + i.count());

        }
    }
}
class Ex19_2 implements Ex19 {

    @Override
    public String call() {
        return "Hi!";
    }

    @Override
    public int count() {
        return 11;
    }

    public static void main(String[] args) {
        Ex19_2 a = new Ex19_2();
        Ex19_1.show(a);
    }
}