import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ClassWork.main();

        // Level1:
        // Считывается 2 числа, произвести все арифметические операции с ними
        // (поделить, умножить, сложить, вычесть)
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число 1: ");
        int inputValue1 = scanner.nextInt();
        System.out.print("Введите число 2: ");
        int inputValue2 = scanner.nextInt();
        int sum = inputValue1 + inputValue2;
        int diff = inputValue1 - inputValue2;
        int mult = inputValue1 * inputValue2;
        double div = (double) inputValue1 / inputValue2;
        System.out.printf("%,d + %,d = %,d\n", inputValue1, inputValue2, sum);
        System.out.printf("%,d - %,d = %,d\n", inputValue1, inputValue2, diff);
        System.out.printf("%,d * %,d = %,d\n", inputValue1, inputValue2, mult);
        System.out.printf("%,d / %,d = %,.2f\n", inputValue1, inputValue2, div);

        // Level2:
        // С консоли вводится трехзначное число.
        // Найдите в нем первую, вторую и третью цифры.
        // Используйте при этом / и (или) %
        System.out.println();
        System.out.print("Введите число: ");
        int inputValue  = scanner.nextInt();
        int number = inputValue;
        int digit3 = number % 10;
        number /= 10;
        int digit2 = number % 10;
        number /= 10;
        int digit1 = number % 10;
        System.out.printf("Первая цифра: %d\nВторая цифра: %d\nТретья цифра: %d\n", digit1, digit2, digit3);

    }

}