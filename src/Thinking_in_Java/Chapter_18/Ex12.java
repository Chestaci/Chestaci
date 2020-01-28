package Thinking_in_Java.Chapter_18;
import java.io.*;
import java.util.List;
import java.util.ListIterator;
public class Ex12 {
    public static void main(String[] args) throws IOException{
        String f = "src/Thinking_in_Java/Chapter_18/Test1.txt";
        List<String> list = Ex7.fileToLL(f);
       PrintWriter out = new PrintWriter(f);
        int line = list.size();
        for(ListIterator<String> it =
            list.listIterator(list.size()); it.hasPrevious();)
            out.println(line-- + ": " + it.previous());
        out.close();
    }
}