package com.hxin;

import java.sql.*;

/**
 * @author Hxin
 * @since 2018/6/4 下午8:10
 */
public class main {

    public static void main(String[] args) throws Exception {
        Connection connection;
        //驱动程序名
        String driver = "com.mysql.jdbc.Driver";
        //URL指向要访问的数据库名mydata
        String url = "jdbc:mysql://localhost:3306/Hxin";
        //MySQL配置时的用户名
        String user = "root";
        //MySQL配置时的密码
        String password = "lzcgy040921";

        Class.forName(driver);
        connection = DriverManager.getConnection(url, user, password);
        System.out.println("Succeeded connecting to the Database!");
        //2.创建statement类对象，用来执行SQL语句！！
        Statement statement = connection.createStatement();
        //要执行的SQL语句
        String sql = "select * from User";
        //3.ResultSet类，用来存放获取的结果集！！
        ResultSet rs = statement.executeQuery(sql);

        String username = null;
        String Dp = null;
        while (rs.next()) {
            //获取stuname这列数据
            username = rs.getString("username");
            //获取stuid这列数据
            password = rs.getString("password");
            //输出结果
            System.out.println(username + "\t" + Dp);
        }
        rs.close();
        connection.close();
    }
}
