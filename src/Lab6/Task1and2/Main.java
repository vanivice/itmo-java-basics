package Lab6.Task1and2;

public class Main {
    public static void main(String[] args) {
        Client clientOne = new Client("Иван", "Иванов", "Сбер");
        clientOne.printAllInfo();

        BankOfficer officerOne = new BankOfficer("Игорь", "Игоревич", "Т-Банк");
        officerOne.printAllInfo();

        clientOne.print();
        clientOne.printInfo();
    }
}
