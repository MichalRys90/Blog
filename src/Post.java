import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Post extends Entry{

    List<Comment> comments;
    private static int counter = 0;

    public Post(int id, User author, LocalDateTime postDate, String content) {
        super(id, author, postDate, content);
        comments = new ArrayList<>();
    }
    public Post() {
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public static int getPostId(){
        counter++;
        return counter;
    }
}
