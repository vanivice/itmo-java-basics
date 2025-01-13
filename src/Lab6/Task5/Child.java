package Lab6.Task5;

public class Child extends Parent {
    @Override
    public void setMean() {
        name = scanner.next();
    }

    @Override
    public void getMean(){
        System.out.println(name);
    }
}
