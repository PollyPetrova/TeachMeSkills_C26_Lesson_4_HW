package com.teachmeskills.Lesson4.Main_Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {

        //Создаём новый массив:
        int[] array={1,5,8,-7,-3,0,-9,10,18};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        //Вводим число, которое надо будет удалить из массива:
        System.out.println("Enter the number: ");
        Scanner scanner=new Scanner(System.in);
        int num= scanner.nextInt();

        //Находим длину нового массива:
        int k=0; int sum=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]==num){
                k++;
            }
        }
        sum= array.length-k;

        //Инициализируем новый массив:
        int[] array1=new int[sum];

        //Удаляем все вхождения заданного числа:
        int num_ind=Arrays.binarySearch(array, num);
        if(num_ind>=0){
            for(int j=0; j <sum; j++){
                for (int i = 0; i < array.length; i++) {
                    if(array[i]!=num){
                        array1[j]=array[i];
                        j++;
                    }
                }
            }
            System.out.println(Arrays.toString(array1));
        }
        else {
            System.out.println("Array doesn't include "+num);

        }

    }

}
