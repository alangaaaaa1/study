package ooday03;

public class RefArrayDemo {
    public static void main(String[] args) {
        //对于引用类型数组而言，必须给每个元素都赋值
        //若元素不赋值，则默认为null，容易发生空指针异常
        Student[] stus=new Student[3];
        stus[0]=new Student("zhangsan",25,"lf");
        stus[1]=new Student("lisi",26,"jms");
        stus[2]=new Student("wangwu",27,"sd");
        System.out.println(stus[0].name);
        stus[1].age=28;
        stus[2].sayHi();
        for (int i=0;i<stus.length;i++){
            System.out.println(stus[i].name);
            stus[i].sayHi();
        }
    }
}
