package inheritance;

public class Review  {

    private String body;
    private String author;
    private int rating;

    public Review (String body,String author , int rating) {

        this.body = body;
        this.author =author;
        this.rating = rating;
    }

    public String getBody() {
        return body;
    }

    public String getAuthor() {
        return author;
    }

    public int getRating() {
        return rating;
    }




    @Override
    public String toString() {
        return "Review{" +
                "body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", rating=" + rating +
                '}';
    }
}
