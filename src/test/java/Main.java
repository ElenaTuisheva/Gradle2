import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        try {
            int c = a / b;
            System.out.println("Результат деления: ");
            System.out.println(c);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("Нельзя делить на ноль");
        }
    }
}
