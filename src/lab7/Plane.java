package lab7;

public class Plane {
    PlaneWing airbus = new PlaneWing();
    PlaneWing challenger = new PlaneWing();

    public void setValue() {
        airbus.setWeightPlaneWing(148.987);
        challenger.setWeightPlaneWing(298.245);
    }

    public void printInfo() {
        airbus.printWeightPlaneWing();
        challenger.printWeightPlaneWing();
    }

    private static class PlaneWing {
        double weightPlaneWing;

        public void setWeightPlaneWing(double weightPlaneWing) {
            this.weightPlaneWing = weightPlaneWing;
        }

        public void printWeightPlaneWing() {
            System.out.println(weightPlaneWing);
        }
    }
}
