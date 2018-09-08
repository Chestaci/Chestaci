package Thinking_in_Java.Chapter_11;

import java.util.*;

public class Ex13 {
    public static void main(String[] args) { // args = 5000 выставить в настройках Idea перед запуском.
        GreenhouseController2.main(args);
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

abstract class Event2 {
    private long eventTime;
    protected final long delayTime;
    public Event2(long delayTime) {
        this.delayTime = delayTime;
        start();
    }
    public void start() { // С возможностью перезапуска
        eventTime = System.nanoTime() + delayTime;
    }
    public boolean ready() {
        return System.nanoTime() >= eventTime;
    }
    public abstract void action();
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//class Controller2 {
//    // Класс из пакета java.util для хранения объектов Event:
//    private List<Event2> eventList = new ArrayList<Event2>();
//    public void addEvent(Event2 c) {
//        eventList.add(c);
//    }
//    public void run() {
//        while (eventList.size() > 0)
//            // Создать копию, чтобы избежать модификации списка
//            // во время выборки элементов:
//            for (Event2 e : new ArrayList<Event2>(eventList))
//                if (e.ready()) {
//                    System.out.println(e);
//                    e.action();
//                    eventList.remove(e);
//                }
//    }
//}

class Controller2 {
    // Класс из пакета java.util для хранения объектов Event:
    private List<Event2> eventList = new LinkedList<Event2>();

    public void addEvent(Event2 c) {
        eventList.add(c);
    }



    public void run() {
        LinkedList<Event2> lL = new LinkedList<Event2>(eventList);
        ListIterator<Event2> ev2 = lL.listIterator();
            while (ev2.hasNext()) {
               ev2.next().action();
               ev2.previous();
               System.out.println(ev2.next());
                }
            }
        }


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class GreenhouseControls2 extends Controller2 {

    private boolean fan = false;
    public class FanOn extends Event2 {
        public FanOn(long delayTime) { super(delayTime); }
        public void action() {
            // Поместите сюда код управления оборудованием,
            // выполняющий непосредственное включение вентилятора.
            fan = true;
        }
        public String toString() { return "Вентилятор включен"; }
    }
    public class FanOff extends Event2 {
        public FanOff(long delayTime) { super(delayTime); }
        public void action() {
            // Поместите сюда код управления оборудованием,
            // выполняющий выключение вентилятора.
            fan = false;
        }
        public String toString() { return "Вентилятор выключен"; }
    }




    private boolean light = false;
    public class LightOn extends Event2 {
        public LightOn(long delayTime) { super(delayTime); }
        public void action() {
            // Поместите сюда код управления оборудованием,
            // выполняющий непосредственное включение света.
            light = true;
        }
        public String toString() { return "Свет включен"; }
    }
    public class LightOff extends Event2 {
        public LightOff(long delayTime) { super(delayTime); }
        public void action() {
            // Поместите сюда код управления оборудованием,
            // выполняющий выключение света.
            light = false;
        }
        public String toString() { return "Свет выключен"; }
    }
    private boolean water = false;
    public class WaterOn extends Event2 {
        public WaterOn(long delayTime) { super(delayTime); }
        public void action() {
            // Здесь размещается код управления оборудованием.
            water = true;
        }
        public String toString() {
            return "Полив включен";
        }
    }
    public class WaterOff extends Event2 {
        public WaterOff(long delayTime) { super(delayTime); }
        public void action() {
            // Здесь размещается код управления оборудованием.
            water = false;
        }
        public String toString() {
            return "Полив выключен";
        }
    }
    private String thermostat = "День";
    public class ThermostatNight extends Event2 {
        public ThermostatNight(long delayTime) {
            super(delayTime);
        }
        public void action() {
            // Здесь размещается код управления оборудованием.
            thermostat = "Ночь";
        }
        public String toString() {
            return "Термостат использует ночной режим";
        }
    }
    public class ThermostatDay extends Event2 {
        public ThermostatDay(long delayTime) {
            super(delayTime);
        }
        public void action() {
            // Здесь размещается код управления оборудованием.
            thermostat = "День";
        }
        public String toString() {
            return "Термостат использует дневной режим";
        }
    }
    // Пример метода action(), вставляющего новый экземпляр
    // самого себя в список событий:
    public class Bell extends Event2 {
        public Bell(long delayTime) { super(delayTime); }
        public void action() {
            addEvent(new Bell(delayTime));
        }
        public String toString() { return "Бам!"; }
    }
    public class Restart extends Event2 {
        private Event2[] eventList;
        public Restart(long delayTime, Event2[] eventList) {
            super(delayTime);
            this.eventList = eventList;
            for(Event2 e : eventList)
                addEvent(e);
        }
        public void action() {
            for(Event2 e : eventList) {
                e.start(); // Перезапуск каждого события
                addEvent(e);
            }
            start(); // Перезапуск текущего события
            addEvent(this);
        }
        public String toString() {
            return "Перезапуск системы";
        }
    }
    public static class Terminate extends Event2 {
        public Terminate(long delayTime) { super(delayTime); }
        public void action() { System.exit(0); }
        public String toString() { return "Отключение"; }
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class GreenhouseController2 {
    public static void main(String[] args) {
        GreenhouseControls2 gc = new GreenhouseControls2();
        // Вместо жесткой фиксации параметров в коде
        // можно было бы считать информацию
        // из текстового файла:
        gc.addEvent(gc.new Bell(900));
        Event2[] eventList = {
                gc.new ThermostatNight(0),
                gc.new LightOn(200),
                gc.new FanOn(200),
                gc.new LightOff(400),
                gc.new WaterOn(600),
                gc.new WaterOff(800),
                gc.new FanOff(200),
                gc.new ThermostatDay(1400),
        };
        gc.addEvent(gc.new Restart(2000, eventList));
        if(args.length == 1)
            gc.addEvent(
                    new GreenhouseControls2.Terminate(
                            new Integer(args[0])));
        gc.run();
    }

}
