import java.util.Date;

public class PrivateMessage extends Message {
    private Post post;

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public PrivateMessage() {
    }

    public PrivateMessage(int messageId, String text, User author, Date date, Post post) {
        super(messageId, text, author, date);
        this.post = post;

    }
}
