package Thinking_in_Java.Chapter_11;

import java.util.LinkedList;
import java.util.Queue;

public class Ex27 {
    void runQueue (Queue<Command> queue){
        while (queue.peek() != null) {
            System.out.println(queue.remove().operation());
        }
    }

    public static void main(String[] args) {
        Ex27 e = new Ex27();
        QueueCommand q = new QueueCommand();
        e.runQueue(q.m());
    }

}

class Command {
    String s;
    String operation (){
        return s;
    }

    public Command(String s){
        this.s = s;
    }
}

class QueueCommand {
    Queue<Command> m (){
        Queue<Command> queue = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            queue.offer(new Command(new Integer(i).toString()));
        }
        return queue;
    }
}