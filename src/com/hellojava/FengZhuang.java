package com.hellojava;

/**
 * Created by bob on 17/4/20.
 */
public class FengZhuang extends father {
    public static void main(String[] args){
        FengZhuang fz = new FengZhuang();
        fz.setI(10);
        int i = fz.getI();
        System.out.println(i);
    }

}
class father{
    private int i;
    public void setI(int j){
        i = j;
    }
    public int getI(){
        return i;
    }
}
