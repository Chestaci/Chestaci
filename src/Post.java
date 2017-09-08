import java.util.Date;

public class Post {


        private long postId;
        private String title;
        private String text;
        private Date postedAt;

           Post(long postId, String title, String text, Date postedAt) {
            this.postId = postId;
            this.title = title;
            this.text = text;
            this.postedAt = postedAt;

        }

    public long getPostId() {
        return postId;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public Date getPostedAt() {return postedAt;}

    public void setPostId(long postId) { this.postId = postId < 0 ? 0 : postId;}

    public void setTitle(String title) {
        this.title = title;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setPostedAt(Date postedAt) {this.postedAt = postedAt;}
}
