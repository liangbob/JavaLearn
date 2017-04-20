package com.hellojava;

/**
 * Created by bob on 17/4/20.
 * 多态练习
 * Java中多态的实现方式：继承父类进行方法重写，抽象类和抽象方法，接口实现。
 */
public class MoreType extends FatherA {
    public static void main(String[] args){
        //定义一个对象，使用子类，引用父类
        //这种形式叫向上转型，可以重载父类的方法作为子类来调用，但是不能直接调用子类的方法。

        FatherA fa = new MoreType();
        fa.t();
//        fa.d(); //因为引用的是父类，所以无法调用子类里面的d方法

        MoreType mt = new MoreType();
        mt.d();

    }

    public void d(){
        System.out.println("类：MoreType的d");
    }
    public void t(){
        System.out.println("类：MoreType的t");
    }


}

class FatherA{
    public void t(){
        System.out.println("类：FatherA的t");
    }
}
