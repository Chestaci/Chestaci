package Thinking_in_Java.Chapter_18;

import net.mindview.util.*;

import java.io.File;

public class Ex4 {
    public static void main(String[] args) {
       Directory.TreeInfo treeInfo = Directory.walk("src/Thinking_in_Java/Chapter_17/", ".*");
        long size = 0;
        for (File file : treeInfo.files) {
            size += file.length();
        }
        System.out.println(size);
    }
}
