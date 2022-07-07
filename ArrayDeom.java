package day05;

import java.sql.Array;
import java.util.Arrays;

public class ArrayDeom {
    public static void main(String[] args) {
        int[] arr = new int [10];
        int arr1[]={2,5,8};
        int[] arr2 = {2,5,8};
        int[] arr3 = new int[]{2,5,8};
        int[] arr4;
        arr4 = new int[]{2,5,8};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));
        System.out.println(arr.length);


        for (int i =0;i<3;i++){
            System.out.print(arr2[i]+"\t");

        }
        System.out.println();
        int[] arr5= new int[10];
        for (int i=0;i<arr5.length;i++){
            arr[i]=(int)(Math.random()*100);
            System.out.println(arr[i]);

        }

    }
}
