package lab4.Part2;

public class Program4 {
    public static void findUnique(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean res = true;
            for (int h = 0; h < array.length; h++) {
                if (array[i] == array[h] && i != h) {
                    res = false;
                }
            }

            if (res) {
                System.out.print("Первое уникальное число массива: " + array[i]);
                break;
            }
        }
    }
}