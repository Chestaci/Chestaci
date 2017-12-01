//package IOfiles;



//import static java.nio.file.Paths.*;
//
public class ReadFileUserStorage {
//
//    public static void main(String[] args) {
//
//        File file = new File("UserStorageFile.txt");
//        System.out.println(file != null); // always true
//        System.out.println(file.exists()); // check if file exists on file system
//
//        System.out.println(file.isFile());  // true if it's file
//        // false if it's a directory
//
//        // new File("test").mkdir() - will creates a new directory with name "test"
//        try {
//            if (!file.exists()) {
//                file.createNewFile();
//            }
//        } catch (IOException e) {
//            System.out.println("IO error: " + e.getMessage());
//        }
//
//        // old try-catch version (up to Java 1.7)
//        BufferedReader reader = null;
//        try {
//            reader = new BufferedReader(new FileReader(file));
//            String line;
//            while ((line = reader.readLine()) != null) {
//                System.out.println(line);
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            // all resources (file, connections, etc.) we must close after execution
//            if (reader != null) {
//                try {
//                    reader.close();
//                } catch (IOException e) {
//                    System.out.println("Couldn't close file reader: " + e.getMessage());
//                }
//            }
//        }
//
//
//        // new try-with-resource (Java 1.7, 1.8)
//        // here JVM will automatically close our resource after execution try-catch blocks
//        try (BufferedReader bufReader = new BufferedReader(new FileReader(file))) {
//
//            String line;
//            while ((line = bufReader.readLine()) != null) {
//                System.out.println(line);
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//
//    }
//
}