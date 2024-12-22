package lab2;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.add(5, 10);
        calc.div(9, 8);
        calc.mult(5, 5);
        calc.subt(20, 10);

        User user = new User();
        System.out.println(user);
        user.setPost("Operator");
        user.setName("Ivan Ivanov");
        user.setExperience("More than 2 years");
        user.setId(1);
        System.out.println(user);
        System.out.println("Work experience: '" + user.getExperience() + '\'');
    }
}