package ooday01;

public class Aoo {
    void show(){
        System.out.println(111);
    }
    void show(String name){}
    void show(int age){}
    void show(String name,int age){}
    void show(int age,String name){}

    //int show(){return 1;}//编译错误，重载与返回值类型无关
    //void show(String address){}//错误编译，重载与参数名称无关
}
