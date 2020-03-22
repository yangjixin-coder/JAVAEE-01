<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
</head>
<body>
<div id="login" align="center">
	<p align="center"><strong>作业发布 </strong></p>
	<form action="submit.jsp" method="post" onsubmit = "return validate();">
		<table frame=void width=800px border="1" align="center">
			<tr>
				<td class="td1"><strong>学号:</strong></td>
				<td class="td2"><input id="id" name="name" type="text"  class="inputText" placeholder="请输入学号" onfocus="YHMonfocu()" onblur="YHMonblus()" required/><span id="YHMerror"></span></td>
			</tr>
			<tr>
				<td  class="td1"><strong>作业编号:</strong></td>
				<td  class="td2"><input id="homeworkId" name="workid" type="text"  class="inputText" placeholder="请输入作业编号" onfocus="GHMonfocu()" onblur="GHMonblus()" required/><span id="GHMerror"></span></td>
			</tr>
			tr>
			<td class="td1"><strong>作业标题:</strong></td>
			<td class="td2"><input id="title" name="name" type="text"  class="inputText" placeholder="请输入作业标题" onfocus="YHMonfocu()" onblur="YHMonblus()" required/><span id="YHMerror"></span></td>
			</tr>
			<tr>
				<td  class="td1"><strong>作业内容:</strong></td>
				<td  class="td2"><input id="content" name="workid" type="text"  class="inputText" placeholder="请输入作业内容" onfocus="GHMonfocu()" onblur="GHMonblus()" required/><span id="GHMerror"></span></td>
			</tr>
			<tr>
				<td  class="td1">  </td>
				<td  class="td2">
					<input type="submit" name="submit" class="submitBtn" value="确定" >
				</td>
			</tr>
		</table>
	</form>
</div>
</body>
</html>