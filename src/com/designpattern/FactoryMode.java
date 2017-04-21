package com.designpattern;

/**
 * Created by bob on 2017/4/20.
 * 工厂模式练习
 */

//定义一个接口，对于所有的工厂模式的类都会用到
interface Human{
        public void sleep();
        public void eat();
        public void learn();
}
//定义不同的类，指代各种不同场合的对象
//定义male类
class Male implements Human{
    public void sleep(){
        System.out.println("male is sleep!");
    }
    public void eat(){
        System.out.println("male is eat!");
    }
    public void learn(){
        System.out.println("male is learn!");
    }
}
//定义female类
class Female implements Human{
    public void sleep(){
        System.out.println("female is sleep!");
    }
    public void eat(){
        System.out.println("female is eat!");
    }
    public void learn(){
        System.out.println("female is learn!");
    }
}
/*****
 * 普通工厂模式
 * 通过不同的参数来控制类的实例化
 * 方法工厂模式
 * 通过不同的方法来进行实例化的控制
 * 静态方法工厂模式
 * 更加便捷的实例化过程
 * */
//普通工厂模式
class NormalFactoryMode{
    public Human getHuman(String param){
        if(param.equals("Male")){
            return new Male();
        }if(param.equals("Female")){
            return new Female();
        }else{
            System.out.println("请输入正确的类型！");
            return null;
        }
    }
}
//方法工厂模式
class MethodFactoryMode{
    public Human setMale(){
        return new Male();
    }
    public Human setFemale(){
        return new Female();
    }
}
//静态方法工厂模式
class StaticMethodFactoryMode{
    public static Human setMale(){
        return new Male();
    }
    public static Human setFemale(){
        return new Female();
    }
}
//test
public class FactoryMode {
    public static void main(String[] args){
        //test普通工厂模式
        NormalFactoryMode nfm = new NormalFactoryMode();
        nfm.getHuman("Male").eat();
        nfm.getHuman("Female").eat();

        //test方法工厂模式
        MethodFactoryMode mfm = new MethodFactoryMode();
        mfm.setMale().sleep();
        mfm.setFemale().sleep();

        //test静态方法工厂模式
        StaticMethodFactoryMode.setMale().learn();
        StaticMethodFactoryMode.setFemale().learn();
    }
}
