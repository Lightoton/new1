package de.telran.lesson10;

public class UnaryOperation {
    public static void main(String[] args) {

        int myInt = 10;
        System.out.println(myInt);
        myInt++; //myInt = myInt+1;
        System.out.println(myInt);
        myInt--;
        System.out.println(myInt);

        myInt+=2;
        System.out.println(myInt);
        myInt-=3;
        System.out.println(myInt);
        myInt*=5;
        System.out.println(myInt);
        myInt/=2;
        System.out.println(myInt);
        myInt%=2;
        System.out.println(myInt);
        int myInt2 = 15;
        printNumber(myInt2);
        printNumber(++myInt2);
        System.out.println(myInt2);
    }
    static void printNumber (int number){
        System.out.println("printNumber() = " +number);
    }
}
