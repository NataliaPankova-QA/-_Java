// Программа 3
public class EvenNumbers {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Итерация по массиву и вывод четных чисел
        for (int number : numbers) {
            if (number % 2 == 0) { // Проверка остатка от деления на 2
                System.out.println(number);
            }
        }
    }
}
