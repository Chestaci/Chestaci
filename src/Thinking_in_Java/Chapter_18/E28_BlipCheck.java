package Thinking_in_Java.Chapter_18;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import static net.mindview.util.Print.print;

public class E28_BlipCheck  implements Externalizable {
//     E28_BlipCheck() {
// print("BlipCheck Constructor");
//     }
    public void writeExternal(ObjectOutput out)
            throws IOException {
        print("BlipCheck.writeExternal");
    }
    public void readExternal(ObjectInput in)
            throws IOException, ClassNotFoundException {
        print("BlipCheck.readExternal");
    }
    public static void main(String[] args) throws Exception {
// To make it run with Ant.
        Blips.main(args);
    }
}
