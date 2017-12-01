package Stack;

public class TestSt {
    public static void main(String[] args) {
        ListStack a = new ListStack();
        a.push(new String("sdf1"));
        a.push(new String("sdf2"));
        a.push(new String("sdf3"));
        a.push(new Integer(1));
        a.push(new String("sdf5"));
        a.push(new String("sdf6"));
        a.pop();
        System.out.println(a.pop());
        System.out.println(a.pop());
        System.out.println(a.pop());
        System.out.println(a.pop());
        System.out.println(a.pop());
        //  System.out.println(a.pop());
    }
}