package day4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длинну массива");
        int d = scanner.nextInt();

        int[] numbers = new int[d];
        for (d = 0; d < numbers.length; d++) {
            int i = random.nextInt(10);
            numbers[d] = i;

        }

        System.out.println(" Введено число " + d + " Сгенерирован следующий массив:");
        System.out.print("[");
        for (d = 0; d < numbers.length - 1; d++) {
            System.out.print(numbers[d] + ", ");
        }
        System.out.print(numbers[d]);
        System.out.println("] \n");
        System.out.println("Информация о массиве: ");
        System.out.println("Длина массива: " + (d + 1));
        System.out.print("Количество чисел больше 8: ");
        int res = 0;
        for (d = 0; d < numbers.length; d++) {
            if (numbers[d] > 8) {
                res++;
            }
        }
        System.out.println(res);
        System.out.print("Количество чисел равных 1: ");
        int res1 = 0;
        for (d = 0; d < numbers.length; d++) {
            if (numbers[d] == 1) {
                res1++;
            }
            }
        System.out.println(res1);
        System.out.print("Количество четных чисел: ");
        int res2 = 0;
        for (d = 0; d < numbers.length; d++) {
            if (numbers[d] % 2==0) {
                res2++;
            }
        }
        System.out.println(res2);
        System.out.print("Количество нечетных чисел: ");
        int res3 = 0;
        for (d = 0; d < numbers.length; d++) {
            if (numbers[d] % 2!=0) {
                res3++;
            }
        }
        System.out.println(res3);
        int sum = 0;
        for (int x : numbers) {
            sum = sum + x;
        }
        System.out.println("Сумма всех элементов массива: " + sum);

    }

}

