package src.com.JavaApiLearn.UtilApi;
import java.util.*;
/**
 * Created by bob on 2017/4/22.
 * Ramdon类实验
 */
public class RamdonApi {
    public static void main(String [] args){
        Random rand =new Random(25);
        int i;
        i=rand.nextInt(100);
        System.out.println(i);
    }
}
