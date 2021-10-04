package inheritance;

import java.util.ArrayList;

public class Theater implements ResInterface  {


    private String theaterName;
    private ArrayList<String> moviesArray = new ArrayList<>();
    private ArrayList<Review> reviews = new ArrayList<>();
public Theater(String theaterName  ){

    this.theaterName = theaterName;

}

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public String getTheaterName() {
        return theaterName;
    }

    public ArrayList<String> getMoviesArray() {
        return moviesArray;
    }

    public void addMovies(String movieName){

            moviesArray.add(movieName);
        }
        public void removeMovies(String movieName){

            moviesArray.remove(movieName);
        }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public double getRating() {
        return 0;
    }

    @Override
    public String getPriceCategory() {
        return null;
    }

    @Override
    public void addReview(Review review) {
    this.reviews.add(review);
}

    @Override
    public void updateStars() {

    }

    public void addReviewMovies (Review review , String movieName){
    if (moviesArray.contains(movieName)){
        this.reviews.add(review);
        System.out.println("Thanks For Your Reviews");
    }else {
        System.out.println("This movies is not Found ..! ");
    }
}


    @Override
    public String toString() {
        return "Theater{" +
                "theaterName='" + theaterName + '\'' +
                ", moviesArray=" + moviesArray +
                ", reviews=" + reviews +
                '}';
    }
}
