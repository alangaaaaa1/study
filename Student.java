package ooday01;

public class Student {
    String name;
    int    age;
    String address;
    String sex;
    void study(){
        System.out.println(name+"在学习");
    }
    void sayHi(){
        System.out.println("大家好我叫"+name+"今年"+age+"岁了，家住在"+address);
    }

}
