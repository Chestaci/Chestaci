package Thinking_in_Java.Chapter_14;

public class Ex8 {
    public static void a (Class obj){
       // Class c = obj.getClass();
        if (obj != null) {
            System.out.println(obj.getSimpleName());
            Class cc = obj.getSuperclass();
            a(cc);
        }

//       if (cc != null) {
//           try {
//               Object obj2 = cc.newInstance();
//               a(obj2);
//           } catch (InstantiationException e) {
//               System.out.println("Не удалось создать экземпляр.");
//           } catch (IllegalAccessException e) {
//               System.out.println("Отказано в доступе.");
//           }
//       }
    }

    public static void main(String[] args) {
        Circle1 cir = new Circle1();
        Class c = cir.getClass();
        a(c);
    }
}
