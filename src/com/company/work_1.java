package com.company;

import java.util.Scanner;

public class work_1 {

    public static void main(String[] args) {

        System.out.println("Введите 2 слова:");
        Scanner in = new Scanner(System.in);

        String word1 = in.next();//первое слово
        String word2 = in.next();//второе слово


        if(word1.equals(word2))//сравнение на идентичность
            System.out.printf("Отлично! Слова одинаковы");
        else if(word1.equalsIgnoreCase(word2))//сравнение по регистру
            System.out.println("Хорошо. Почти одинаковы");
        else if (word1.length() == word2.length())//сравнение по длинне
            System.out.printf("Ну, хотя бы они одной длины");
    }

}

