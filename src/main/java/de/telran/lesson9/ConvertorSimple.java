package de.telran.lesson9;

import java.util.Scanner;

public class ConvertorSimple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("В какой системе счисления ваше число: ");
        int numberSystem = scanner.nextInt();
        System.out.print("Введите число: ");
        String numberStr = scanner.next();
        System.out.print("В какую систему счисления преобразовать: ");
        int numberSystemOut = scanner.nextInt();

        long number = Long.parseLong(numberStr,numberSystem);

        String numberOutStr = Long.toString(number,numberSystemOut);
        System.out.print("Ваше число "+numberStr+" в системе счисления "+numberSystem+"= "+numberOutStr);
    }
}
