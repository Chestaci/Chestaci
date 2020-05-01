package Thinking_in_Java.Chapter_21.Ex_7;

class DaemonSpawn implements Runnable {
    public void run() {
        while(true)
            Thread.yield();
    }
}
