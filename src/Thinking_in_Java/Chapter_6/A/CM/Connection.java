package Thinking_in_Java.Chapter_6.A.CM;

public class Connection{
    private Connection() {
        System.out.println("Создан Connection()");
    }
    static Connection makeConnection(){
        System.out.println("работает static method makeConnection()");
        return new Connection();
    }
}
