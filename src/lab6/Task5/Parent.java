package lab6.Task5;
import java.util.Scanner;

public class Parent {
    protected int age;
    protected String name;

    Scanner scanner = new Scanner(System.in);

    public void setMean() {
        age = scanner.nextInt();
    }

    public void getMean() {
        System.out.println(age);
    }
}
