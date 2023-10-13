package de.telran.lesson7;

import java.util.Scanner;

public class MetodSimple {
    public static void main(String[] args) {
        int a = 15, b = 10;
        int sum = a+b;
        System.out.println("sum= "+sum);

        a=24;
        b=19;
        sum=a+b;
        System.out.println("sum="+sum);
        Scanner scanner = new Scanner(System.in);
        int arg1 = scanner.nextInt();
        int arg2 = scanner.nextInt();
        int arg3 = scanner.nextInt();
        printSum(arg1,arg2);


        int dif= getDif(arg1,arg2);
        System.out.println(dif);
        System.out.println("Mult= "+mult(arg1,arg2));
        System.out.println("Mult= "+mult(arg1,arg2,arg2));

    }
    static void printSum(int arg1, int arg2){
        int sum = arg1+arg2;
        System.out.println("Sum= "+sum);
    }
    static int getDif (int arg1, int arg2){
        int dif1 = arg1-arg2;
        return dif1;
    }
    static int mult (int arg1,int arg2){
        return arg1*arg2;
    }
    static int mult (int arg1, int arg2, int arg3){
        return arg1*arg2*arg3;
    }
}
