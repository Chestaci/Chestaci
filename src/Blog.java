import java.util.Date;

public class Blog {
    public static void main(String[] args) {

//Post post = new Post(1, "first", "first1");
//        System.out.println(post.getPostId());
//        System.out.println(post.getTitle());
//        System.out.println(post.getText());
//        System.out.println(post.toString());
//
        Date data1 = new Date();
//        long x1 = data1.getTime();

        Date data2 = new Date();
//        long x2 = data2.getTime();

        Date data3 = new Date();
//        long x3 = data3.getTime();

        Date data4 = new Date();
//        long x4 = data4.getTime();

        Date data5 = new Date();
//        long x5 = data5.getTime();

        Date data6 = new Date();
//        long x6 = data6.getTime();

        Date data7 = new Date();
//        long x7 = data7.getTime();

        Post[] posts = new Post[7];
        posts[0] = new Post(24,"Night", "Hello", data1);
        posts[1] = new Post(23,"Day" ,"Yes", data2);
        posts[2] = new Post(2, "Star", "Smile", data3);
        posts[3] = new Post(5, "World", "Tea", data4);
        posts[4] = new Post(16, "Moon", "Carrot", data5);
        posts[5] = new Post(42, "Pool", "Apple", data6);
        posts[6] = new Post(8, "Card", "Hats", data7);

        for (Post a: posts)
            System.out.println(a.getPostId() +" " + a.getTitle() + " " + a.getText() + " " + a.getPostedAt());


       }
}
