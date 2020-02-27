package com.company;

import java.util.Scanner;

public class work_2b {

    public static void main(String[] args){

        Scanner sc =  new Scanner(System.in);

        System.out.println("Введите число:");
        int num = sc.nextInt();//вводим число в рублях

        switch (num)
        {
            case 1:
                System.out.println(num + " рубль");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println(num + " рубля");
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.println(num + " рублей");
                break;
            case 10: case 11: case 12:case 13:case 14:case 15:case 16:case 17:case 18:case 19:case 20:
                System.out.println(num + " рублей");
                break;
            default:
                System.out.println("нет столько рублей");

        }

    }
}
