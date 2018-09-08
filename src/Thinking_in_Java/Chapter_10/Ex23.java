package Thinking_in_Java.Chapter_10;

public class Ex23 extends GreenhouseControls {
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

class GreenhouseController2 {
    public static void main(String[] args) {
        Ex23 gc = new Ex23();
        // Вместо жесткой фиксации параметров в коде
        // можно было бы считать информацию
        // из текстового файла:
        gc.addEvent(gc.new Bell(900));
        Event[] eventList = {
                gc.new ThermostatNight(0),
                gc.new LightOn(200),
                gc.new FanOn(200),
                gc.new HumidifierOn(200),
                gc.new LightOff(400),
                gc.new WaterOn(600),
                gc.new WaterOff(800),
                gc.new FanOff(200),
                gc.new HumidifierOff(200),
                gc.new ThermostatDay(1400),
        };
        gc.addEvent(gc.new Restart(2000, eventList));
        if(args.length == 1)
            gc.addEvent(
                    new GreenhouseControls.Terminate(
                            new Integer(args[0])));
        gc.run();
    }
}