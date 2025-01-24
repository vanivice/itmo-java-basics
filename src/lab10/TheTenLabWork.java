package lab10;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class TheTenLabWork {
    public static List<String> readTheFile(String file) {
        List<String> list = new ArrayList<>();

        try {
            for (String s : list = Files.readAllLines(Path.of(file))) {
                System.out.println(s);
            }

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return list;
    }

    public static void writeToFile(String text) {
        File file = new File("src/lab10/fish-text2.txt");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.write(text);

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void glueTheFile(String oneFile, String twoFile) {
        String text;
        File resFile = new File("src/lab10/fish-text3.txt");

        try (BufferedReader one = new BufferedReader(new FileReader(oneFile));
             BufferedReader two = new BufferedReader(new FileReader(twoFile));
             BufferedWriter three = new BufferedWriter(new FileWriter(resFile))) {

            while ((text = one.readLine()) != null) {
                three.write(text);
                three.write("\n");
            }

            while ((text = two.readLine()) != null) {
                three.write(text);
                three.write("\n");
            }

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void replTheFile(String file, String sub) {

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            List<String> list = new ArrayList<>();
            String input;

            while ((input = reader.readLine()) != null) {
                list.add(input);
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                StringBuilder stringBuilder = new StringBuilder();

                for (String s : list) {
                    stringBuilder.append(s.replaceAll("[^\\p{L}\\p{N}]", sub)).append(System.lineSeparator());
                }
                writer.write(stringBuilder.toString());

            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}