import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class Test2 {
    @Test
    public void test() {
        System.out.println("testtestetstest");
    }

    //дэзэ: ввести 2 числа, разделить одно на другое. обработать исключение, которое возникает при попытке
    // разделить на ноль, чтобы выводился не только стектрейс, но и комментарий от вас .
    @Test
    public void main() {
        System.out.println("enter the number");
        //Scanner scanner = new Scanner(System.in);
        // try {
        Scanner scanner = new Scanner(System.in);
        String d = scanner.nextLine();
        System.out.println(d);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double c = a / b;
        System.out.println(c);
        // }
        //  catch (ArithmeticException e) {
        //     e.printStackTrace();
        //       System.out.println("cannot be divided by 0");
        // }


    }

}
