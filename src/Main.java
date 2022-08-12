import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        User user = new User(User.getUserId(), "Michal", "Rys", "Pomiot");
        User user1 = new User(User.getUserId(), "Adam", "Adamski", "murarz");
        User user2 = new User(User.getUserId(), "Ania", "Damska", "dziwucha22");
        User user3 = new User(User.getUserId(), "Damian", "Rogalski", "Zenek22");
        Blog blog = new Blog();
        List<User> list = blog.getUsers();
        list.add(user);
        list.add(user1);
        list.add(user2);
        list.add(user3);
        blog.addPublishPost(1, "Zyrafa najwyzsza forma zycia");
        blog.addPublishPost(2, "Czas nie zawsze przemija w jednakowym rytmie. To my o tym decydujemy");
        blog.addPublishPost(3, "Jaki jest obiektowy sposob na zdobycie fortuny? Dziedziczenie!");
        blog.addPublishPost(100, "Hej");
        System.out.println();
        System.out.println();
        blog.addCommentPost(3, 1, "Najwyzsza forma zycia jest zyrafa stojaca na taborecie!");
        blog.addCommentPost(1, 2, "To bardzo prawdziwe. Chyba cytat z Paulo Coelho");
        blog.addCommentPost(4, 2, "Madre slowa.");
        blog.addCommentPost(1, 3, "Tak, a grupa krwi programisty to C++!");
        blog.addCommentPost(2, 3, "Haha, usmialem sie!");
        blog.displayUserEntries(1);

    }
}