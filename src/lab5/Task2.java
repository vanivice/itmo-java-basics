package lab5;

public class Task2 {
    public static Boolean isPalindrome(String word) {
        StringBuilder builder = new StringBuilder(word);
        System.out.println(builder.reverse().toString().equalsIgnoreCase(word));
        return(builder.reverse().toString().equalsIgnoreCase(word));
    }
}
