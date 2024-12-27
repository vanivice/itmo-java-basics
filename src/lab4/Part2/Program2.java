package lab4.Part2;

import java.util.Arrays;
import java.util.Scanner;

public class Program2 {
    public static int[] setAnArray() {
        System.out.println("Введите длину массива: ");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int[] array = new int[x];

        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        System.out.println("Array length: " + x);
        return array;
    }

    public static void printArray(int[] array) {
        System.out.println("Numbers of array: ");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("Result: " + Arrays.toString(array));
    }
}
