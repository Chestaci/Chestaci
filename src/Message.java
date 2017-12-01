import java.util.Date;

public class Message {
    private int messageId;
    private String text;
    private User author;
    private Date date;

    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Message() {
    }

    public Message(int messageId, String text, User author, Date date) {
        this.messageId = messageId;
        this.text = text;
        this.author = author;
        this.date = date;
    }
    public void send(){
//будет вызывать метод add у класса MessageStore.
    }
}
