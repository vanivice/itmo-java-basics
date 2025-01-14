package lab7;

public class Main {
    public static void main(String[] args) {
        Plane onePlane = new Plane();
        Plane twoPlane = new Plane();

        onePlane.setValue(148.987);
        twoPlane.setValue(298.245);

        onePlane.printInfo();
        twoPlane.printInfo();
    }
}
