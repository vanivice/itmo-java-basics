package lab6.Task3;

public class Truck extends Car {
    int numOfWheels;
    double maxWeight;

    public Truck (int w, String m, char c, float s, int numOfWheels, double maxWeight) {
        super(w, m, c, s);
        this.numOfWheels = numOfWheels;
        this.maxWeight = maxWeight;
    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
        System.out.println(numOfWheels);
    }
}
