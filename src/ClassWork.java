import java.util.Scanner;
import java.util.Scanner;

public class ClassWork {
    public static void main() {

        // Простейший калькулятор
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число 1: ");
        int inputValue1 = scanner.nextInt();
        System.out.print("Введите число 2: ");
        int inputValue2 = scanner.nextInt();
        System.out.println(inputValue1 + inputValue2);



        //Бил - акула с Уолл-стрит. Он быстро зарабатывает, но и быстро теряет деньги.
        //За вчера Бил умножил свой капитал в 5 раз, за сегодняшнее утро он потерял 100_000_000 долларов
        //а вечером снова удвоил свой капитал.
        //Бил хочет, чтобы вы написали такую программу: он введет число (одно) - количество денег, которое было позавчера
        //Вы должны узнать, сколько у него сейчас
        System.out.println();
        System.out.print("Введите количество денег, которое было позавчера: ");

        long fortuneDayBeforeYesterday  = scanner.nextLong();

        //За вчера Бил умножил свой капитал в 5 раз
        long fortune = fortuneDayBeforeYesterday * 5;

        //за сегодняшнее утро он потерял 100_000_000 долларов
        fortune -= 100_000_000;

        //вечером снова удвоил свой капитал
        fortune *= 2;
        System.out.printf("Капитал Билла на сегодня: %,d\n", fortune);



        // вводится число, проверить, заканчивается ли на 4 оно
        System.out.println();
        System.out.print("Введите число: ");
        int inputValue  = scanner.nextInt();

        if (inputValue % 10 == 4) {
            System.out.println("Заканчивается на 4");
        } else {
            System.out.println("Не заканчивается на 4");
        }
    }
}
