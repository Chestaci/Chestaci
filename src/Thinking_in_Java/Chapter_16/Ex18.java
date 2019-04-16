package Thinking_in_Java.Chapter_16;

import java.lang.reflect.Field;
import java.util.Arrays;

public class Ex18 {
    static void setID(BerylliumSphere bs, long value) {
        try {
            Field fid = BerylliumSphere.class.getDeclaredField("id");
            fid.setAccessible(true);
            fid.setLong(bs, value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        BerylliumSphere[] berylliumSpheres = {new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere()};
        BerylliumSphere[] berylliumSpheres1 = new BerylliumSphere[9];
        System.arraycopy(berylliumSpheres, 0, berylliumSpheres1, 2, berylliumSpheres.length);
        System.out.println(Arrays.toString(berylliumSpheres));
        System.out.println(Arrays.toString(berylliumSpheres1));
        for (BerylliumSphere b : berylliumSpheres){
            setID(b, 1);
        }
        System.out.println(Arrays.toString(berylliumSpheres));
        System.out.println(Arrays.toString(berylliumSpheres1));
    }
}
