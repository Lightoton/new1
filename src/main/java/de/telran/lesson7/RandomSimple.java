package de.telran.lesson7;

import java.util.Random;
import java.util.Scanner;

public class RandomSimple {
    public static void main(String[] args) {
        int myInt;
        myInt = 15;
        System.out.println("myInt = "+myInt);
        Scanner scanner=new Scanner(System.in);
        myInt = scanner.nextInt();
        System.out.println("Scanner myInt = "+myInt);

        Random random = new Random();
        myInt = random.nextInt();
        System.out.println("Random myInt = "+myInt);
        myInt = random.nextInt(100);
        System.out.println("Random myInt = "+myInt);
        myInt= random.nextInt(90)+10;
        System.out.println("Random myInt = "+myInt);
        System.out.println("Введите максимальное значение диапазона : ");
        int myInt1 = scanner.nextInt();
        System.out.println("Введите минимальное значение диапазона: ");
        int myInt2 = scanner.nextInt();
        myInt = generateIntRandomInterval(myInt1,myInt2);
        System.out.println("Random myInt = "+myInt);


        myInt = (int) (Math.random() * 100-10) +10;
        System.out.println("Math myInt = "+ myInt);
    }
    static int generateIntRandomInterval(int max , int min){
        Random random = new Random();
        int result = random.nextInt(max-min)+min;
        return result;
    }

}
