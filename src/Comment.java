import java.time.LocalDateTime;

public class Comment extends Entry {

    private static int counter = 0;

    public Comment(int id, User author, LocalDateTime postDate, String content) {
        super(id, author, postDate, content);
    }

    public static int getCommentId() {
        counter++;
        return counter;
    }
}
