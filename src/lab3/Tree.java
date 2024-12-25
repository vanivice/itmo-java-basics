package lab3;

public class Tree {
    private Integer age;
    private boolean isLife;
    private String name;

    public Tree() {
        System.out.println("«Пустой конструктор без параметров сработал»");
    }

    public Tree(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public Tree(Integer age, boolean isLife, String name) {
        this.age = age;
        this.isLife = isLife;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Tree {" +
                "age = " + age +
                ", isLife = " + isLife +
                ", name = '" + name + '\'' +
                '}';
    }
}
