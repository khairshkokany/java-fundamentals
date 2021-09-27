/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package lab02;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test void someLibraryMethodReturnsTrue() {
        Library classUnderTest = new Library();
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
    }

    @Test
    public void rollMethod(){
        assertEquals(4,Library.roll(4).length,"roll should return length of array = 4");

    }

    @Test
    public void duplicatedMethod (){
        int [] trueArr = {1,2,1,3};
        int [] falseArr = {1,2,3,4};
        assertTrue(Library.containsDuplicates(trueArr),"containsDuplicates should return true");
        assertFalse(Library.containsDuplicates(falseArr),"containsDuplicates should return false");
    }

    @Test
    public void averageMethod() {
        int[] avgArr = {10, 3, 3, 8};
        assertEquals(6, Library.calculating(avgArr), "average should return the average of array equal to 6");
    }
    @Test
    public void lowestMethod(){
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        int[] arrExpected = {55, 54, 60, 53, 59, 57, 61};

        assertArrayEquals(arrExpected, Library.lowestAvg(weeklyMonthTemperatures), "lowestAvg should return the lowest array in the parent array which is {55, 54, 60, 53, 59, 57, 61}");

    }
    }



