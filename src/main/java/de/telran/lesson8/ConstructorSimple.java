package de.telran.lesson8;

public class ConstructorSimple {
    public static void main(String[] args) {
        Auto auto1 = new Auto();
        auto1.model = "BMW";
        auto1.yearOfCreation = 2023;
        auto1.carMileage = 100;
        auto1.color = "Red";
        auto1.run();
        auto1.turn();

        Auto auto2 = new Auto();
        auto2.model = "VW";
        auto2.yearOfCreation = 2023;
        auto2.carMileage = 5;
        auto2.color = "Blue";
        auto2.run();


        Auto auto3 = new Auto("Audi");
        auto3.run();

        Auto auto4 = new Auto("Porsche",2020);
        auto4.run();

        Auto auto5 = new Auto("Honda",2002,100,"Green");
        auto5.run();


    }
}

