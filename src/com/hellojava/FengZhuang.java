package com.hellojava;

/**
 * Created by bob on 17/4/20.
 */
public class FengZhuang extends son {
    public static void main(String[] args){
        FengZhuang fz = new FengZhuang();
        fz.setI(10);
        int i = fz.getI();
        System.out.println(i);
    }

}
class son{
    private int i;
    public void setI(int j){
        i = j;
    }
    public int getI(){
        return i;
    }
}
