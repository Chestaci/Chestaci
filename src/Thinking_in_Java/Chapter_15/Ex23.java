package Thinking_in_Java.Chapter_15;

public class Ex23 {
}

interface FactoryI<T> {
        T create(Integer s);
        }
class Foo2<T> {
    private T x;
    public <F extends FactoryI<T>> Foo2(F factory) {
        x = factory.create(5);
    }
// ...
}
class IntegerFactory implements FactoryI<Integer> {
    public Integer create(Integer s) {
        return new Integer(0);
    }

    }

class Widget {
    public static class Factory implements FactoryI<Widget> {
        public Widget create(Integer s) {
            return new Widget();
        }
    }
}
class FactoryConstraint {
    public static void main(String[] args) {
        new Foo2<Integer>(new IntegerFactory());
        new Foo2<Widget>(new Widget.Factory());
    }
}
