package org.example.javaee.class01.jdbc;

import org.example.javaee.class01.model.assignHWModel;
import org.example.javaee.class01.model.studentListModel;
import org.example.javaee.class01.model.submitHWModel;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentHomeworkJdbc {
    /*
    public static void main(String[] args) {
        List<StudentHomework> list = selectAll();

        for (StudentHomework sh : list){
            System.out.println(sh.getHomeworkContent());
        }
    }*/

    public static List<studentListModel> QueryStudentList(){
        String url = "jdbc:mysql://localhost:3306/student";
        String allUrl = url + "?user=root&password=123456";
        String driverName = "com.mysql.jc.jdbc.Driver";
        String sqlString = "SELECT * FROM list";

        try {
            // 加载驱动
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        List<studentListModel> list2 = new ArrayList<>();
        try(Connection connection =  DriverManager.getConnection(allUrl)) {
            try(Statement statement = connection.createStatement()){
                try(ResultSet resultSet = statement.executeQuery(sqlString)){
                    // 获取执行结果
                    while (resultSet.next()){
                        studentListModel s = new studentListModel();
                        s.setId(resultSet.getInt("id"));
                        s.setName(resultSet.getString("name"));
                        list2.add(s);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list2;
    }

    //教师发布作业
    public static  List<assignHWModel> QueryAssignmentHW(){

        String url = "jdbc:mysql://localhost:3306/student";
        String allUrl = url + "?user=root&password=123456";
        String driverName = "com.mysql.jc.jdbc.Driver";
        String sqlString = "SELECT * FROM homework";

        try {
            // 加载驱动
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        List<assignHWModel> list1 = new ArrayList<>();
        try(Connection connection =  DriverManager.getConnection(allUrl)) {
            try(Statement statement = connection.createStatement()){
                try(ResultSet resultSet = statement.executeQuery(sqlString)){
                    // 获取执行结果
                    while (resultSet.next()){
                        assignHWModel s = new assignHWModel();
                        s.setId(resultSet.getInt("id"));
                        s.setContent(resultSet.getString("content"));
                        list1.add(s);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list1;
    }

    //学生提交作业
    public static void submitHW(submitHWModel sh){
        /**
         *
         */

    }
    //学生作业展示
    public static List<submitHWModel> selectAll(){

        String url = "jdbc:mysql://localhost:3306/student";
        String allUrl = url + "?user=root&password=123456";
        String driverName = "com.mysql.jc.jdbc.Driver";
        String sqlString = "SELECT * FROM student";

        try {
            // 加载驱动
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        List<submitHWModel> list = new ArrayList<>();
        try(Connection connection =  DriverManager.getConnection(allUrl)) {
            try(Statement statement = connection.createStatement()){
                try(ResultSet resultSet = statement.executeQuery(sqlString)){
                    // 获取执行结果
                    while (resultSet.next()){
                        submitHWModel sh = new submitHWModel();
                        sh.setId(resultSet.getInt("id"));
                        sh.setStudentId(resultSet.getInt("studentId"));
                        sh.setHomeworkId(resultSet.getInt("homeworkId"));
                        sh.setHomeworkTitle(resultSet.getString("title"));
                        sh.setHomeworkContent(resultSet.getString("content"));
                        sh.setCreateTime(resultSet.getTimestamp("time"));
                        list.add(sh);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

}