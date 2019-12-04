package Thinking_in_Java.Chapter_18;

import net.mindview.util.TextFile;

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class Ex1 {
    public static void main(String[] args) {
        TextFile text = new TextFile("test.txt");
    }

}

class DirList3 {
    public static void main(final String[] args) {
        File path = new File("src/Thinking_in_Java/Chapter_17/");
        String[] list;
        if (args.length == 0)
            list = path.list();
        else
//            list = path.list(new FilenameFilter() {
//                private Pattern pattern = Pattern.compile(args[0]);
//                public boolean accept(File dir, String name) {
//                    return pattern.matcher(name).matches();
//                }
//            });
            list = path.list(new FilenameFilter() {
                private String ext = args[0].toLowerCase();

                public boolean accept(File dir, String name) {
// Only analyze source files with the specified
// extension (given as the first command line
// argument)
                    if (name.toLowerCase().endsWith(ext)) {
// Only filter upon file extension?
                        if (args.length == 1)
                            return true;
                        Set<String> words = new HashSet<String>(
                                new TextFile(new File(
                                        dir, name).getAbsolutePath(), "\\W+"));
                        for (int i = 1; i < args.length; i++)
                            if (words.contains(args[i]))
                                return true;
                    }
                    return false;
                }
            });
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for (String dirItem : list)
            System.out.println(dirItem);
    }
}
