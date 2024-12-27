package lab4.Part2;

import static lab4.Part2.Program2.setAnArray;

public class Main {
    public static void main(String[] args) {
        System.out.println("Первая программа: ");
        Program1 one = new Program1();
        one.isSorted(1, 10, 15, 16, 18, 200);
        one.isSorted(2, 45, 4, 123, 12, 1);

        System.out.println("\nВторая программа: ");
        Program2 two = new Program2();
        two.printArray(setAnArray());

        System.out.println("\nТретья программа: ");
        Program3 three = new Program3();
        three.changePlace(5, 6, 7, 2);


        System.out.println("\n\nЧетвертая программа: ");
        Program4 four = new Program4();
        int[] array = {5, 7, 5, 5, 7, 9};
        four.findUnique(array);
    }
}
