public class Main {
    public static void main(String[] args) {
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

        flipNHeads(2);
    }

     public static String pluralize(String Str, int inter) {
         if (inter == 0 || inter > 1) {
             return Str + 's';
         } else {
             return Str;
         }
     }

     public static void flipNHeads(int inters) {

int flip =0 ;
int heads = 0;
while ( heads!=inters){

             if (Math.random() < 0.5) {
                 heads=0;
                 flip++;
                 System.out.println("tails");
             }else {
                 heads++;
                 flip++;
                 System.out.println("heads");

             }
         }
         System.out.println( ("It took " + flip + "flips to flip" + inters + "head in a row "));

}

}
