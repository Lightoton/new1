package de.telran.lesson13;

import java.util.Scanner;

public class TaskHard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите кол-во этажей в доме: ");
        int h = scanner.nextInt();
        System.out.print("На сколько этажей поднимается лифт: ");
        int n = scanner.nextInt();
        System.out.print("На сколько этажей лифт опускается: ");
        int m = scanner.nextInt();
        int result = numberOfLifts(h,n,m);
        System.out.print("Столько кол-во подъёмов нужно: "+result);



    }
    static public int numberOfLifts(int floor, int stepUp, int stepDown){
        int result =stepUp-stepDown;
        int counter=1;
        while (floor>=result){
          result= result +stepUp-stepDown;
          counter++;
        }

        return counter;
    }
}
//ифт, находящийся на первом этаже здания высотой H, должен подняться на последний этаж.
//Лифт сломан.
//Каждый раз он поднимается на N этажей и спускается на M этажей. Если на последнем подъеме лифт превысил количество этажей, то считается что лифт поднялся на самый верх.
//Найдите количество подъемов, которые понадобятся лифту.
//Ввод:
//H = 200, N = 50, M = 1
//Ответ: 5
//Объяснение:
//Первый подъем: 50 - 1 = 49
//Второй подъем: 49 + 50 - 1 = 98
//Третий подъем: 98 + 50 - 1 = 147
//Четвертый подъем: 147 + 50 - 1 = 196
//Пятый подъем: выйти за пределы H.
//
//Реализовать метод numberOfLifts(int floor, int stepUp, int stepDown)
