package lab4.Part1;

public class Program6 {
    public static boolean isContains(int... number) {
        for (int i = 0; i < number.length; i++) {
           if (number[i] == 1 || number[i] == 3) {
               return true;
           }
        }
        return false;
    }
}


