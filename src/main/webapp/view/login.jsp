<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/3/1
  Time: 18:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="tagPage.jsp"%>
<html>
<head>
    <title>login</title>
</head>
<body>
<h1>登录</h1>
<p>${errors}</p>
<form action="${webRoot}/loginController/login.do" method="post">
    学号:<input type="text" id="stuId" name="stuId" value="${stuId}" /><br>
    密码:<input type="password" id="stuPwd" name="stuPwd" value="${stuPwd}" /><br>
    <input type="submit" value="登录"/>
    <input type="reset" value="重新填写"/>
</form>
</body>
</html>
