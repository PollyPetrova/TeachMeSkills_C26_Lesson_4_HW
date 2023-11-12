package com.teachmeskills.Lesson4.Main_Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task_0 {

    public static void main(String[] args) {

        int[] array={1,5,8,-7,-3,0,-9,10,18};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("Enter the number: ");
        Scanner scanner=new Scanner(System.in);
        int num= scanner.nextInt();
        int num_ind=Arrays.binarySearch(array, num);
        if(num_ind>=0){
            System.out.println("Array include "+num);
        }
        else {
            System.out.println("Array doesn't include "+num);
        }

    }

}
