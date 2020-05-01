package Thinking_in_Java.Chapter_21.Ex_13;

public class SerialNumberGenerator {
    private static /*volatile*/ int serialNumber = 0;
    public synchronized static int nextSerialNumber() {
        return serialNumber++; // Not thread-safe
    }
}
