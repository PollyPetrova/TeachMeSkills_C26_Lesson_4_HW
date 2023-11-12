package com.teachmeskills.Lesson4.Add_Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task_4 {

    public static void main(String[] args) {

        //Определение размерности первого массива:
        System.out.println("Enter the size of array:");
        int n;
        do {
            Scanner scanner=new Scanner(System.in);
            n=scanner.nextInt();
            if(n<=5 || n>10){
                System.out.println("Wrong number. It should be in range (5; 10]. Enter another number!");
                continue;
            }
            else {
                break;
            }
        } while (true);


        //Создание и заполнение первого массива:
        int[] array1=new int[n];
        for(int i=0; i<n; i++){
            array1[i]=(int)(100*Math.random());
        }
        System.out.println("First array= "+ Arrays.toString(array1));

        //Определение размерности второго массива:
        int k=0;
        for (int i = 0; i < n; i++) {
            if(array1[i] % 2==0){
                k++;
            }
        }

        //Заполнение второго массива:
        int[] array2=new int[k];
        for (int j = 0; j < k; j++) {
            for (int i = 0; i <n ; i++) {
                if(array1[i] % 2==0){
                    array2[j]=array1[i];
                    j++;
                }
            }
        }
        System.out.println("New array= "+Arrays.toString(array2));

    }

}
