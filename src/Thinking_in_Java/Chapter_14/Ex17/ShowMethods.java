package Thinking_in_Java.Chapter_14.Ex17;


import java.lang.reflect.*;
import java.util.regex.*;
import static net.mindview.util.Print.print;

public class ShowMethods {
    private static String usage =
            "usage:\n" +
                    "ShowMethods qualiied.class.name\n" +
                    "To show all methods in class or:\n" +
                    "ShowMethods qualiied.class.name word\n" +
                    "To search for methods involving 'word'";
    private static Pattern p = Pattern.compile("\\w+\\.|native\\s|final\\s");

    public static void main(String[] args) {
        if(args.length < 1){
            print(usage);
            System.exit(0);
        }
        int lines = 0;
        try{
          Class<?> c = Class.forName(args[0]);
            //Class<?> c = Class.forName("Thinking_in_Java.Chapter_14.Ex17.ShowMethods");
            // Class<?> c = Class.forName("src\\Thinking_in_Java\\Chapter_14\\Ex17\\ShowMethods.java");
//C:\Users\Настюша\IdeaProjects\Chestaci\out\production\Chestaci\Thinking_in_Java\Chapter_14\Ex17
            Method[] methods = c.getMethods();
            Constructor[] ctors = c.getConstructors();
            if(args.length == 1){
                for(Method method: methods){
                    print(p.matcher(method.toString()).replaceAll(""));
                }
                for(Constructor ctor: ctors){
                    print(p.matcher(ctor.toString()).replaceAll(""));
                }
                lines = methods.length + ctors.length;
            }else {
                for(Method method: methods){
                    if(method.toString().indexOf(args[1]) != -1) {
                        print(p.matcher(method.toString()).replaceAll(""));
                        lines++;
                    }
                }
                for(Constructor ctor: ctors){
                    if(ctor.toString().indexOf(args[1]) != -1) {
                        print(p.matcher(ctor.toString()).replaceAll(""));
                    lines++;
                    }
                }
            }
        }catch (ClassNotFoundException e){
            print("No such class: " + e);
        }
    }
}
