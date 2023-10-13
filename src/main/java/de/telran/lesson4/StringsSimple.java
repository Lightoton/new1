package de.telran.lesson4;

import java.util.Locale;

public class StringsSimple {
    public static void main(String[] args) {
        String str1 ="мама мыла раму";

        String strCopy = str1; // клонирования

        System.out.println(str1);
        System.out.println(strCopy);

        str1 = str1 + " мылом";

        System.out.println(str1);
        System.out.println(strCopy);

        System.out.println(str1.length()); // длина

        char symbol = str1.charAt(0);
        System.out.println(symbol); //символ или буква
        symbol = str1.charAt(str1.length()-1);
        System.out.println(symbol);

        String subStr = str1.substring(15);//начиная с,,,
        System.out.println(subStr);

        subStr = str1.substring(15, 19);//начиная с,,, и заканчивая на,,,
        System.out.println(subStr);

        System.out.println(str1.toUpperCase());//большие буквы
        System.out.println(str1.toLowerCase());//маленькие буквы


        String strTemp = strCopy.replace('л', 'К');//замена символов
        System.out.println(strTemp.replace('м','н'));

    }
}
