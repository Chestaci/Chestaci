package Thinking_in_Java.Chapter_17;

import java.util.*;

import static net.mindview.util.Print.print;

public class Ex26_27 {

}

class CountedString {
    private static List<String> created =
            new ArrayList<String>();
    private String s;
    private int id = 0;
    private char ch;

    public CountedString(String str, Character c) {
        s = str;
        ch = c;
        created.add(s);
// id is the total number of instances
// of this string in use by CountedString:
        for (String s2 : created)
            if (s2.equals(s))
                id++;
    }

    public String toString() {
        return "String: " + s + " id: " + id + " char: " + ch +
                " hashCode(): " + hashCode();
    }

    public int hashCode() {
// The very simple approach:
// return s.hashCode() * id;
// Using Joshua Bloch’s recipe:
        int result = 17;
        result = 37 * result + s.hashCode();
  //      result = 37 * result + id;
        result = 37 * result + ch;
        return result;
    }

    public boolean equals(Object o) {
        return o instanceof CountedString &&
                s.equals(((CountedString) o).s) &&
                id == ((CountedString) o).id &&
                ch == ((CountedString) o).ch;
    }

    public static void main(String[] args) {
        Map<CountedString, Integer> map =
                new HashMap<CountedString, Integer>();
        CountedString[] cs = new CountedString[5];
        for (int i = 0; i < cs.length; i++) {
            char ch = (char)(i+120);
            cs[i] = new CountedString("hi", ch);
            map.put(cs[i], i); // Autobox int -> Integer
        }
        print(map);
        for (CountedString cstring : cs) {
            print("Looking up " + cstring);
            print(map.get(cstring));
        }
    }
}