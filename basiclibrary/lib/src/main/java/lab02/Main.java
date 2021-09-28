package lab02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main (String[] args) {

        System.out.println("hello world");
        Library library = new Library();
        System.out.println(Arrays.toString(library.roll(4)));
        int [] duplicate = new int []{11,5,7,9,12};
        System.out.println(Library.containsDuplicates(duplicate));
        int [] average = new int[] {15,17,19,21,23};
        System.out.println(Library.calculating(average));
        int[][] weeklyMonthTemperatures = new int[][]{
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        System.out.println(Arrays.toString(Library.lowestAvg(weeklyMonthTemperatures)));
        Library.hashMethod(weeklyMonthTemperatures);

        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");

        String winner = Library.tally(votes);
        System.out.println(winner + " received the most votes!");



    }


}
