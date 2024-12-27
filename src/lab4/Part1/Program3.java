package lab4.Part1;

import java.util.Scanner;

public class Program3 {
    public static boolean printResOne() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int numOne = scan.nextInt();
        System.out.println("Введите второе число: ");
        int numTwo = scan.nextInt();
        System.out.println("Введите третье число: ");
        int numThree = scan.nextInt();

        System.out.println(numOne + numTwo == numThree);
        return numOne + numTwo == numThree;
    }
}
