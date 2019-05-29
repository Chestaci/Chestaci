package Thinking_in_Java.Chapter_17;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex2 {
    public static void main(String[] args) {
        Map map = new TreeMap();
        Set set = new TreeSet();

        Pattern p = Pattern.compile("^\\b[A]\\w+");

        for (int i = 0; i < Countries.DATA.length; i++){
            String s = Countries.DATA[i][0];
            Matcher m = p.matcher(s);
            while (m.find()) {
                map.put(Countries.DATA[i][0], Countries.DATA[i][1]);
                set.add(Countries.DATA[i][0]);
            }
        }
        System.out.println(map);
        System.out.println();
        System.out.println(set);
    }
}
