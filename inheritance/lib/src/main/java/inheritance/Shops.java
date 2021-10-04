package inheritance;

import java.util.ArrayList;

public class Shops extends Restaurant implements ResInterface{
    String description ;
    public Shops(String name, String description, String category) {

        super(name,4, category);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public ArrayList<Review> getReviews() {
        return super.getReviews();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double getRating() {
        return super.getRating();
    }

    @Override
    public String getPriceCategory() {
        return super.getPriceCategory();
    }

    @Override
    public void addReview(Review review) {
super.getReviews().add(review);
super.updateStars();
    }

    @Override
    public void updateStars() {

    }



        @Override

        public String toString() {
            return "Shops{" +
                    "name='" + getName() + '\'' +
                    ", rating=" + description +
                    ", category='" + getPriceCategory() + '\'' +
                    '}';
        }
    }

