package Thinking_in_Java.Chapter_15;

public class Ex34 {
}

abstract class SamOgrType<T extends SamOgrType<T>>{
    abstract T method (T type);
    public T method2(){
       return method(null);
    }
}

class NaslednikS extends SamOgrType<NaslednikS>{
    @Override
    NaslednikS method(NaslednikS type) {
        if(type == null){
            return this;
        }
        return type;
    }

    public static void main(String[] args) {
        NaslednikS naslednikS = new NaslednikS();
        System.out.println(naslednikS == naslednikS.method2());
    }
}