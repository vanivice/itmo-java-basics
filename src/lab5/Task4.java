package lab5;

public class Task4 {
    public static int numOfEntries (String one, String two) {
        int result = (one.length() - one.replaceAll(two, "").length()) / two.length();
        System.out.println(result);
        return result;
    }
}