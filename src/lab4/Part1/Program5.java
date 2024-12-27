package lab4.Part1;

public class Program5 {
    public static boolean result(int... number) {
        System.out.println(number[0] == 3 || number[number.length - 1] == 3);
        return  number[0] == 3 || number[number.length - 1] == 3;
    }
}
