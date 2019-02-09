package Thinking_in_Java.Chapter_14.Project;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Operations {


    public static void main(String[] args) {
        Card card1 = new Card(1111);
        Card card2 = new Card(2222);
//        card1.checkBalance();
//        card2.checkBalance();
//        card1.replenish(100);
//        card1.takeoff(200);
//        card1.transfer(500, card2);
//        card2.checkBalance();
        InvocationHandler handler = new ProxyCard(card1);
        Class[] classes = new Class[] {Cards.class};
        Object proxy = Proxy.newProxyInstance(Cards.class.getClassLoader(), classes, handler);
 //       ((Cards)proxy).checkBalance();


//        InvocationHandler handler2 = new ProxyCard(card2);
//
//        Object proxy2 = Proxy.newProxyInstance(Cards.class.getClassLoader(), classes, handler2);
//        ((Cards)proxy2).checkBalance();
       // ((Cards) proxy).checkBalance();
       // ((Cards) proxy).replenish(1000);
      //  ((Cards) proxy).takeoff(100);
        ((Cards) proxy).transfer(500,card2);

        //card1.transfer(500, card2);

    }
}
