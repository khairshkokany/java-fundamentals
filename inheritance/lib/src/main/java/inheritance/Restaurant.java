package inheritance;

import java.util.ArrayList;

public class Restaurant implements ResInterface {

    private String name;
    private int rating;
    private String priceCategory;

    private ArrayList<Review> reviews = new ArrayList<>();

    public Restaurant(String name , int rating , String category) {
        this.name = name;
        this.rating = rating;
        this.priceCategory = category;

    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public String getName() {
        return name;
    }

    public String getPriceCategory() {
        return priceCategory;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public void addReview(Review review) {
        this.reviews.add(review);
        updateStars();

    }

    @Override
    public void updateStars() {

double review = 0;
for (int i = 0 ; i< getReviews().size();i++){
    review += getReviews().get(i).getRating();
    }
        review = review/(getReviews().size());
        review = Math.round(review);
        this.rating = (int) review;
    }




    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                ", category='" + priceCategory + '\'' +
                '}';
    }
}
