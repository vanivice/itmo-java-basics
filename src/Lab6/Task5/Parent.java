package Lab6.Task5;
import java.util.Scanner;

public class Parent {
    protected int age;
    protected String name;

    Scanner scanner = new Scanner(System.in);

    public void setAge() {
        age = scanner.nextInt();
    }

    public int getAge() {
        System.out.println(age);
        return age;
    }
}
