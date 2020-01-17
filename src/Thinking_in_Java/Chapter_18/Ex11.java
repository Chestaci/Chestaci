package Thinking_in_Java.Chapter_18;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Paths;
import java.util.*;

public class Ex11 extends GreenhouseControls {
    private boolean humidifier = false;
    public class HumidifierOn extends Event {
        public HumidifierOn(long delayTime) { super(delayTime); }
        public void action() {
            // Поместите сюда код управления оборудованием,
            // выполняющий непосредственное включение увлажнителя.
            humidifier = true;
        }
        public String toString() { return "Увлажнитель включен"; }
    }
    public class HumidifierOff extends Event {
        public HumidifierOff(long delayTime) { super(delayTime); }
        public void action() {
            // Поместите сюда код управления оборудованием,
            // выполняющий выключение увлажнителя.
            humidifier = false;
        }
        public String toString() { return "Увлажнитель выключен"; }
    }
}

//class GreenhouseController2 {
//    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
//        Ex11 gc = new Ex11();
//        // Вместо жесткой фиксации параметров в коде
//        // можно было бы считать информацию
//        // из текстового файла:
//        gc.addEvent(gc.new Bell(900));
////        Event[] eventList = {
////                gc.new ThermostatNight(0),
////                gc.new LightOn(200),
////                gc.new FanOn(200),
////                gc.new HumidifierOn(200),
////                gc.new LightOff(400),
////                gc.new WaterOn(600),
////                gc.new WaterOff(800),
////                gc.new FanOff(200),
////                gc.new HumidifierOff(200),
////                gc.new ThermostatDay(1400),
////        };
//
//        //System.out.println(Paths.get("Event.txt").toAbsolutePath());
//
//        BufferedReader in = new BufferedReader(new FileReader("src/Thinking_in_Java/Chapter_18/Event.txt"));
////        BufferedReader in = new BufferedReader(new FileReader(String.valueOf(Paths.get("Event.txt").toAbsolutePath())));
////        BufferedReader in = new BufferedReader(new FileReader("C:/Users/Настюша/IdeaProjects/Chestaci/Event.txt"));
////        BufferedReader in = new BufferedReader(new FileReader("C://Users//Настюша//IdeaProjects//Chestaci//Event.txt"));
//
//        /*
//        Object parent = Class.forName("mypackage.Parent").newInstance();
//        for (Class<?> cls : parent.getClass().getDeclaredClasses()) {
//            if (!Modifier.isStatic(cls.getModifiers())) {
//                // This is an inner class. Pass the parent class in.
//                cls.getDeclaredConstructor(new Class[] { parent.getClass() }).newInstance(new Object[] { parent });
//            } else {
//                // This is a nested class. You can also use it here as follows:
//                cls.getDeclaredConstructor(new Class[] {}).newInstance(new Object[] {});
//            }
//        * */
//        String outClass = gc.getClass().getSimpleName();
//
//        String s;
//        LinkedList<String> ll = new LinkedList<>();
//
//        while ((s = in.readLine())!= null) {
//            ll.add(s);
//        }
//        in.close();
//
//        Event[] eventList = new Event[ll.size()];
//        int i = 0;
//        Class<?> outer = GreenhouseController.class;
//        for(String r: ll) {
//            if (r != null) {
//                String[] sm = r.split("\\?\\?");
//                System.out.println(Arrays.toString(sm));
//                String inClass = outClass + "$";
//                Class<Event> c = (Class<Event>)Class.forName(inClass + sm[0]);
//                Constructor<Event> ctor = c.getConstructor(
//                                new Class<?>[] { outer, long.class });
////                events.add(new EventCreator(ctor, offset));
////                Constructor[] construct = c.getDeclaredConstructors();
////                Event instance = (Event) construct[0].newInstance(sm[1]);
//                gc.addEvent((Event) ctor.newInstance(Long.parseLong(sm[1])));
////                Event instance = (Event) ctor.newInstance(Long.parseLong(sm[1]));
////                        eventList[i++] = instance;
//            }
//        }
//
//        gc.addEvent(gc.new Restart(2000, eventList));
//        if(args.length == 1)
//            gc.addEvent(
//                    new GreenhouseControls.Terminate(
//                            new Integer(args[0])));
//        gc.run();
//    }
//}


