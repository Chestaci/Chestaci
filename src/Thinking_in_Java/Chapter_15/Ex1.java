package Thinking_in_Java.Chapter_15;

import Thinking_in_Java.Chapter_14.Ex11.typeinfo.pets.*;

public class Ex1 {
    public static void main(String[] args) {
        Holder3<Individual> holder = new Holder3<>(new Individual());
        System.out.println(holder.get());
        holder.set(new Cat());
        System.out.println(holder.get());
        holder.set(new Mutt());
        System.out.println(holder.get());
        holder.set(new Rat());
        System.out.println(holder.get());
        holder.set(new Rodent());
        System.out.println(holder.get());
    }
}
