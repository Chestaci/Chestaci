package IOfiles;

import java.io.*;

public class WriteFileExample {

    public static void main(String[] args) throws IOException {

        File file = new File("test.txt");
        if (!file.exists()) {
            file.createNewFile();
        }

        // If we don't add second parameter to constructor, so we always will rewrite our file:
        // drop data from here and write new
        // default second parameter in FileWriter constructor is false!
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.write("I love Java!\n");
            writer.write("I love Java 1.8!\n");
        }

        // To write object into file (write like byte[] array)
        // The process conversation object from one state to another called serialization
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
        objectOutputStream.writeObject(new User("dmipro", "password"));

    }

    private static class User implements Serializable {

        private transient int userId; // if we write keyworkd transient - so this file will not serialize!
        private String login;
        private String password;

        public User(String login, String password) {
            this.login = login;
            this.password = password;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        @Override
        public String toString() {
            return "User{" +
                    "userId=" + userId +
                    ", login='" + login + '\'' +
                    ", password='" + password + '\'' +
                    '}';
        }

    }

}