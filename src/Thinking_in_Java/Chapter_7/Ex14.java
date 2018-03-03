package Thinking_in_Java.Chapter_7;

public class Ex14 {
    public static void main(String[] args) {
        Car car = new Car();
        car.left.window.rollUp();
        car.wheel[0].inflate(72);
        car.right.window.rollDown();
        car.engine.service();
    }
}

//машина
class Car{
    public Engine engine = new Engine();
    public Wheel[] wheel = new Wheel[4];
    public Door
    left = new Door(),
    right = new Door(); //двухдверная машина
    public Car(){
        for(int i = 0; i < 4; i++)
            wheel[i] = new Wheel();
    }
}

//двигатель
class Engine{
    public void start(){};//запустить
    public void rev(){};//переключить
    public void stop(){};//остановить
    public void service() {
        System.out.println("ТО пройден!");
    }
}

//колесо
class Wheel{
    public void inflate(int psi){};//накачать
}

//окно
class Window{
    public void rollUp(){};//поднять
    public void rollDown(){};//опустить
}

//дверь
class Door{
    public Window window = new Window();//окно двери
    public void open(){};//открыть
    public void close(){};//закрыть
}