package FIFO;

import com.sun.org.apache.xpath.internal.SourceTree;

public class QueueTest {
    public static void main(String[] arg) {
        ObjectQueue queue = new ObjectQueue();

//        for(int i=0; i<10; i++) {
//            // В данном случае мы складываем в очередь строки
//            queue.push("Строка:" + i);
//        }
//
//        while(queue.size() > 0) {
//            // Мы делаем жесткое приведение типа, т.к. знаем, что там лежат строки
//            String s = (String)queue.pull();
//            System.out.println(s);
//            System.out.println("Размер очереди:" + queue.size());

        queue.push("dog");
        queue.push("cat");
        queue.push("mouse");
        queue.push("raccoon");
        queue.push("rabbit");
        queue.push("dog2");
        queue.push("cat2");
        queue.push("mouse2");
        queue.push("raccoon2");
        queue.push("rabbit2");
        System.out.println(queue.size());
        System.out.println(queue.get(0));
        System.out.println(queue.get(1));
        System.out.println(queue.get(2));
        System.out.println(queue.get(3));
        System.out.println(queue.get(4));
        System.out.println(queue.get(5));
        System.out.println(queue.get(6));
        System.out.println(queue.get(7));
        System.out.println(queue.get(8));
        System.out.println(queue.get(9));
        System.out.println(queue.get(10));
        System.out.println(queue.get(11));
        System.out.println(queue.size());

        }

    }


//}
