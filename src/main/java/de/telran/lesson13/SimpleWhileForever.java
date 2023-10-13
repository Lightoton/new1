package de.telran.lesson13;

public class SimpleWhileForever {
    public static void main(String[] args) {
        int i = 1;
        while (true){
            System.out.println("Hallo");
            i++;
            if (i>10){
                break;
            }
        }
    }
}
