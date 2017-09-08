public class Bubble {
    public static void main(String[] args) {
        int post[] = {25, 3, 17, 1, 5};

        for(int i = 1; i < post.length; i++) {
            for (int j = i; (j >= 1) && (post[j] < post[j - 1]); j--) {
                int a = post[j];
                post[j] = post[j - 1];
                post[j - 1] = a;
            }
        }
        for (int b: post)
        System.out.println(b);

    }

}
