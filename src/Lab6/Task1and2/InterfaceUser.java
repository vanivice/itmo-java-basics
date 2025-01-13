package Lab6.Task1and2;

public interface InterfaceUser {

    default void print() {
        System.out.println("Имя и Фамилия пользователя: ");
    }

    void printInfo();
}