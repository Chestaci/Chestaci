package Thinking_in_Java.Chapter_10;

public class Ex12 {
    public static void main(String[] args) {
        HorrorShow.main(args);
    }
}

interface Monster{
    void menace();
}

interface DangerousMonster extends Monster{
    void destroy();
}

interface Lethal{
    void kill();
}

//class DragonZilla implements DangerousMonster{
//    public void menace(){}
//    public void destroy(){}
//}

class DragonZilla {

    public DangerousMonster dangerousMonster () {
        return new DangerousMonster() {
            @Override
            public void destroy() {
                System.out.println("Сработал метод destroy dm");
            }

            @Override
            public void menace() {
                System.out.println("Сработал метод menace dm");
            }
        };
    }

}


interface Vampire extends DangerousMonster,Lethal{
    void drinkBlood();
}

//class VeryBadVampire implements Vampire{
//    public void menace(){}
//    public void destroy(){}
//    public void kill(){}
//    public void drinkBlood(){}
//}

class VeryBadVampire {
    public Vampire vampire() {
        return new Vampire() {
            @Override
            public void drinkBlood() {
                System.out.println("Сработал метод drink blood v");
            }

            @Override
            public void destroy() {
                System.out.println("Сработал метод destroy v");
            }

            @Override
            public void kill() {
                System.out.println("Сработал метод kill v");
            }

            @Override
            public void menace() {
                System.out.println("Сработал метод menace v");
            }
        };
    }

}

class HorrorShow{
    static void u(Monster b){
        b.menace();
    }
    static void v(DangerousMonster d){
        d.menace();
        d.destroy();
    }
    static void w(Lethal l){
        l.kill();
    }

    public static void main(String[] args) {
        DangerousMonster barney = new DragonZilla().dangerousMonster();
        u(barney);
        v(barney);
        Vampire vlad = new VeryBadVampire().vampire();
        u(vlad);
        v(vlad);
        w(vlad);
    }
}