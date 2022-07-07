package day05;

public class fordemo {
    public static void main(String[] args) {
        for (int num=1;num<=9;num++){
            if(num==4){
                break;
            }
            System.out.println(num+"*9="+num*9);
        }
        for (int num=1;num<=9;num++){
            if(num%3==0){
                continue;
            }
            System.out.println(num+"*9="+num*9);
        }
        for (int num=1;num<=9;num++){
            if(num%3!=0){
                System.out.println(num+"*9="+num*9);
            }
            
        }


    }

}
