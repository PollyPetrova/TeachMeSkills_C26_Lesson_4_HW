package com.teachmeskills.Lesson4.Add_Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task_5 {

    public static void main(String[] args) {

        //Ввод размерности массива:
        System.out.println("Enter the size of array: ");
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();

        //Заполнение массива рандомными числами:
        int[] array1=new int[n];
        for(int i=0; i<n; i++){
            array1[i]=(int)(100*Math.random());
        }
        System.out.println("Array= "+Arrays.toString(array1));

        //Замена элементов массива с нечётным индексом на 0:
        for (int i = 0; i <n ; i++) {
            if(i%2 !=0){
                array1[i]=0;
            }
        }
        System.out.println("New array= "+Arrays.toString(array1));
    }

}
