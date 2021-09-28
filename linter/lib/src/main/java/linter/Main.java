package linter;


import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Path paths = Paths.get("../linter/resources/gates.js");

        library.linter(paths);
    }

}