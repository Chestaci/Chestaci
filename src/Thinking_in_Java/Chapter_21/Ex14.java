package Thinking_in_Java.Chapter_21;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public class Ex14 {
    public static void main(String[] args)throws Exception {
        int count = 100;
        for (int i = 0; i < count; i++) {
            new Timer().schedule(new TimerTask() {
                @Override
                public void run() {
                    System.out.println(System.currentTimeMillis());
                }
            }, count - i);
        }
// Wait for timers to expire
        TimeUnit.MILLISECONDS.sleep(2 * count);
        System.exit(0);
    }
}