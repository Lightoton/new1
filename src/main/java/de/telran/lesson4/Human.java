package de.telran.lesson4;

public class Human {
    String name;
    int age;
    int weight;
    boolean gesund;

    void run(){
        int speed = 10;
        System.out.println(name+ " с весом " + weight +" возраст "+age+"идёт со скоростью " +speed);

    }
    void sing(){
        System.out.println(name+ " с весом " + weight +" возраст "+age+"ПОЁТ!");
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", gesund=" + gesund +
                '}';
    }
}

