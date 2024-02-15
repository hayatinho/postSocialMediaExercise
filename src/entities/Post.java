package entities;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Post {
    private Instant moment;
    private String title;
    private String content;
    private Integer likes;
    private List<Comment> comments;

    private DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());

    public Post(Instant moment, String title, String content) {
        this.moment = moment;
        this.title = title;
        this.content = content;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(title)
                .append("\n")
                .append(likes)
                .append(" Likes - ")
                .append(fmt.format(moment))
                .append("\n")
                .append(content)
                .append("\nComments:\n");

        if (comments != null) {
            for (Comment comment : comments) {
                sb.append(comment.getText()).append("\n");
            }
        } else {
            sb.append("No comments");
        }
        return sb.toString();
    }

}
