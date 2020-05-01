package Thinking_in_Java.Chapter_21;

import net.mindview.util.Generator;

public class Fibanach implements Generator<Integer>{
            private int count = 0;
        public Integer next() { return fib(count++); }
        private int fib(int n) {
            if(n < 2) return 1;
            return fib(n-2) + fib(n-1);
        }
}
