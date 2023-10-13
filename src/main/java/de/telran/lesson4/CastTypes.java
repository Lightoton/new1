package de.telran.lesson4;

public class CastTypes {
    public static void main(String[] args) {
        byte myByte = 15;
        int myInt = myByte;

        System.out.println(myByte);
        System.out.println(myInt);

        short myShort = (short)myInt;
        System.out.println(myShort);

        int myIntBig = 1_000_000;
        myShort = (short) myIntBig;
        System.out.println(myShort);

    }
}
