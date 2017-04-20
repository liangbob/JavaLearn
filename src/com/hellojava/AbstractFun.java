package com.hellojava;

/**
 * Created by bob on 17/4/20.
 * 抽象类，抽象方法练习
 *
 * 1，在某些情况下，某个父类只是知道其子类应该包含怎样的方法，但无法准确知道这些子类如何实现这些方法。
 *    也就是说抽象类是  <约束子类>  必须要实现哪些方法，而并不关注方法如何去实现。
 * 2，从多个具有相同特征的类中抽象出一个抽象类，以这个抽象类作为子类的模板，从而<避免了子类设计的随意性>。
 */
public class AbstractFun extends ABclass {
    //当调用ABclass的时候，必须要实现getI和setI方法
    private int i;
    public int getI(){
        return i;
    }
    public void setI(int ni){
        i = ni;
    }
    public static void main(String [] args){
        AbstractFun abf = new AbstractFun();
        abf.setI(100);
        System.out.print(abf.getI());
    }
}

//定义一个抽象类与抽象类中的抽象方法,以封装为例
abstract class ABclass{

    public abstract int getI();
    public abstract void setI(int ni);
}

