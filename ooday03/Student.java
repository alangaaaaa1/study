package ooday03;
//学生类

public class Student {
    String name;
    int    age;
    String address;
    void sayHi(){
        System.out.println("大家好我叫"+name+"今年"+age+"岁了，家住在"+address);
    }
    public Student(){}
    public Student(String name, int    age, String address){
        this.name = name;
        this.age=age;
        this.address=address;

    }
}
