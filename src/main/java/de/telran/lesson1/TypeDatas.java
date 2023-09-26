package de.telran.lesson1;

public class TypeDatas {
    public static void main(String[] args) {
        int myInt;
        myInt = 25;

        int myIntOther = 10;
        System.out.println(myInt + myIntOther);

        // Целочисленные типы
        byte myByte = 18; // -128,,,127
        short myShort = 200; // -32768,,,32767
        //int от -2м млрд до 2 млрд.
        long myLong = 100000; // самое большое число.

        // Дробные числа
        float myFlout = 3.14F;
        double myDouble = 1000.85;

        char myChar = 'd'; // для хранения символа
        String myStr = "Мама купила зерна"; // для хранения строки

        boolean myBoolean = true; // false - логический тип

        System.out.println("myByte = "+ myByte );

    }
}
