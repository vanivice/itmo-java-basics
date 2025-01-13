package lab6.Task1and2;

public abstract class Human implements InterfaceUser {
    protected String firstName;
    protected String lastName;

    abstract void printAllInfo();
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Human(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public void printInfo() {
        System.out.println(getFirstName() + " " + getLastName());
    }
}
