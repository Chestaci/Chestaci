package Thinking_in_Java.Chapter_18;

import java.io.*;
import java.util.LinkedList;
import java.util.ListIterator;

public class Ex7 {

   public static LinkedList<String> fileToLL(String f) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(f));
        String s;
        LinkedList<String> ll = new LinkedList<>();

        while ((s = in.readLine())!= null) {
            ll.add(s.toUpperCase());
        }
        in.close();
        return ll;
    }

    public static LinkedList<String> matchesArgs(LinkedList<String> linkedList, String... p){
       LinkedList<String> matchesLl = new LinkedList<>();
        for (String s: linkedList) {
                for(String d: s.split("\\W+")) {
                    for (String m: p) {
                    if (d.matches(m.toUpperCase())) {
                        if (!matchesLl.contains(s)) {
                            matchesLl.add(s);
                        }
                    }
                }
            }
        }
        return matchesLl;
    }

    public static void printReverseLL (LinkedList linkedList){

        for(ListIterator<String> it =
            linkedList.listIterator(linkedList.size()); it.hasPrevious();){
            System.out.println(it.previous());
        }
       }

    public static void main(String[] args) throws IOException{

       String[] strings = new String[(args.length - 1)];
       for(int i = 1; i < args.length; i++){
           strings[(i-1)] = args[i];
       }
        printReverseLL(matchesArgs(fileToLL(args[0]), strings));
//        printReverseLL(matchesArgs(fileToLL(args[0]), args[1], args[2]));



//        printReverseLL(matchesArgs(fileToLL(args[0]), "import", "static"));




//       if(args[0] == null) {
//           printReverseLL(fileToLL("src/Thinking_in_Java/Chapter_17/Ex1.java"));
//       }else {
//           printReverseLL(fileToLL(args[0]));
//       }
    }


}
