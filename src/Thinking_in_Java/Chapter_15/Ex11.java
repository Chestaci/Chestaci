package Thinking_in_Java.Chapter_15;

import Chestaci.Robot.Robot;
import Thinking_in_Java.Chapter_14.Ex11.typeinfo.pets.Cat;
import Thinking_in_Java.Chapter_14.Ex12.coffee.Coffee;
import net.mindview.util.New;

import java.util.*;

public class Ex11 {
    public static void main(String[] args) {
        Map<Cat,Robot> map = New.map();
        List<Coffee> coffees = New.list();

        List<A> list = New.list();
        list.add(new A());
        list.add(new A());
        list.add(new A());
        Map<B, List<A>> listMap = New.map();
        listMap.put(new B(), list);
        Set<C> set = New.set();
        set.add(new C());
        set.add(new C());
        set.add(new C());
        LinkedList<B> linkedList = New.lList();
        linkedList.add(new B());
        linkedList.add(new B());
        linkedList.add(new B());
        linkedList.add(new B());
        linkedList.add(new B());
        Queue<C> queue = New.queue();
        queue.add(new C());
        queue.add(new C());
        queue.add(new C());
        System.out.println(list);
        System.out.println(listMap);
        System.out.println(set);
        System.out.println(linkedList);
        System.out.println(queue);
    }
}

class A{
    @Override
    public String toString() {
        return "A";
    }
}

class B{
    @Override
    public String toString() {
        return "B";
    }
}

class C{
    @Override
    public String toString() {
        return "C";
    }
}
