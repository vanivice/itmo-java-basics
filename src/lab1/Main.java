package lab1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java.\n");

        int res = (46 + 10) * (10 / 3);
        int res2 = (29) * (4) * (15);

        int number = 10500;
        int result1 = (number / 10) / 10;
        System.out.println(result1);

        double one = 3.6;
        double two = 4.1;
        double three = 5.9;
        double result2 = one * two * three;
        System.out.println(result2);

        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

        int b = 120;
        if (b % 2 != 0 && b <= 100) {
            System.out.println("Нечетное");
        } else if (b % 2 == 0 && b <= 100) {
            System.out.println("Четное");
        } else if (b > 100 && b % 2 == 0) {
            System.out.println("Выход за пределы диапазона");
        }
    }
}