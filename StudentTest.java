package ooday01;

public class StudentTest {
    public static void main(String[] args) {
        Student zs= new Student();
        zs.name="张三";
        zs.age=28;
        zs.address="河北廊坊";
        zs.study();
        zs.sayHi();

        Student ls=new Student();
        ls.name="李四";
        ls.age=25;
        ls.address="黑龙江佳木斯";
        ls.study();
        ls.sayHi();

        Student ww=new Student();
        ww.sayHi();
        ww.study();

    }
}