abstract class Event {
    private long eventTime;
    protected final long delayTime;
    public Event(long delayTime) {
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

class Controller {
    // Класс из пакета java.util для хранения объектов Event:
    private List<Event> eventList = new ArrayList<Event>();
    public void addEvent(Event c) {
        eventList.add(c);
    }
    public void run() {
        while (eventList.size() > 0)
            // Создать копию, чтобы избежать модификации списка
            // во время выборки элементов:
            for (Event e : new ArrayList<Event>(eventList))
                if (e.ready()) {
                    System.out.println(e);
                    e.action();
                    eventList.remove(e);
                }
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class GreenhouseControls extends Controller {

    private boolean fan = false;
    public class FanOn extends Event {
        public FanOn(long delayTime) { super(delayTime); }
        public void action() {
            // Поместите сюда код управления оборудованием,
            // выполняющий непосредственное включение вентилятора.
            fan = true;
        }
        public String toString() { return "Вентилятор включен"; }
    }
    public class FanOff extends Event {
        public FanOff(long delayTime) { super(delayTime); }
        public void action() {
            // Поместите сюда код управления оборудованием,
            // выполняющий выключение вентилятора.
            fan = false;
        }
        public String toString() { return "Вентилятор выключен"; }
    }




    private boolean light = false;
    public class LightOn extends Event {
        public LightOn(long delayTime) { super(delayTime); }
        public void action() {
            // Поместите сюда код управления оборудованием,
            // выполняющий непосредственное включение света.
            light = true;
        }
        public String toString() { return "Свет включен"; }
    }
    public class LightOff extends Event {
        public LightOff(long delayTime) { super(delayTime); }
        public void action() {
            // Поместите сюда код управления оборудованием,
            // выполняющий выключение света.
            light = false;
        }
        public String toString() { return "Свет выключен"; }
    }
    private boolean water = false;
    public class WaterOn extends Event {
        public WaterOn(long delayTime) { super(delayTime); }
        public void action() {
            // Здесь размещается код управления оборудованием.
            water = true;
        }
        public String toString() {
            return "Полив включен";
        }
    }
    public class WaterOff extends Event {
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
    public class ThermostatNight extends Event {
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
    public class ThermostatDay extends Event {
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
    public class Bell extends Event {
        public Bell(long delayTime) { super(delayTime); }
        public void action() {
            addEvent(new Bell(delayTime));
        }
        public String toString() { return "Бам!"; }
    }
    public class Restart extends Event {
        private Event[] eventList;
        public Restart(long delayTime, Event[] eventList) {
            super(delayTime);
            this.eventList = eventList;
            for(Event e : eventList)
                addEvent(e);
        }
        public void action() {
            for(Event e : eventList) {
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
    public static class Terminate extends Event {
        public Terminate(long delayTime) { super(delayTime); }
        public void action() { System.exit(0); }
        public String toString() { return "Отключение"; }
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class GreenhouseController {
    public static void main(String[] args) {
        GreenhouseControls gc = new GreenhouseControls();
        // Вместо жесткой фиксации параметров в коде
        // можно было бы считать информацию
        // из текстового файла:
        gc.addEvent(gc.new Bell(900));
        Event[] eventList = {
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
        if (args.length == 1)
            gc.addEvent(
                    new GreenhouseControls.Terminate(
                            new Integer(args[0])));
        gc.run();
    }
}


//https://vike.io/ru/248267/
//https://overcoder.net/q/152345/%D0%BC%D0%BE%D0%B6%D0%BD%D0%BE-%D0%BB%D0%B8-%D1%81%D0%BE%D0%B7%D0%B4%D0%B0%D1%82%D1%8C-%D1%8D%D0%BA%D0%B7%D0%B5%D0%BC%D0%BF%D0%BB%D1%8F%D1%80-%D0%B2%D0%BB%D0%BE%D0%B6%D0%B5%D0%BD%D0%BD%D0%BE%D0%B3%D0%BE-%D0%BA%D0%BB%D0%B0%D1%81%D1%81%D0%B0-%D1%81-%D0%BF%D0%BE%D0%BC%D0%BE%D1%89%D1%8C%D1%8E-java-reflection
//package mypackage;
//
//        import java.lang.reflect.Modifier;
//
//public class Parent {
//
//    public static class Nested {
//        public Nested() {
//            System.out.println("Nested constructed");
//        }
//    }
//
//    public class Inner {
//        public Inner() {
//            System.out.println("Inner constructed");
//        }
//    }
//
//    public static void main(String... args) throws Exception {
//        // Construct nested class the normal way:
//        Nested nested = new Nested();
//
//        // Construct inner class the normal way:
//        Inner inner = new Parent().new Inner();
//
//        // Construct nested class by reflection:
//        Class.forName("mypackage.Parent$Nested").newInstance();
//
//        // Construct inner class by reflection:
//        Object parent = Class.forName("mypackage.Parent").newInstance();
//        for (Class<?> cls : parent.getClass().getDeclaredClasses()) {
//            if (!Modifier.isStatic(cls.getModifiers())) {
//                // This is an inner class. Pass the parent class in.
//                cls.getDeclaredConstructor(new Class[] { parent.getClass() }).newInstance(new Object[] { parent });
//            } else {
//                // This is a nested class. You can also use it here as follows:
//                cls.getDeclaredConstructor(new Class[] {}).newInstance(new Object[] {});
//            }
//        }
//    }
//}




class GreenhouseController2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        GreenhouseControls gc = new GreenhouseControls();
        // Вместо жесткой фиксации параметров в коде
        // можно было бы считать информацию
        // из текстового файла:
        gc.addEvent(gc.new Bell(900));
//        Event[] eventList = {
//                gc.new ThermostatNight(0),
//                gc.new LightOn(200),
//                gc.new FanOn(200),
//                gc.new HumidifierOn(200),
//                gc.new LightOff(400),
//                gc.new WaterOn(600),
//                gc.new WaterOff(800),
//                gc.new FanOff(200),
//                gc.new HumidifierOff(200),
//                gc.new ThermostatDay(1400),
//        };


        BufferedReader in = new BufferedReader(new FileReader("src/Thinking_in_Java/Chapter_18/Event.txt"));
        String s;
        LinkedList<String> ll = new LinkedList<>();

        while ((s = in.readLine())!= null) {
            ll.add(s);
        }
        in.close();

        Event[] eventList = new Event[ll.size()];

        int i = 0;

        Class<?> outer = gc.getClass();
//        Class<?> outer = GreenhouseControls.class;
        String outClass = outer.getSimpleName();
        for(String r: ll) {
            if (r != null) {
                String[] sm = r.split("\\?\\?");
                long offset = Long.parseLong(sm[1]);
//                System.out.println(Arrays.toString(sm));
//                System.out.println("Thinking_in_Java.Chapter_18." + outClass+ "$" + sm[0]);
                String name = "Thinking_in_Java.Chapter_18." + outClass+ "$" + sm[0];
                Class<Event> c = (Class<Event>)Class.forName(name);
//                Class<Event> c = (Class<Event>)Class.forName("Thinking_in_Java.Chapter_18." + outClass + "$HumidifierOn");

//                long offset = 0;
//                System.out.println(c.getCanonicalName());

//                Class cla = Class.forName("Thinking_in_Java.Chapter_18.Ex11");
//                System.out.println(cla.newInstance().getClass().getSimpleName());


//                Constructor<?> constructor = c.getDeclaredConstructor(GreenhouseControls.class,long.class);
                Constructor<Event> constructor = c.getConstructor(new Class<?>[] { GreenhouseControls.class, long.class });

                System.out.println(constructor.toString());
//
////                Event innerInstance = (Event) constructor
////                        .newInstance(5);
////                System.out.println(innerInstance.getClass().getSimpleName());
//
//
//                Constructor<Event> ctor = c.getConstructor(
//                        outer, long.class);
//                events.add(new EventCreator(ctor, offset));
//                Constructor[] construct = c.getDeclaredConstructors();
//                Event instance = (Event) construct[0].newInstance(sm[1]);
//                gc.addEvent((Event) ctor.newInstance(Long.parseLong(sm[1])));
//                constructor.setAccessible(true);
//                Event instance = (Event) constructor.newInstance(outer,offset);
//                Event instance = (Event) constructor.newInstance(c,offset);
                Event instance = constructor.newInstance(new Object[] {
                        outer, offset
                });
                        eventList[i++] = instance;
            }
        }

        gc.addEvent(gc.new Restart(2000, eventList));
        if(args.length == 1)
            gc.addEvent(
                    new GreenhouseControls.Terminate(
                            new Integer(args[0])));
        gc.run();
    }
}

