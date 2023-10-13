package de.telran.lesson13;

public class SimpleWhile {
    public static void main(String[] args) {
        int count = 10;
        while (count>0){
            System.out.println("Привет программист!"+count);
            count--;
        }
        count=1;
        while (true){
            System.out.println("Вечный привет программисту! "+count);
            count++;
            if (count>10){
                break;
            }
        }
    }
}
