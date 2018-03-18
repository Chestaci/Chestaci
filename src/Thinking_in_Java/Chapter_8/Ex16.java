package Thinking_in_Java.Chapter_8;

public class Ex16 {
    public static void main(String[] args) {
        Starship.main(args);
    }

}

class Starship{
    public static void main(String[] args) {
        AlertStatus alertStatus = new AlertStatus();
        alertStatus.findOutTheStatus();
        alertStatus.changeRed();
        alertStatus.findOutTheStatus();
        alertStatus.changeYellow();
        alertStatus.findOutTheStatus();
        alertStatus.changeGreen();
        alertStatus.findOutTheStatus();
    }
}

class AlertStatus{
    private Status status = new GreenAlarm();
    public void changeYellow(){
        status = new YellowAlarm();
    }
    public void changeRed(){
        status = new RedAlarm();
    }
    public void changeGreen(){
        status = new GreenAlarm();
    }
    public void findOutTheStatus(){
        status.show();
    }
}

class Status{
    void show(){
    }
}

class GreenAlarm extends Status{
    void show(){
        System.out.println("Status Green Alarm");
    }
}

class YellowAlarm extends Status{
    void show(){
        System.out.println("Status Yellow Alarm");
    }
}

class RedAlarm extends Status{
    void show(){
        System.out.println("Status Red Alarm");
    }
}