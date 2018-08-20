package Thinking_in_Java.Chapter_10;

public interface Ex10 {
    void mq();
}

class OOO{
    Ex10 m(boolean b){
        if(b){
            class III implements Ex10{
                @Override
                public void mq() {
                    System.out.println("YEEEAHHH!!!");
                }
            }
            return new III();
        }else{
       return null;
        }
    }

    public static void main(String[] args) {
        OOO ooo = new OOO();
        ooo.m(true).mq();
        //ooo.m(false).mq();
    }
}