package de.telran.lesson9;

import java.util.Scanner;

public class GradConvertor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите температура в градусах Цельсия: ");
        int tempGrad = scanner.nextInt();
        System.out.println("Темперратура в Кельвинах: "+runKelvinConverter(tempGrad));
        System.out.println("Темперратура в Фаренгейте: "+runFahrenheitConverter(tempGrad));
    }
    static double runKelvinConverter(double baseValue){
        return  baseValue + 273.15;

    }
    static double runFahrenheitConverter(double baseValue){
        return 1.8*baseValue+32;

    }
}
