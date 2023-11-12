package com.teachmeskills.Lesson4.Add_Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task_7 {

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
        System.out.println("Array="+Arrays.toString(array));

        for (int i = 0; i <n-1; i++) {
            for(int j=0; j<n-1-i;j++){
                if(array[j]>array[j+1]){
                    int a=array[j];
                    array[j]=array[j+1];
                    array[j+1]=a;

                }
            }
        }
        System.out.println("Sort array= "+Arrays.toString(array));

    }

}
