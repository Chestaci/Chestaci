package Thinking_in_Java.Chapter_21.Ex_7;

import java.util.concurrent.TimeUnit;

import static net.mindview.util.Print.printnb;

public class Daemons {
    public static void main(String[] args) throws Exception {
        Thread d = new Thread(new Daemon());
        d.setDaemon(true);
        d.start();
        printnb("d.isDaemon() = " + d.isDaemon() + ", ");
// Allow the daemon threads to
// finish their startup processes:
        TimeUnit.SECONDS.sleep(1);
    }
}
