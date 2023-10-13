package de.telran.lesson9;

public class ExchangeNumbers {
    public static void main(String[] args) {
        int a =2, b=5;
        int temp =b;
        System.out.println("a= "+a+" b= "+b);
        b = a;
        a = temp;
        System.out.println("a= "+a+" b= "+b);
    }
}
