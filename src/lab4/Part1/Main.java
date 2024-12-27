package lab4.Part1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Первая программа: ");
        Program1 one = new Program1();
        one.printResOdd(100);

        System.out.println("\nВторая программа: ");
        Program2 two = new Program2();
        two.printResOption(100);

        System.out.println("\n\nТретья программа: ");
        Program3 three = new Program3();
        three.printResOne();

        System.out.println("\nЧетвертая программа: ");
        Program4 four = new Program4();
        four.printResTwo();

        System.out.println("\nПятая программа: ");
        Program5 five = new Program5();
        five.result(5, 4, 5, 4, -6, 7);

        System.out.println("\nШестая программа: ");
        Program6 six = new Program6();
        System.out.println(six.isContains(3, 4, 5, 5, 6, 7));
    }
}
