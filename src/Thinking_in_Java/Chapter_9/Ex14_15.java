package Thinking_in_Java.Chapter_9;

public class Ex14_15 extends ACDC implements AbCdEf{
    @Override
    public void a() {

    }

    @Override
    public void b() {

    }

    @Override
    public void c() {

    }

    @Override
    public void d() {

    }

    @Override
    public void f() {

    }

    @Override
    public void e() {

    }

    @Override
    public void Abcdef() {

    }

    static void qw(Ba ba){
        ba.a();
        ba.b();
    }
    static void we(Dc dc){
        dc.c();
        dc.d();
    }
    static void er(Ef ef){
        ef.e();
        ef.f();
    }
    static void rt(AbCdEf abCdEf){
        abCdEf.Abcdef();
        abCdEf.a();
        abCdEf.b();
        abCdEf.c();
        abCdEf.d();
        abCdEf.e();
        abCdEf.f();
    }

    public static void main(String[] args) {
        Ex14_15 ex14 = new Ex14_15();
        ex14.a();
        ex14.Abcdef();
        ex14.b();
        ex14.c();
        ex14.d();
        ex14.e();
        ex14.f();
        er(ex14);
        we(ex14);
        qw(ex14);
        rt(ex14);
    }
}

interface Ba{
    void a();
    void b();
}

interface Dc{
    void c();
    void d();
}

interface Ef{
    void f();
    void e();
}

interface AbCdEf extends Ba, Dc, Ef{
    void Abcdef();
}

    abstract class ACDC {

}

