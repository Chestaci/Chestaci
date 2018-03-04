package Thinking_in_Java.Chapter_7;

public class Ex20 {
    //class FinalOverridingIllusion
    public static void main(String[] args) {
        OverridingPrivate2 op2 = new OverridingPrivate2();
        op2.f();
        op2.g();
//    Можно провести восходящее преобразование:
        OverridingPrivate op = op2;
//    Но методы при этом вызвать невозможно:
        //op.f();
        //op.g();
//    И то же самое здесь:
        WithFinals wf = op2;
        //wf.f();
        //wf.g();
    }
}

class WithFinals{
    //тоже что и просто private
    private final void f(){
        System.out.println("WithFinals.f()");
    }
    //также автоматически является private
    private void g(){
        System.out.println("WithFinals.g()");
    }
}

class OverridingPrivate extends WithFinals{
//    @Override
    private final void f(){
        System.out.println("OverridingPrivate.f()");
    }
    //@Override
    private void g(){
        System.out.println("OverridingPrivate.g()");
    }
}

class OverridingPrivate2 extends OverridingPrivate{
    //@Override
    public final void f(){
        System.out.println("OverridingPrivate2.f()");
    }
    //@Override
    public void g(){
        System.out.println("OverridingPrivate2.g()");
    }
}
