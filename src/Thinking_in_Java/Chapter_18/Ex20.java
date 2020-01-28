package Thinking_in_Java.Chapter_18;
import net.mindview.util.BinaryFile;
import net.mindview.util.Directory;
import java.io.File;
import java.io.IOException;
public class Ex20 {
    final static byte[] signature =
            {(byte)202, (byte)254, (byte)186, (byte)190};
    public static void main(String[] args)
            throws IOException {
        String dir = ".";
        if(args.length == 1)
            dir = args[0];
        for(File file : Directory.walk(dir, ".*\\.class")) {
            byte[] bt = BinaryFile.read(file);
            for(int i = 0; i< signature.length; i++)
                if(bt[i] != signature[i]) {
                    System.err.println(file + " is corrupt!");
                    break;
                } else {
                    System.out.println(file.getName());
                }
        }
    }
}
