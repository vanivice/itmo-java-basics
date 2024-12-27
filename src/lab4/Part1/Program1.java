package lab4.Part1;
import java.util.Arrays;

public class Program1 {
    public static void printResOdd(int quan) {
        for (int i = 1; i < quan; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}