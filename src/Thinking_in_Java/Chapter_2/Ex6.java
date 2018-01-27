package Thinking_in_Java.Chapter_2;


public class Ex6 {
    public static void main(String[] args) {
        class Text {
            String text;
            int storage (String s) {
                return s.length() * 2;
            }

            boolean num (String s) {
                if (storage(text) < 10) {
                    return true;
                }else {
                   return false;
                }
                }
            }


        Text a = new Text();
        a.text = "tea";
        System.out.println(a.storage(a.text));
        System.out.println(a.num(a.text));
    }

}