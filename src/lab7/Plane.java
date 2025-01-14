package lab7;

public class Plane {
    PlaneWing planeWing;

    public Plane() {
        planeWing = new PlaneWing();
    }

    public void setValue(double weightPlaneWing) {
        planeWing.setWeightPlaneWing(weightPlaneWing);
    }

    public void printInfo() {
        planeWing.printWeightPlaneWing();
    }

    private static class PlaneWing {
        double weightPlaneWing;

        public PlaneWing() {
            this.weightPlaneWing = 0;
        }

        public void setWeightPlaneWing(double weightPlaneWing) {
            this.weightPlaneWing = weightPlaneWing;
        }

        public void printWeightPlaneWing() {
            System.out.println(weightPlaneWing);
        }
    }
}
