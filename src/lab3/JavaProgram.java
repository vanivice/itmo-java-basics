package lab3;

public class JavaProgram {
    public static void main(String[] args) {
        Study learn = new Study("«Изучение Java - это просто!»");
        learn.printCourse();

        System.out.println("\n");

        Car oneCar = new Car();
        Car twoCar = new Car();

        oneCar.setColor(Color.BLACK);
        oneCar.setModel("Lexus");
        oneCar.setWeight(2.6);
        oneCar.printCar();

        System.out.println("\n");

        twoCar.setColor(Color.WHITE);
        twoCar.setModel("Toyota");
        twoCar.setWeight(2.0);
        twoCar.printCar();

        System.out.println("\n");

        House oneHouse = new House();
        House twoHouse = new House();

        oneHouse.setHouse("Hi-tech", 3, 2012);
        twoHouse.setHouse("Scandinavian", 1, 2007);

        oneHouse.getHouse();
        System.out.println("\n");
        twoHouse.getHouse();
        oneHouse.getYearBuild();

        System.out.println("\n");

        Tree oneTree = new Tree();
        Tree twoTree = new Tree(250, "Oak");
        Tree threeTree = new Tree(200, true, "Pine" );

        System.out.println(twoTree);
        System.out.println(threeTree);
    }
}