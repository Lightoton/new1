package de.telran.lesson8;

public class Auto{
    String model;
    int yearOfCreation;
    int carMileage;
    String color;
    Auto(){
        model = null;
        yearOfCreation = 0;
        carMileage = 0;
        color = null;

    }
    Auto(String argModel){
        model = argModel;
        color ="White";
    }
    Auto(String argModel, int argYear){
        model = argModel;
        yearOfCreation = argYear;
    }

    Auto(String model, int yearOfCreation, int carMileage, String color) {
        this.model = model;
        this.yearOfCreation = yearOfCreation;
        this.carMileage = carMileage;
        this.color = color;

    }



    void run(){
        System.out.println(model+" Цвета "+color+" год выпуска "+yearOfCreation+ " с пробегом "+carMileage+" ЕДЕТ!");
    }

        void turn(){
        System.out.println(model+" Цвета "+color+" год выпуска "+yearOfCreation+ " с пробегом "+carMileage+" ПОВЕРНУЛ!");
    }

    }

