package com.designpattern;

/**
 * Created by bob on 17/4/21.
 * 抽象工厂模式练习
 */

/**
* 先定义不同的接口
* */
interface Food{
    public void getingFood();
}
interface Rice{
    public void getingRice();
}

/**
* 通过一个接口，实现不同的上级接口
* */
interface Eat{
    public Food getFood();
    public Rice getRice();
}
/**
* 通过一些类来实现具体接口的内容
 * EatFood实现接口Food
 * EatRice实现接口Rice
* */
class EatFood implements Food{
    public void getingFood() {
        System.out.println("now is eating food!");
    }
}
class EatRice implements Rice{
    public void getingRice(){
        System.out.println("now is eating rice!");
    }
}
/**
* 实现接口的内容
* */
class EatNow implements Eat{
    public Food getFood(){
        return new EatFood();
    }
    public Rice getRice(){
        return new EatRice();
    }
}

/**
* 调用对应的接口
* */
public class AbstractFactoryPattern {
    public static void main(String[] args){
        EatNow en = new EatNow();
        en.getFood().getingFood();
        en.getRice().getingRice();
    }
}
