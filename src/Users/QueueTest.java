package Users;

public class QueueTest {
    public static void main(String[] arg) {
        Queue queue = new Queue();
        List n = new List();
        for(int i = 0; i < 10; i++) {

            queue.push(n);
            n.print(List.getUsers());
        }
        System.out.println(" ");
        while(queue.size() > 0) {

          queue.pull();
          n.print(List.getUsers());

            System.out.println("Размер очереди:" + queue.size());
            System.out.println(" ");
        }
    }
}
