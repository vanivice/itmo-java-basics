package lab4.Part2;

public class Program1 {
    public static boolean isSorted(int... number) {
        for (int i = 0; i < number.length - 1; i++) {
            if (number[i] > number[i + 1]) {
                System.out.println("«Please, try again»");
                return false;
            }
        }
        System.out.println("«OK»");
        return true;
    }
}
