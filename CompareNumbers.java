import java.util.Scanner;

// Программа 1
public class CompareNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод двух целых чисел a и b
        System.out.print("Введите первое число (a): ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число (b): ");
        int b = scanner.nextInt();

        // Сравнение чисел
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        // Операции с числами
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        double quotient = b != 0 ? (double) a / b : Double.NaN; // Проверка на деление на ноль

        // Вывод результатов
        System.out.println("Сложение: " + a + " + " + b + " = " + sum);
        System.out.println("Вычитание: " + a + " - " + b + " = " + difference);
        System.out.println("Умножение: " + a + " * " + b + " = " + product);
        if (b != 0) {
            System.out.println("Деление: " + a + " / " + b + " = " + quotient);
        } else {
            System.out.println("Деление: деление на ноль невозможно");
        }
    }
}

