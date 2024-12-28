package lab5;

public class Task3 {
    public static String сensorship(String text, String wordBan) {
        wordBan = wordBan.toLowerCase();
        String result = text.replaceAll(wordBan, " [вырезано цензурой] ");
        System.out.println(result);
        return result;
    }
}
