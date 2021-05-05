import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ArithmeticException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        try {
            if (b == 0) {
                throw new ArithmeticException("На 0 делить нельзя");
            }
            int c = a / b;
            System.out.println("Результат деления: ");
            System.out.println(c);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

    }

}
