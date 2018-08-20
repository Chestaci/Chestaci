package Thinking_in_Java.Chapter_9;

public interface Ex12 {
    public static void main(String[] args) {
        Adventure.main(args);
    }
}

interface CanFight{
    void fight();
}

interface CanSwim{
    void swim();
}

interface CanFly{
    void fly();
}

interface CanClimb{
    void climb();
}

class ActionCharacter{
    public void fight() {

    }
}

class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly, CanClimb{

    @Override
    public void swim() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void climb() {

    }
}

class Adventure{
    public static void t(CanFight x){
        x.fight();
    }
    public static void u(CanSwim x){
        x.swim();
    }
    public static void v(CanFly x){
        x.fly();
    }
    public static void w(ActionCharacter x){
        x.fight();
    }
    public static void c(CanClimb x){
        x.climb();
    }
    public static void main(String[] args){
        Hero h = new Hero();
        t(h); // Используем объект в качестве типа CanFight
        u(h); // Используем объект в качестве типа CanSwim
        v(h); // Используем объект в качестве типа CanFly
        w(h); // Используем объект в качестве типа ActionCharacter
        c(h); // Используем объект в качестве типа CanClimb
    }
}