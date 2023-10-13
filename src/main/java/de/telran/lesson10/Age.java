package de.telran.lesson10;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите свой возраст: ");
        int age = scanner.nextInt();
        if (age > 17) {
            System.out.println("Вам разрешено смотреть этот фильм!");

        }else
            System.out.println("Вам нет 18 лет, этот фильм предназначен для просмотра лицам от 18 лет!");

    }
}
