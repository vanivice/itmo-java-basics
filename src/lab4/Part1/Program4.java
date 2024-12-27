package lab4.Part1;

import java.util.Scanner;

public class Program4 {
    public static boolean printResTwo() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int numOne = scan.nextInt();
        System.out.println("Введите второе число: ");
        int numTwo = scan.nextInt();
        System.out.println("Введите третье число: ");
        int numThree = scan.nextInt();

        System.out.println(numOne < numTwo && numTwo < numThree);
        return numOne < numTwo && numTwo < numThree;
    }
}
