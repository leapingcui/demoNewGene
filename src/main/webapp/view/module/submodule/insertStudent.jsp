<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/3/1
  Time: 21:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../../tagPage.jsp"%>
<html>
<head>
    <title>insertStudent</title>
</head>
<body>
<h1>新增学生</h1>
<a href="#">返回</a>
<form action="${webRoot}/studentController/insertStudent.do" method="post">
    学号:<input type="text" id="stuId" name="stuId" /><br>
    姓名:<input type="text" id="stuName" name="stuName" /><br>
    性别:<input type="radio"  name="stuSex" value="男" checked="checked" />男
         <input type="radio"  name="stuSex" value="女" />女<br>
    出生日期:<input type="text" id="stuBirth" name="stuBirth" /><br>
    班级号:<select id="class" name="stuClaId">
                <option value="1">1</option>
                <option value="2">2</option>
            </select><br>
    <input type="submit" value="新增"/>
    <input type="reset" value="重新填写"/>

</form>
</body>
</html>
