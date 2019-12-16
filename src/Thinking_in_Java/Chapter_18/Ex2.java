package Thinking_in_Java.Chapter_18;

import Chestaci.Array.Array;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

public class Ex2 {
}

class SortedDirList{
    String dir;
    public SortedDirList(String direct) {
        dir = direct;
    }

    String[] dirList;

    public String[] list(){
        File file = new File(dir);
        dirList = file.list();
        Arrays.sort(dirList, String.CASE_INSENSITIVE_ORDER);
        return dirList;
    }

    public String[] list(String regex){
        File file = new File(dir);
        dirList = file.list(new FilenameFilter() {
            private Pattern pattern = Pattern.compile(regex);

            public boolean accept(File dir, String name) {
                return pattern.matcher(name).matches();
            }
        });
        return dirList;
        }

    public static void main(String[] args) {
        SortedDirList sdl = new SortedDirList("src/Thinking_in_Java/Chapter_17/");
        System.out.println(Arrays.toString(sdl.list()));
        System.out.println("////////////////////////////////////////////////");
        System.out.println(Arrays.toString(sdl.list(".+2.+")));

    }
}