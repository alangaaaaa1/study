package day06;
import  java.util.Arrays;
public class ArrayDemo {
    public static void main(String[] args) {
      /*  int [] a = {2,5,8,4,7};
        int [] b = new int[6];
        System.arraycopy(a,1,b,0,4);
        for (int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
        a= Arrays.copyOf(a,a.length+2);
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }*/
        int[] arr= new int[10];
        for (int i=0;i<arr.length;i++){
            arr[i]=(int)(Math.random()*100);
        }
        Arrays.sort(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println("到着输出");
        for (int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]);
            System.out.print(" ");
        }


    }
}
