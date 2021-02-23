package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a >= b) {
            System.out.println("Некорректный ввод");
        } else {
            for (int c =b ; c > a; c--) {
                if (c % 5 == 0 && c % 10 != 0) {
                    System.out.println(c);
                }

            }
        }
    }
}
