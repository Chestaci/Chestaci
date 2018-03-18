package Thinking_in_Java.Chapter_8;

public class Ex13 {
    public static void main(String[] args) {
        ReferenceCounting.main(args);
    }
}

class Shared {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;

    public Shared() {
        System.out.println("Создаем " + this);
    }
    public void addRef(){
        refcount++;
    }
    protected void dispose(){
        if(--refcount == 0){
            System.out.println("Уничтожаем " + this);
        }
    }

    @Override
    public String toString() {
        return "Shared " + id;
    }
    protected void finalize() throws Throwable {
        if(refcount != 0){
            System.out.println("error dispose");
//            try {
//                super.finalize();
//            } catch (Throwable throwable) {
//                throwable.printStackTrace();
//            }
        }
    }
}

class Composing{
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;

    public Composing(Shared shared) {
        System.out.println("Создаем " + this);
        this.shared = shared;
        this.shared.addRef();
    }
    protected void dispose(){
        System.out.println("Уничтожаем " + this);
        shared.dispose();
    }

    @Override
    public String toString() {
        return "Composing " + id;
    }
}

class ReferenceCounting{

    public static void main(String[] args) {
        Shared shared = new Shared();
        Composing[] composing = {new Composing(shared), new Composing(shared), new Composing(shared), new Composing(shared), new Composing(shared)};
        for(Composing c: composing){
            c.dispose();
        }
        System.gc();
        System.runFinalizersOnExit(true);
        System.gc();
    }
}