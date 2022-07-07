package day06;

import java.util.Arrays;

public class Methodtest {
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
        System.out.println();
        say();
        String name= "张三";
        int age=30;
        sayHi(name);
        sayHello(name,age);
        getNum();
        int a=10;
        int b=20;
        plus(a,b);
        int[] arr2=testArray(b);
        System.out.println(Arrays.toString(arr2));
        int[] arr3=generate(a,b);
        System.out.println(Arrays.toString(arr3));



    }
    public static void say(){
        System.out.println("holle world");
    }
    public static void sayHi(String name){
        System.out.println("我的名字是"+name);

    }
    public static void sayHello(String name,int age){
        System.out.println("我的名字是"+name+"年龄是"+age);
    }
    public static int getNum(){
        int Num1=7;
        int Num2=8;
        return Num1+Num2;
    }
    public static int plus(int a,int b){
        return a+b;
    }
    public static int[] testArray(int num){
        int[] arr= new int[num];
        for (int i=0;i<num;i++){
            arr[i]=(int)(Math.random()*100);
        }
        return arr;

    }
    public static int[] generate(int num,int num2){
        int[] arr= new int[num];
        for (int i=0;i<num;i++){
            arr[i]=(int)(Math.random()*(num2+1));
        }
        return arr;
    }

}
