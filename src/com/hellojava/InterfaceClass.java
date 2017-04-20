package src.com.hellojava;

/**
 * Created by bob on 2017/4/20.
 * 接口练习
 */
//先定义接口
interface InterfaceA{
    public void IntAFun1();
}
public class InterfaceClass implements InterfaceA {
    public void IntAFun1(){
        System.out.print("555");
    }
    public static void main(String[] args){
        InterfaceClass ifc = new InterfaceClass();
        ifc.IntAFun1();
    }
}
