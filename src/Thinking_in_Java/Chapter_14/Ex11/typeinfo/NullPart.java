package Thinking_in_Java.Chapter_14.Ex11.typeinfo;

import net.mindview.util.Null;

public class NullPart extends Part implements Null {
    private NullPart() { super(); }
    public static final Part NULL = new NullPart();
    public static class Factory implements Thinking_in_Java.Chapter_14.Ex11.typeinfo.factory.Factory<NullPart> {
        public NullPart create() { return (NullPart)NULL; }
    }
    public String toString() { return "NULL"; }
}
