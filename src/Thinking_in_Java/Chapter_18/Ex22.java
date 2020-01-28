package Thinking_in_Java.Chapter_18;

import net.mindview.util.OSExecute;
import net.mindview.util.OSExecuteException;
import java.io.*;

import java.util.*;


public class Ex22 {
    public static void main(String[] args) {
//        OSExecute.command("javap out/production/Chestaci/Thinking_in_Java/Chapter_18/Ex3");
//     //   System.out.println(OSExecute.command("javap OSExecuteDemo"));


        List<String> result = OSExecute2.command("javap out/production/Chestaci/Thinking_in_Java/Chapter_18/Ex22");
//        List<String> result = OSExecute2.command("javap out/production/Chestaci/Thinking_in_Java/Chapter_18/Ex22");
//        List<String> result = OSExecute2.command("javap out.production.Chestaci.Thinking_in_Java.Chapter_18.Ex3");
//        List<String> result = OSExecute.command("javap Thinking_in_Java.Chapter_18.Ex3");
//        List<String> result = OSExecute.command("javap src/Thinking_in_Java/Chapter_18/Ex3.java");
        for(String s : result)
            System.out.println(s);
    }
}

class OSExecute2 {
    public static List<String> command(String command) {
        boolean err = false;
        List<String> list = new LinkedList<String>();
        try {
            Process process = new ProcessBuilder(command.split(" ")).start();
            BufferedReader results = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String s;
            while((s = results.readLine())!= null){
//                System.out.println(s);
            list.add(s);
            }
            BufferedReader errors = new BufferedReader(new InputStreamReader(process.getErrorStream()));
// Report errors and return nonzero value
// to calling process if there are problems:
            while((s = errors.readLine())!= null) {
                System.err.println(s);
                err = true;
            }
        } catch(Exception e) {
// Compensate for Windows 2000, which throws an
// exception for the default command line:
            if (!command.startsWith("CMD /C"))
                command("CMD /C " + command);
            else
                throw new RuntimeException(e);

//        } catch(IOException e) {
//            if(!command.startsWith("CMD /C"))
//                return command("CMD /C " + command);
//            throw new RuntimeException(e);
//        } catch(Exception e) {
//            throw new RuntimeException(e);
//
//        }
        }if(err)
            throw new OSExecuteException("Errors executing " + command);
        return list;
    }
}

class OSExecuteDemo {
    public static void main(String[] args) {
//        OSExecute.command("javap out/production/Chestaci/Thinking_in_Java/Chapter_18/Ex3");
//     //   System.out.println(OSExecute.command("javap OSExecuteDemo"));


        List<String> result = OSExecute2.command("javap out/production/Chestaci/Thinking_in_Java/Chapter_18/Ex14");
//        List<String> result = OSExecute2.command("javap out.production.Chestaci.Thinking_in_Java.Chapter_18.Ex3");
//        List<String> result = OSExecute.command("javap Thinking_in_Java.Chapter_18.Ex3");
//        List<String> result = OSExecute.command("javap src/Thinking_in_Java/Chapter_18/Ex3.java");
        for(String s : result)
            System.out.println(s);
    }
}
