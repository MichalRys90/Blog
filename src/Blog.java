import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Blog {

    private List<User> users;
    private List<Post> posts;
    List<Comment> comm = new ArrayList<>();

    public Blog() {
        users = new ArrayList<>();
        posts = new ArrayList<>();
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public void addPublishPost(int userId, String c) {

        try {
            if (users.get(userId - 1).getId() == userId) {
                posts.add(new Post(Post.getPostId(), new User(users.get(userId - 1).getId(), users.get(userId - 1).getFirstName(),
                        users.get(userId - 1).getLastName(), users.get(userId - 1).getNickName()), LocalDateTime.now(), c));
                System.out.println(users.get(userId - 1).getNickName() + " posted " + LocalDate.now() + ": " + c);
            } else {
                System.out.println("Cannot publish post - user of ID " + userId + " doesn't exist");
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Cannot publish post - user of ID " + userId + " doesn't exist");
        }
    }

    public void addCommentPost(int userId, int postId, String c) {

        try {
        if (posts.get(postId - 1).getId() == postId) {
            comm.add(new Comment(Comment.getCommentId(), new User(users.get(userId - 1).getId(),
                    users.get(userId - 1).getFirstName(), users.get(userId - 1).getLastName(),
                    users.get(userId - 1).getNickName()), LocalDateTime.now(), c));
            System.out.println(users.get(userId - 1).getNickName() + " commented " + posts.get(postId-1).getAuthor().getNickName() + " post: " + c);
        }
    } catch (IndexOutOfBoundsException e) {
            System.out.println("Cannot publish comment - post of ID " + postId + " doesn't exist");
        }
    }

    public void displayUserEntries(int userId){

        System.out.println("\n");
        try {
            System.out.println(users.get(userId - 1).getNickName() + " entries:");
            for (Post po : posts) {
                if (po.getAuthor().getId() == userId) {
                    System.out.println("(POST) " + po.getContent());
                }
            }
            for (Comment co : comm) {
                if (co.getAuthor().getId() == userId) {
                    System.out.println("(COMMENT) " + co.getContent());
                }
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("User with given userId doesnt exist");
        }
    }

    @Override
    public String toString() {
        return "Blog{" +
                "users=" + users +
                ", posts=" + posts +
                '}';
    }
}


