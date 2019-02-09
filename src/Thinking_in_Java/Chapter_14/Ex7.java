package Thinking_in_Java.Chapter_14;

public class Ex7 {
}

class Candy{
    static {
        System.out.println("Загрузка класса Candy");
    }
}

class Gum{
    static {
        System.out.println("Загрузка класса Gum");
    }
}

class Cookie{
    static {
        System.out.println("Загрузка класса Cookie");
    }
}

class SweetShop{
    public static void main(String[] args) {
//        System.out.println("в методе main");
//        new Candy();
//        System.out.println("После создания объекта Candy");
//        try{
//            Class.forName("Gum");
//        } catch (ClassNotFoundException e){
//            System.out.println("Не удалось найти Gum");
//        }
//        System.out.println("Class.forName(\"Gum\")");
//        new Cookie();
//        System.out.println("После создания объекта Cookie");

        Class c = null;
        try{
            c = Class.forName(args[0]);
        } catch (ClassNotFoundException e) {
            System.out.println("Не удаётся найти объект.");
            System.exit(1);
        }

        Object obj = null;
        try{
            obj = c.newInstance();
            System.out.println(c.newInstance().toString());
        } catch (IllegalAccessException e) {
            System.out.println("Отказано в доступе.");
            System.exit(1);
        } catch (InstantiationException e) {
            System.out.println("Не удалось создать экземпляр.");
            System.exit(1);
        }
        System.out.println(obj.getClass().getSimpleName());

    }
}