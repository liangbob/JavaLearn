package src.com.JavaApiLearn.UtilApi;
import java.util.*;
import java.text.*;
/**
 * Created by bob on 2017/4/22.
 * DateApi
 */
public class DateApi {
    public void date(){
        Date date = new Date();
        System.out.println(date);
        Long date_str = date.getTime();
        System.out.println(date_str);
    }
    public void calendar(){
        DateFormat fdate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str =fdate.format(new Date());
        System.out.println(str);

    }
    public static void main(String[] main){
        DateApi a = new DateApi();
        a.calendar();
    }
}
