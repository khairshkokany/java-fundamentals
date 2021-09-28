/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test void someLibraryMethodReturnsTrue() {
        Library classUnderTest = new Library();
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
    }

    @Test
    @DisplayName("first method without errors")
    void linter() {
        Library classUnderTest = new Library();
        Path noErrors = Paths.get("C:\\Users\\STUDENT\\401class\\java-fundamentals\\linter\\resources\\noerrors.js");
        assertEquals(0,classUnderTest.linter(noErrors) , "no Errors ");
    }
    @Test
    @DisplayName("first method without errors")
    void linter1() {
        Library classUnderTest = new Library();
        Path oneError = Paths.get("C:\\Users\\STUDENT\\401class\\java-fundamentals\\linter\\resources\\oneerrors.js");
        assertEquals(1,classUnderTest.linter(oneError) , "We have one Error");
    }
    @Test
    @DisplayName("first method without errors")
    void linter2() {
        Library classUnderTest = new Library();
        Path fewError = Paths.get("C:\\Users\\STUDENT\\401class\\java-fundamentals\\linter\\resources\\fewerrors.js");
        assertEquals(3,classUnderTest.linter(fewError) , "We have a few Errors");
    }
    @Test
    @DisplayName("first method without errors")
    void linter3() {
        Library classUnderTest = new Library();
        Path manyError = Paths.get("C:\\Users\\STUDENT\\401class\\java-fundamentals\\linter\\resources\\manyerrors.js");
        assertEquals(6,classUnderTest.linter(manyError) , "We have Many Errors ");
    }
}
