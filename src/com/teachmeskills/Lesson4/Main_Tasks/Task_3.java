package com.teachmeskills.Lesson4.Main_Tasks;

import java.util.Arrays;

public class Task_3 {

    public static void main(String[] args) {

        //Инициализация первого массива:
        int n=5;
        int[] array1=new int[n];
        for(int i=0; i<n; i++){
            array1[i]=(int)(100*Math.random());
        }
        System.out.println(Arrays.toString(array1));

        //Инициализация второго массива:
        int[] array2=new int[n];
        for(int j=0; j<n; j++){
            array2[j]=(int)(100*Math.random());
        }
        System.out.println(Arrays.toString(array2));

        //Вычисление среднего значения для первого массива:
        int sum1=0;
        double avg1=0;
        for(int i=0; i<5; i++){
            sum1+=array1[i];
        }
        avg1=(double)sum1/n;
        System.out.println("Average number of first array= "+avg1);

        //Вычисление среднего значения для второго массива:
        int sum2=0;
        double avg2=0;
        for(int j=0; j<5; j++){
            sum2+=array2[j];
        }
        avg2=(double)sum2/n;
        System.out.println("Average number of second array= "+avg2);

        //Сравнение средних значений двух массивов:
        if(avg1>avg2){
            System.out.println("Average value of first array more than value of second!");
        } else if (avg2>avg1) {
            System.out.println("Average value of second array more than value of first!");
        } else {
            System.out.println("Average values are equal!");
        }

    }

}
