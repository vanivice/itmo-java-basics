package lab9;
import java.util.*;

public class TheNinthLabWork {
    static Set<Integer> RemoveDuplicate(List<Integer> integers){
        return new HashSet<>(integers);
    }

    static void resRemoveDuplicate() {
        List<Integer> integers = new ArrayList<>();

        integers.add(23);
        integers.add(1);
        integers.add(12);
        integers.add(2);
        integers.add(1);
        integers.add(1);

        System.out.printf(integers + "\n");
        System.out.printf(RemoveDuplicate(integers).toString());
    }

    static long start;
    static long stop;
    static long a;
    static long result;

    static void  requiredMethod() {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add((int) (Math.random() * 10));
        }
        stop = System.currentTimeMillis();

        result = stop - start;

        System.out.printf("\n\nВремя заполнения ArrayList: " + result + "\n");

        start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            linkedList.add((int) (Math.random() * 10));
        }
        stop = System.currentTimeMillis();

        result = stop - start;

        System.out.printf("Время заполнения LinkedList: " + result + "\n");

        start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            a = arrayList.get((int) (Math.random() * 1000000));
        }
        stop = System.currentTimeMillis();

        result = stop - start;

        System.out.printf("Время выполнения ArrayList: " + result + "\n");

        start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            a = linkedList.get((int) (Math.random() * 1000000));
        }
        stop = System.currentTimeMillis();

        result = stop - start;

        System.out.printf("Время выполнения LinkedList: " + result + "\n");
    }

    static class User {
        private String name;

        public User(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    static void statByName() {
        Scanner scanner = new Scanner(System.in);
        Map<User, Integer> map = new HashMap<>();
        map.put(new User("Иван"), (int)(Math.random() * 100));
        map.put(new User("Антон"), (int)(Math.random() * 100));
        map.put(new User("Игорь"), (int)(Math.random() * 100));
        map.put(new User("Руслан"), (int)(Math.random() * 100));
        System.out.print("\nВведите имя игрока: ");
        String name = scanner.nextLine();

        for (var entry : map.entrySet()) {

            if (entry.getKey().getName().equals(name)) {
                System.out.printf("Результат игрока равен: " + entry.getValue() + " очкам");
                return;
            }
        }
        System.out.println("Такого пользователя нет.");
    }
}