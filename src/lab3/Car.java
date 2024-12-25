package lab3;

public class Car {
    private String model;
    private Color color;
    private double weight;

    public Car() {
    }

    public Car(Color color) {
        this.color = color;
    }

    public Car(Color color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void printCar() {
        System.out.println("Model: " + model + "\nColor: " + color.getDescription() + "\nWeight: " + weight);
    }
}
