package day06;

import java.util.Arrays;

public class
MaxOfArray {
    public static void main(String[] args) {
        int[] arr5= new int[10];
        for (int i=0;i<arr5.length;i++) {
            arr5[i] = (int) (Math.random() * 100);
            System.out.print(arr5[i]);
            System.out.print(" ");
        }
        System.out.println();
        int max = arr5[0];
        for (int i=0;i<arr5.length;i++) {
           if (max<arr5[i]){
               max=arr5[i];
           }
        }
        System.out.println("最大值为"+max);
        arr5= Arrays.copyOf(arr5,arr5.length+1);
        arr5[arr5.length-1]=max;
        for (int i=0;i<arr5.length;i++) {

            System.out.print(arr5[i]);
            System.out.print(" ");
        }


    }
}
