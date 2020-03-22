<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
<%

    /* login */
    Class.forName("org.postgresql.Driver");
    Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","123456");
    /* load */
    String sql = "insert into homework values (?,?)";
    PreparedStatement stmt=connect.prepareStatement(sql);
    request.setCharacterEncoding("UTF-8");
    String id = request.getParameter("id");/* 使用 request.getParameter() 方法来获取表单参数的值 */
    String content = request.getParameter("content");
    stmt.setString(1,id);
    stmt.setString(2,content);
    int n=stmt.executeUpdate();
    if(n==1){
        out.println("<script language = 'javaScript'> alert('发布成功');</script>");
        response.setHeader("refresh","1;url = index.jsp");
    }else{
        out.println("<script language = 'javaScript'> alert('发布失败');</script>");
        response.setHeader("refresh","1;url = index.jsp");
    }
    stmt.close();
    connect.close();
%>
</body>
</html>