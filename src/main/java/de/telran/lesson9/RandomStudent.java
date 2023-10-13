package de.telran.lesson9;

import java.util.Random;
import java.util.Scanner;

public class RandomStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Какое количество студентов присутствует: ");
        int countStudent = scanner.nextInt();
        System.out.println("Отвечать будет: "+randomSt(countStudent));
    }
    static int randomSt (int a){
        return generateIntRandomInterval(a,2);
    }
    static int generateIntRandomInterval(int max , int min){
        Random random = new Random();
        return random.nextInt(max-min)+min;
    }
}
