package Thinking_in_Java.Chapter_10.Ex6;

import Thinking_in_Java.Chapter_10.Ex6.Ex6x.AbcC;

public class Ex6 {
    private String string;

    public Ex6(String str) {
        string = str;
    }

    protected class P implements AbcC {
        public P() {
        }

        @Override
        public String f() {
            return string;
        }
    }
}
