import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1 ");
        int[] payments = {50_000, 70_000, 90_000, 120_000, 300_000};

        int sum = 0;
        for (int i = 0; i < payments.length; i++) {
            sum = sum + payments[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей. ");

        System.out.println("Задача 2 ");
        int max = payments[0];
        int min = payments[0];
        for (int i = 0; i < payments.length; i++) {
            if (max < payments[i]) {
                max = payments[i];
            }
            if (min > payments[i]) {
                min = payments[i];
            }
        }
        System.out.println("Максимальная сумма трат за неделю составила " + max + " рублей.");
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей.");

        System.out.println("Задача 3");
        int total = 0;
        for (int pay : payments) {
            total = total + pay;
        }
        double average = total / (double) payments.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей.");

        System.out.println("Задача 4 ");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        char temp;
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(reverseFullName));
    }
}