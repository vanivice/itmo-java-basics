package lab5;

public class Task1 {
    public static void theLongsWord(String text) {
            String[] words = text.replaceAll("\\p{Punct}", "").split("[\s+]");
            String longsWord = "";
            for (String word : words) {
                if (word.length() > longsWord.length()) {
                    longsWord = word;
                }
            }
            System.out.println(longsWord);
        }
}

