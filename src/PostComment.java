import java.util.Date;

public class PostComment extends Message {
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public PostComment() {
    }

    public PostComment(int messageId, String text, User author, Date date, User user) {
        super(messageId, text, author, date);
        this.user = user;
    }
}
