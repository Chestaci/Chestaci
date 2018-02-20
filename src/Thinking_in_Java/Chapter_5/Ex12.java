package Thinking_in_Java.Chapter_5;

public class Ex12 {
    public static void main(String[] args) {
        Tank tank = new Tank(true);
        Tank tank1 = new Tank(false);
        tank.toEmpty();
        tank1.fill();
        tank1.toEmpty();
        tank.fill();
        new Tank(true);
        new Tank(true);
        new Tank(true);
        new Tank(true);
        System.gc();
        System.runFinalizersOnExit(true);
        System.gc();
    }
}

class Tank{
    boolean volume;
    Tank(boolean b){
        volume = b;
    }
    void fill(){
        volume = true;
    }
    void toEmpty(){
        volume = false;
    }
    protected void finalize() throws Throwable {
        if(volume){
            System.out.println("Error! Volume isn't empty!");
        }
        super.finalize();
    }
}