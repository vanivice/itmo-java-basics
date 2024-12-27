package lab4.Part2;

public class Program3 {
    public static void changePlace(int...number) {
        System.out.print ("Array 1: ");
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + ", ");
        }

        int one = number[0];
        int last = number[number.length - 1];
        number[0] = last;
        number[number.length - 1] = one;

        System.out.println();

        System.out.print ("Array 2: ");
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + ", ");
        }
    }
}
