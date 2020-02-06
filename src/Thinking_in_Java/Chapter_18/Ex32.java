package Thinking_in_Java.Chapter_18;

import net.mindview.util.TextFile;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Serializer;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

public class Ex32 {
    public static void main(String[] args) throws IOException {
    HashMap<String, Integer> map = new HashMap<>();
    TextFile textFile = new TextFile("src/Thinking_in_Java/Chapter_18/Ex17.java","\\W+");


    for (String word: textFile) {
            Integer freq = map.get(word);
            map.put(word,freq == null ? 1 : freq + 1);

        }



        System.out.println(map);

        Element root = new Element("map");

        for( Map.Entry<String, Integer> words : map.entrySet())
        {
            Element word = new Element("words");
            word.appendChild(words.getKey());
            Element quantity = new Element("quantity");
            quantity.appendChild(words.getValue().toString());
            root.appendChild(word);
            root.appendChild(quantity);
        }

        Document doc = new Document(root);

        Serializer serializer= new Serializer(System.out,"ISO-8859-1");
        serializer.setIndent(4);
        serializer.setMaxLength(60);
        serializer.write(doc);
        serializer.flush();

        Serializer serializer2= new Serializer(new BufferedOutputStream(new FileOutputStream(
                "WWWWORDS.xml")),"ISO-8859-1");
        serializer2.setIndent(4);
        serializer2.setMaxLength(60);
        serializer2.write(doc);
        serializer2.flush();



//        format(System.out, doc);
//        format(new BufferedOutputStream(new FileOutputStream(
//                "People.xml")), doc);

    }
}


