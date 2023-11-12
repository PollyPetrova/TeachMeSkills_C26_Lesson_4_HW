package com.teachmeskills.Lesson4.Main_Tasks;


import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class Task_2 {

    public static void main(String[] args) {

        //Ввод размерности массива:
        System.out.println("Enter the size of array: ");
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();

        //Заполнение массива рандомными числами:
        int[] array=new int[n];
        for(int i=0; i<n; i++){
            array[i]=(int)(100*Math.random());
        }
        System.out.println(Arrays.toString(array));

        //Максимальное значение массива:
        int max=array[0];
        for(int i=0; i<n; i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        System.out.println("Max number of array: "+max);

        //Минимальное значение массива:
        int min=array[0];
        for(int i=0; i<n; i++){
            if(array[i]<min){
                min=array[i];
            }
        }
        System.out.println("Min number of array: "+min);

        //Среднее значение массива
        double average=0;
        int sum=0;
        for(int i=0; i<n; i++){
            sum+=array[i];
        }
        average=(double)sum/n;
        System.out.println("Average number= "+average);

    }

}