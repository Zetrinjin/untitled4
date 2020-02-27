package com.company;

import java.util.Scanner;

public class work_3 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("введите год:");
        int year = sc.nextInt();//вводим год

        if (year%4 == 0)//проверка на високосный год
        {
           if (year%100 == 0 && year%400 != 0)
               System.out.println(year + " год не високосный");
           else
               System.out.println(year + " год високосный");
        }
        else
            System.out.println(year + " год не високосный");

    }
}
