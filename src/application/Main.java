package application;

import entities.Comment;
import entities.Post;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Post post = new Post(Instant.parse("2018-06-21T13:05:44-03:00"), "Traveling to new Zealand", "I'm going to visit this wonderful country!");
        Comment comment1 = new Comment("Have a nice trip");
        Comment comment2 = new Comment("Wow that's awesome");
        List<Comment> listComments = new ArrayList<>();
        listComments.add(comment1);
        listComments.add(comment2);
        post.setLikes(12);
        post.setComments(listComments);
        System.out.println(post);

        Post post2 = new Post(Instant.parse("2018-07-28T23:14:19-03:00"), "Good night guys", "See you tomorrow");
        Comment comment3 = new Comment("Good night");
        Comment comment4 = new Comment("May the force be with you");
        List<Comment> listComments2 = new ArrayList<>();
        listComments2.add(comment3);
        listComments2.add(comment4);
        post2.setLikes(5);
        post2.setComments(listComments2);
        System.out.println(post2);
    }
}
