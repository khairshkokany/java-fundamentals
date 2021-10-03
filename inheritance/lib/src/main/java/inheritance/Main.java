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

    }


}
