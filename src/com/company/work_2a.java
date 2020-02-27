package com.company;

import java.util.Scanner;

public class work_2a {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число:");
        int num = sc.nextInt();

        if(num>0 && num<21)
        {
          if (num>=10 && num<=20)
              System.out.println(num +" рублей");
          else if(num == 1 )
              System.out.println(num + " рубль");
          else if(num >= 2  && num <= 4 )
              System.out.println(num + " рубля");
          else if(num >= 5  && num <= 9 )
              System.out.println(num + " рублей");
        }
        else System.out.println("нет столько рублей");
    }
}
