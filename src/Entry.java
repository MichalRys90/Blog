import java.time.LocalDateTime;

abstract class Entry {

    private int id;
    private User author;
    private LocalDateTime postDate;
    private String content;

    public Entry(int id, User author, LocalDateTime postDate, String content) {
        this.id = id;
        this.author = author;
        this.postDate = postDate;
        this.content = content;
    }
    public Entry() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public LocalDateTime getPostDate() {
        return postDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "id=" + id +
                ", author=" + author +
                ", postDate=" + postDate +
                ", content='" + content + '\'' +
                '}';
    }
}
