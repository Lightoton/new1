package de.telran.lesson13;

import java.util.Scanner;

public class SimpleDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int getChoice = get(scanner);


        System.out.println("Вы выбрали пункт меню: "+getChoice);
        if (getChoice>=1 && getChoice<=4){
            System.out.println("Вы входите в игру!");
        }

    }
    public static int get(Scanner scanner){
        int choice;
        do {
            System.out.println("За кого вы будете играть: ");
            System.out.println("1. Орк ");
            System.out.println("2. Человек ");
            System.out.println("3. Эльф ");
            System.out.println("4. Гном");
            System.out.println("0. Выход!");
            System.out.print("Ваш выбор: ");
            choice = scanner.nextInt();
            if (choice==0){
                System.out.println("Выход из игры!");
                break;
            }else
            if (choice<0 || choice>4){
                System.out.println("Некорректный ввод!");
            }
        } while (choice<0 || choice>4);
        return choice;

    }
}
