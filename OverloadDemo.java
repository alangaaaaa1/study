package ooday01;

public class OverloadDemo {
    public static void main(String[] args) {
        Aoo o=new Aoo();
        o.show();
        o.show("zhangsan");
        o.show(25);
        o.show("zhangsan",25);
        o.show(25,"zhangsan");

    }

}

