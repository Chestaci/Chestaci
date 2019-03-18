package Thinking_in_Java.Chapter_15;

import Thinking_in_Java.Chapter_14.Ex11.typeinfo.pets.Cat;
import Thinking_in_Java.Chapter_14.Ex11.typeinfo.pets.Pet;

public class Ex28 {
    <T> void contra(Generic1<? super T> m1t, T t) {
        m1t.method1(t);
    }
    <T> T co(Generic2<? extends T> m2t) {
        return m2t.method2();
    }

    public static void main(String[] args) {
        Ex28 e28 = new Ex28();
        e28.contra(new Generic1<Pet>(), new Cat("kitty"));
        e28.co(new Generic2<Pet>());
    }
}

class Generic1<T>{
    T arg;
    public void method1(T arg){
        this.arg = arg;
    }
}

class Generic2<T>{
    T arg;
    public T method2(){
        return arg;
    }
}



