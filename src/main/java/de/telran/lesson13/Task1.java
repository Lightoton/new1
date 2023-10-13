package de.telran.lesson13;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Введите кол-во этажей!");
        int height = scanner.nextInt();
        printfloor(height);
    }
    public static void printfloor(int a){
        while (a>0){
            System.out.println("###");
            a--;
        }
    }
}
//Напишите программу, которая будет печатать коробку из ###, принимая от пользователя значения высоты.
//
//Например:
//Вход = 3
//Выход =
//###
//###
//###