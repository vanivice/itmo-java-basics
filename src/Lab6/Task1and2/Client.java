package Lab6.Task1and2;

public class Client extends Human {
    private String bankName;

    public Client(String firstName, String lastName, String bankName) {
        super(firstName, lastName);
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }

    @Override
    void printAllInfo() {
        System.out.println(getFirstName() + " " + getLastName() + " " + getBankName() + "\n");
    }
}
