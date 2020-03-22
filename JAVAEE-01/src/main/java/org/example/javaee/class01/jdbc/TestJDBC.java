package org.example.javaee.class01.jdbc;

import java.io.PrintStream;
import java.sql.*;

public class TestJDBC {
    public static String getMysql(){
            String url = "com.java.code.class12.jdbc:mysql://";
            String driverName = "";
            String sqlString = "select* from s_user limit 1";
            try{
                //加载驱动
                Class.forName(driverName);
                //创建连接
                //Connection connection = DriverManager.getConnection(url,"root","123456");
                //通过连接获取statement
                //Statement statement = connection.createStatement();
                //statement做一些增删改查
                //ResultSet resultSet = statement.executeQuery(sqlString);
                //获取执行结果
                //while (resultSet.next()){
                 //   System.out.println(resultSet.getLong(1));
                //}
            }catch (ClassNotFoundException e){
                e.printStackTrace();

            }

            try(Connection connection = DriverManager.getConnection(url,"root","123456")){
                try(Statement statement = connection.createStatement()){
                   try(ResultSet resultSet = statement.executeQuery(sqlString);){
                       while (resultSet.next()){
                           System.out.println(resultSet.getLong(1));
                       }
                   }
                }
            }
             catch (SQLException e) {
                e.printStackTrace();
            }

        return null;
    }

    public static void main(String[] args){
            getMysql();
    }
}
