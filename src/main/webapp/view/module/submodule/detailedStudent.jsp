<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../../tagPage.jsp"%>
<html>
<head>
    <title>detailedStudent</title>
</head>
<body>
<h1>学生详情</h1>
    <a href="#">返回</a>
    <table border="1">
        <tr>
            <td>学号</td>
            <td>${studentMulti.student.stuId}</td>
        </tr>
        <tr>
            <td>姓名</td>
            <td>${studentMulti.student.stuName}</td>
        </tr>
        <tr>
            <td>性别</td>
            <td>${studentMulti.student.stuSex}</td>
        </tr>
        <tr>
            <td>出生年月</td>
            <td><fmt:formatDate value="${studentMulti.student.stuBirth}" pattern="yyyy-MM-dd"></fmt:formatDate> </td>
        </tr>
        <tr>
            <td>班级号</td>
            <td>${studentMulti.classes.claId}</td>
        </tr>
        <tr>
            <td>班级名</td>
            <td>${studentMulti.classes.claName}</td>
        </tr>
        <tr>
            <td>班级人数</td>
            <td>${studentMulti.classes.claTotalNum}</td>
        </tr>
    </table>

</body>
</html>
