package Thinking_in_Java.Chapter_13;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex12 {
    public static void main(String[] args) {
        String str = "\\b\\p{Lower}\\w+";
        Set<String> set = new LinkedHashSet<>();
        Matcher m = Pattern.compile(str).matcher(Groups.POEM);
        int i = 0;
        while(m.find()){
            String x = m.group();
//            if(!set.contains(x)){
                set.add(x);
                i++;
//            }
        }
        System.out.println(set + " " + i + " " + "size: " + set.size());
    }
}

class Groups{
    static public final String POEM =
            "Twas brillig, and the slithy toves\n" +
                    "Did gyre and gimble in the wabe.\n" +
                    "All mimsy were the borogoves,\n" +
                    "And the mome raths outgrabe.\n\n" +
                    "Beware the Jabberwock, my son,\n" +
                    "The jaws that bite, the claws that catch.\n" +
                    "Beware the Jubjub bird, and shun\n" +
                    "The frumious Bandersnatch.";

    public static void main(String[] args) {
        Matcher m = Pattern.compile("(?m)(\\S+)\\s+((\\S+)\\s+(\\S+))$")
                .matcher(POEM);
        while (m.find()){
            for(int j = 0; j <= m.groupCount(); j++){
                System.out.print("[" + m.group(j) + "]");
            }
            System.out.println();
        }
    }
}
