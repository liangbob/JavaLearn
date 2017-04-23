package src.com.JavaApiLearn.LangApi;

/**
 * Created by bob on 2017/4/22.
 * java里面的IntegerApi的学习
*/
class LearnInteger{
    /*
    * compareTo
    * if a<b  return -1
    * if a=b  return 0
    * if a>b  return 1
    * */
    public void LearnCompareTo(){
        int a = 100;
        int b = 10;
        Integer aa = new Integer(a);
        System.out.println(aa.compareTo(b));
    }
    /*
    * equals:
    * if a=b return true
    * if a!=b return false
    * */
    //比较的主变量必须是使用Integer类定义后的变量
    public void LearnEquals(){
        Integer a = new Integer(10);
        Integer b = new Integer(1);
        System.out.println(a.equals(b));
    }
    /*
    * change:
    * floatValue doubleValue parseInt
    * */
    public void change(){
        //1,IntToFloat
        int a = 10;
        Integer aa = new Integer(a);
        float b = aa.floatValue();
        System.out.println(b);
        double c = aa.doubleValue();
        System.out.println(c);
        //2,StringToInt
        String str = "1144010";
        //后面的参数代表转化的进制
        int strToInt = Integer.parseInt(str,10);
        System.out.println(strToInt);
        //3，IntToString
        String s = aa.toString();
        System.out.println(s);
        String ss = Integer.toString(strToInt);
        System.out.println(ss);

    }
}
public class IntegerApi {
    public static void main(String[] args){
        LearnInteger LI = new LearnInteger();
        LI.LearnCompareTo();
        LI.LearnEquals();
        LI.change();
    }
}
