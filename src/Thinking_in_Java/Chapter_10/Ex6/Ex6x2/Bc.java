package Thinking_in_Java.Chapter_10.Ex6.Ex6x2;

import Thinking_in_Java.Chapter_10.Ex6.Ex6;
import Thinking_in_Java.Chapter_10.Ex6.Ex6x.AbcC;

public class Bc extends Ex6 {
    Bc(String str) {
        super(str);
    }
    public AbcC m(){
        return this.new P();
    }

    public static void main(String[] args) {
        Bc bc = new Bc("Hello");
        System.out.println(bc.m().f());
    }
}
