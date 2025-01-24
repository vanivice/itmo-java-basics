package lab10;

import java.io.IOException;

import static lab10.TheTenLabWork.*;

public class Main {
    public static void main(String[] args) throws IOException {

        readTheFile("src/lab10/fish-text1.txt");

        writeToFile("java forever\n");

        glueTheFile("src/lab10/fish-text1.txt",
                "src/lab10/fish-text2.txt");

        replTheFile("src/lab10/fish-text1.txt", "\\$");
    }
}
