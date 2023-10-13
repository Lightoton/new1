package de.telran.lesson10;

import java.util.Random;

public class LogicalOperation {
    public static void main(String[] args) {
        Random random = new Random();
        int myInt = random.nextInt(50);
        System.out.println("Температура воздуха: "+myInt);

        if (myInt<15) {
            System.out.println("На улице холодно!");
        }
        if (myInt>25 && myInt<40){
            System.out.println("На улице жарко!");
        }
        if (myInt>=40){
            System.out.println("Сиди дома дурак!!!");
        }
        if (myInt>=15 && myInt <=25){
            System.out.println("На улице тепло!");
        }

    }
}
