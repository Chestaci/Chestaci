package Thinking_in_Java.Chapter_11;

import com.sun.org.apache.xpath.internal.SourceTree;

import javax.swing.text.html.HTMLDocument;
import javax.xml.bind.SchemaOutputResolver;
import java.util.ArrayList;
import java.util.Iterator;

public class Ex8 {
    public static void main(String[] args) {
        ArrayList<Gerbil2> gerbils = new ArrayList<>();
        gerbils.add(new Gerbil2(1));
        gerbils.add(new Gerbil2(2));
        gerbils.add(new Gerbil2(3));
        gerbils.add(new Gerbil2(4));
        gerbils.add(new Gerbil2(5));

        Iterator<Gerbil2> it = gerbils.iterator();
        while (it.hasNext()) {
//            Gerbil2 g = it.next();
//            g.hop();
            it.next().hop();
        }

//        for (int i = 0; i < gerbils.size(); i++) {
//            gerbils.get(i).hop();
//        }
    }
}

class Gerbil2 {
    int gerbilNumber;

    public Gerbil2(int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }

    void hop() {
        System.out.println(gerbilNumber + " " + "Hi!");
    }

}

