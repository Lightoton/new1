package de.telran.lesson4;

public class Lesson4 {
    public static void main(String[] args) {
        Human hm1 = new Human();
        System.out.println(hm1);

        hm1.weight =3;
        hm1.age = 1;
        hm1.name ="Vi";

        System.out.println(hm1);

        Human hmCopy = hm1;
        System.out.println(hmCopy);

        hm1.age = 20;
        hm1.weight = 70;
        hmCopy.gesund=true;
        System.out.println(hm1);

        System.out.println(hmCopy);

    }
}
