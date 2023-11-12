package com.teachmeskills.Lesson4.Add_Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task_6 {

    public static void main(String[] args) {

        //Заполнение массива рандомными числами:
        String[] array1=new String[5];
        array1[0]="Анна";
        array1[1]="Екатерина";
        array1[2]="Ксюша";
        array1[3]="Маша";
        array1[4]="Виктория";
        System.out.println("Array= "+ Arrays.toString(array1));

        Arrays.sort(array1);
        System.out.println("Array sort= "+ Arrays.toString(array1));

    }

}
