package Thinking_in_Java.Chapter_14.typeinfo.toys;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static net.mindview.util.Print.print;

interface HasBatteries {}
interface Waterproof {}
interface Shoots {}
interface NewInterface {}

class Toy {
    // Если удалить конструктор по умолчанию для класса Toy,
    // то у его наследника FancyToy нельзя будет создать экземпляр:
    public Toy() {
    }
    Toy(int i) {
    }

    @Override
    public String toString() {
        return "Toy{}";
    }
}

class FancyToy extends Toy
        implements HasBatteries, Waterproof, Shoots, NewInterface {
    FancyToy() {
        super(1);
    }
}

public class ToyTest {
    static void printInfo(Class cc) {
        print("Имя класса: " + cc.getName() + " является интерфейсом? [" + cc.isInterface() + "]");
        print("Простое имя: " + cc.getSimpleName());
        print("Каноническое имя: " + cc.getCanonicalName());
    }
    public static Toy makeToy(Class<?> cl, int i){
        try{
        Constructor[] ctors = cl.getConstructors();
        for (Constructor ctor: ctors) {
            System.out.println(ctor);
            Class<?>[] param = ctor.getParameterTypes();
            if (param.length == 1) if (param[0] == int.class)
                return (Toy) ctor.newInstance(new Object[]{Integer.valueOf(i)});
        }
        }catch(Exception e){
            throw new RuntimeException(e);
            } return null;
    }

    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("Thinking_in_Java.Chapter_14.typeinfo.toys.FancyToy");
        } catch (ClassNotFoundException e) {
            print("Не удается найти FancyToy");
            System.exit(1);
        }
        printInfo(c);
        for (Class face : c.getInterfaces())
            printInfo(face);
        Class up = c.getSuperclass();
        //////////////////////////////////////////////////////////////////////////////////////////////
//        Constructor[] ctors = up.getConstructors();
//        for (Constructor ctor: ctors) {
//            System.out.println(ctor);
//            Class<?>[] param = ctor.getParameterTypes();
//            if (param.length == 1)
//                if (param[0] == int.class) try {
//                    Toy toy = (Toy)ctor.newInstance(new Object[]{Integer.valueOf(1)});
//                    System.out.println(toy.toString());
//                   // printInfo(toy.getClass());
//                } catch (InstantiationException e) {
//                    e.printStackTrace();
//                } catch (IllegalAccessException e) {
//                    e.printStackTrace();
//                } catch (InvocationTargetException e) {
//                    e.printStackTrace();
//                }
//
//        }
        //System.out.println(makeToy(up, 1));

        try {
            System.out.println(Toy.class.getDeclaredConstructor(int.class).newInstance(1).toString());

            // catch four exceptions:
        } catch(NoSuchMethodException e) {
            print("No such method: " + e);
        } catch(InstantiationException e) {
            print("Unable make Toy: " + e);
        } catch(IllegalAccessException e) {
            print("Unable access: " + e);
        } catch(InvocationTargetException e) {
            print("Target invocation problem: " + e);
        }
        //////////////////////////////////////////////////////////////////////////////////////////////
        /*
        Object obj = null;
        try {
            // Необходим контруктор по умолчанию
            // создания Toy объекта:
            obj = up.newInstance();
        } catch (InstantiationException e) {
            print("Не удалось создать экземпляр");
            System.exit(1);
        } catch (IllegalAccessException i) {
            print("Отказано в доступе");
            System.exit(1);
        }
        printInfo(obj.getClass());
        */
    }
}

/*
"C:\Program Files\Java\jdk1.8.0_144\bin\java" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2017.2.3\lib\idea_rt.jar=59933:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2017.2.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_144\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\access-bridge.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_144\jre\lib\rt.jar;C:\Users\Настюша\IdeaProjects\Chestaci\out\production\Chestaci" Thinking_in_Java.Chapter_14.typeinfo.toys.ToyTest
Имя класса: Thinking_in_Java.Chapter_14.typeinfo.toys.FancyToy является интерфейсом? [false]
Простое имя: FancyToy
Каноническое имя: Thinking_in_Java.Chapter_14.typeinfo.toys.FancyToy
Имя класса: Thinking_in_Java.Chapter_14.typeinfo.toys.HasBatteries является интерфейсом? [true]
Простое имя: HasBatteries
Каноническое имя: Thinking_in_Java.Chapter_14.typeinfo.toys.HasBatteries
Имя класса: Thinking_in_Java.Chapter_14.typeinfo.toys.Waterproof является интерфейсом? [true]
Простое имя: Waterproof
Каноническое имя: Thinking_in_Java.Chapter_14.typeinfo.toys.Waterproof
Имя класса: Thinking_in_Java.Chapter_14.typeinfo.toys.Shoots является интерфейсом? [true]
Простое имя: Shoots
Каноническое имя: Thinking_in_Java.Chapter_14.typeinfo.toys.Shoots
Не удалось создать экземпляр
//////////Имя класса: Thinking_in_Java.Chapter_14.typeinfo.toys.Toy является интерфейсом? [false]
//////////Простое имя: Toy
//////////Каноническое имя: Thinking_in_Java.Chapter_14.typeinfo.toys.Toy
*/
