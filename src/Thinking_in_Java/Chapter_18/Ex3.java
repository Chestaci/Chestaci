package Thinking_in_Java.Chapter_18;

import net.mindview.util.TextFile;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ex3 {
    public static void main(final String[] args) {
        File path = new File("src/Thinking_in_Java/Chapter_17/");
        String dirF = "src/Thinking_in_Java/Chapter_17/";
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
        long size = 0;
        long size1 = 0;
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for (String dirItem : list) {
            System.out.println(dirItem);
            String temp = dirF + dirItem;
            size += new File(temp).getTotalSpace();
            size1 += new File(temp).length();
        }
        System.out.println(size);
        System.out.println(size1);
    }
}
