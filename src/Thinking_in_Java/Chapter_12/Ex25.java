package Thinking_in_Java.Chapter_12;

public class Ex25 {
    public static void main(String[] args) {
        A a = new C();
      try {
          a.a();
//      }catch (Exception e){
//          e.printStackTrace();
      } catch (MatchaException e) {
          System.out.println("MatchaException");
      }catch (GreenTeaException e) {
          System.out.println("GreenTeaException");
      } catch (TeaException e) {
          System.out.println("TeaException");
      }
    }
}

class A {
    public void a () throws TeaException{
        System.out.println("a () из A");
        throw new TeaException();
    }
}

class B extends A{
    @Override
    public void a() throws GreenTeaException {
        System.out.println("a () из B");
        throw new GreenTeaException();
    }
}

class C extends B {
    @Override
    public void a() throws MatchaException {
        System.out.println("a () из C");
        throw new MatchaException();
    }
}


class TeaException extends Exception{}
class GreenTeaException extends TeaException {}
class MatchaException extends GreenTeaException {}


