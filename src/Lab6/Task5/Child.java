package Lab6.Task5;

public class Child extends Parent {
    void setName() {
        name = scanner.next();
    }

    String getName(){
        System.out.println(name);
        return name;
    }
}
