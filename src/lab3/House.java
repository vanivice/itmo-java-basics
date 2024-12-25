package lab3;

public class House {
    private String nameHouse;
    private Integer numberFloors;
    private Integer yearBuild;

    public House() {
    }

    public House(String nameHouse, Integer numberFloors, Integer yearBuild) {
        this.nameHouse = nameHouse;
        this.numberFloors = numberFloors;
        this.yearBuild = yearBuild;
    }

    public House(Integer yearBuild) {
        this.yearBuild = yearBuild;
    }

    public void setHouse(String nameHouse, Integer numberFloors, Integer yearBuild) {
        this.nameHouse = nameHouse;
        this.numberFloors = numberFloors;
        this.yearBuild = yearBuild;
    }

    public void getHouse() {
        System.out.println("House name: " + nameHouse + "\nNumber of floors: " + numberFloors + "\nYear build : " + yearBuild);
    }

    public int getYearBuild() {
        java.time.LocalDate present = java.time.LocalDate.now();
        int result = present.getYear() - yearBuild;
        System.out.println("Number of years since construction: " + result);
        return result;
    }
}
