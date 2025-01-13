package lab6.Task4;
import java.util.Scanner;

public class Child extends Parent {
    public void printParent() {
        Scanner scanner = new Scanner(System.in);
        integer = scanner.nextInt();
        System.out.println(integer);
    }
}

