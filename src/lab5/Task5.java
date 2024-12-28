package lab5;

public class Task5 {
    public static void invertWordsText(String text) {

        System.out.print("The given string is: " + text + "\n");
        System.out.print("The string reversed word by word is: ");
        for (String word : text.split(" ")) {
            StringBuilder reverse = new StringBuilder(word).reverse();
            System.out.print(reverse + " ");
        }
    }
}
