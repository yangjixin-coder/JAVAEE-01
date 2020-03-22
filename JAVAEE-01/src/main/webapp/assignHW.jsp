<%@ page import="org.example.javaee.class01.jdbc.StudentHomeworkJdbc" %>
<%@ page import="org.example.javaee.class01.model.assignHWModel" %>
<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<table align="center" width="960" border="1"
			   bgcolor="black" cellpadding="1" cellspacing="1">
			<tr align="center" bgcolor="#7fffd4" height="50">
				<td>作业编号</td>
				<td>作业内容</td>
			</tr>
			<%
				List<assignHWModel> list = StudentHomeworkJdbc.QueryAssignmentHW();
				if(null == list || list.size() <= 0){
					out.print("None data.");
				}else {
					for (assignHWModel sh : list){
			%>
			<tr align="center" bgcolor="white" height="30">
				<td><%=sh.getId()%></td>
				<td><%=sh.getContent()%></td>
			</tr>
			<%
					}
				}
			%>
		</table>
	</div>

	<br>
	<p><input class="log" name="login"  type="button"  value="发布新作业" onclick="showAtRight('assign.jsp')";></p>
	<br>
</body>
</html>