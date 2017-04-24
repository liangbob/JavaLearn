package com.JDBCLearn;

//引入sql类
import com.sun.org.apache.regexp.internal.RE;

import java.sql.*;

/**
 * Created by bob on 17/4/24.
 * JDBC基础连接
 */

//连接DB类
class ConnectDB{
    private String Host = "112.126.89.87";
    private String Username = "root";
    private String Password = "hr1ycfLqswslhK";
    private String Port = "3307";
    private String DB_SELECT = "java_learn";
    public Connection ConnectToMySQL(){
        //声明Connection对象
        Connection con;
        //驱动程序名
        String driver = "com.mysql.jdbc.Driver";
        //URL指向要访问的数据库名mydata
        String url = "jdbc:mysql://"+Host+":"+Port+"/"+DB_SELECT;
        //MySQL配置时的用户名
        String user = Username;
        //MySQL配置时的密码
        String password = Password;
        //遍历查询结果集
        try {
            //加载驱动程序
            Class.forName(driver);
            //1.getConnection()方法，连接MySQL数据库！！
            con = DriverManager.getConnection(url,user,password);
            if(!con.isClosed())
                System.out.println("Succeeded connecting to the Database!");
            return con;

        } catch(ClassNotFoundException e) {
            //数据库驱动类异常处理
            System.out.println("Sorry,can`t find the Driver!");
            e.printStackTrace();
        } catch(SQLException e) {
            //数据库连接失败异常处理
            e.printStackTrace();
        }catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }finally{
            System.out.println("数据库链接成功！！");
        }
        return null;
    }
    public ResultSet Query(Connection con,String SQL){
        try {
            Statement statement = con.createStatement();
            String sql = SQL;
            ResultSet rs = statement.executeQuery(sql);
            return rs;
        }catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }finally{
            System.out.println("执行了："+SQL);
        }
        return null;
    }
    public int InertQuery(Connection con,String SQL){
        try {
            Statement statement = con.createStatement();
            String sql = SQL;
            int rs = statement.executeUpdate(sql);
            return rs;
        }catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }finally{
            System.out.println("执行了："+SQL);
        }
        return 0;
    }


}
public class JDBCConnect {
    public static void main(String[] args) {
        ConnectDB CDB = new ConnectDB();
        Connection con = CDB.ConnectToMySQL();


        //select
//        String sql = "select * from user";
//        ResultSet rs = CDB.Query(con,sql);
//        try{
//            String job = null;
//            String ename = null;
//            int id = 0;
//            while(rs.next()){
//                //获取stuname这列数据
//                job = rs.getString("job");
//                //获取stuid这列数据
//                ename = rs.getString("username");
//                id = rs.getInt("id");
//                //输出结果
//                System.out.println(id+" "+ename + " " + job);
//            }
//        }catch (Exception e) {
//            // TODO: handle exception
//            e.printStackTrace();
//        }finally{
//            System.out.println("数据库数据成功获取！！");
//        }
        //insert
//        int i = 0;
//        for (i=0 ; i<=10 ; i++){
//            String InsertSql = "insert into user(username,job) values(\"bob"+i+"\",\"rd"+i+"\")";
//
//            int InsertRS = CDB.InertQuery(con,InsertSql);
//            System.out.println(InsertRS);
//        }
        //update
//        String UpdateSql = "update user set username=\"bob555\" where id=1";
//        int UpdateRS = CDB.InertQuery(con,UpdateSql);
//        System.out.println(UpdateRS);
        //delete
        String DeleteSql = "delete from user where id > 1";

        int DeleteRS = CDB.InertQuery(con,DeleteSql);
        System.out.println(DeleteRS);
    }
}
