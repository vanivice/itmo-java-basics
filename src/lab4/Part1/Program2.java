package lab4.Part1;
import java.util.Arrays;

public class Program2 {
    public static void printResOption(int quan) {
        int x = 1;
        int y = 1;
        int z = 1;

        System.out.print("Делится на 3: ");
        while (x < quan) {
            x++;

            if (x % 3 == 0) {
                System.out.print(x + ", ");
                continue;
            }

            if (x > quan) {
                break;
            }
        }
        System.out.println();

        System.out.print("Делится на 5: ");
        while (y < quan) {
            y++;

            if (y % 5 == 0) {
                System.out.print(y + ", ");
                continue;
            }

            if (y > quan) {
                break;
            }
        }
        System.out.println();

        System.out.print("Делится на 3 и на 5: ");
        while (z < quan) {
            z++;

            if (z % 3 == 0 && z % 5 == 0) {
                System.out.print(z + ", ");
                continue;
            }

            if (z > quan) {
                break;
            }
        }
    }
}
