package inheritance;

public class Main {

    public static void main(String[] args) {
        System.out.println("hello from main ");

        Restaurant restaurant = new Restaurant("FireFly",4,"$");
        Restaurant restaurant1 = new Restaurant("Beauty & the Beef " ,5 ,"$$");
        Restaurant restaurant2 = new Restaurant("Burger Makers",4,"$");


        Review review = new Review("The burger is good but not juciy so you can be more better than this ","Khair Shkokany",3);
        Review review1 = new Review("So Perfect , the burger so juicy and tasty Thank you For this Burger i'm So happy ","Ahmad Jaber",5);
        Review review2 = new Review("So Perfect , the burger so juicy and tasty Thank you For this Burger i'm So happy ","Ahmad Jaber",10);

        restaurant.addReview(review);
        restaurant1.addReview(review1);
        restaurant2.addReview(review);
        restaurant2.addReview(review1);
        restaurant2.addReview(review2);

        System.out.println(restaurant.getReviews());
        System.out.println(restaurant);
        System.out.println(restaurant2.getReviews());
        System.out.println(restaurant2);


        Shops shops1 = new Shops("MostWanted" , "the location in DownCity","$$");
        Shops shops2 = new Shops("City Center","the location is Jardenz","$$");

        Review review3 = new Review("this shop is so perfect and having all things you need it ","Khair Shkokany",5);
        Review review4 = new Review("City Center is the larger shops for pc builders","Yahia Shkokany",5);
        Review review5 = new Review("City Center is awesome shops","Hosam Shkokany",10);

        shops1.addReview(review3);
        shops2.addReview(review4);
        shops2.addReview(review5);

        System.out.println("\n");
        System.out.println(shops1.getReviews());
        System.out.println(shops1);
        System.out.println(shops2.getReviews());
        System.out.println(shops2);

        System.out.println("\n");

        Theater khairMovies = new Theater("Khair List Movies");

        khairMovies.addMovies("Suicide Squad");
        khairMovies.addMovies("The Godfather");
        khairMovies.addMovies("The Dark Knight");
        khairMovies.addMovies("Joker");

        System.out.println(khairMovies.getMoviesArray());

        khairMovies.removeMovies("The Godfather");
        System.out.println("\n");
        System.out.println(khairMovies.getMoviesArray());

        khairMovies.addReviewMovies(new Review("nice Movies" , "Khair shkokany",5),"Joker");
        System.out.println(khairMovies.getReviews());
        System.out.println("\n");
        System.out.println("\n");

        System.out.println(khairMovies);

    }


}
