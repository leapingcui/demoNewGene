<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="tagPage.jsp"%>
<html>
<head>
    <title>mainFrame</title>
</head>
<body>
<h1>学生信息</h1>
<a href="${webRoot}/studentController/insertStudentUI.do">新增</a>
<table border="1" >
    <tr>
        <th>学号</th>
        <th>姓名</th>
        <th>性别</th>
        <th>出生日期</th>
        <th>班级名</th>
        <th>班级人数</th>
        <th>详情</th>
        <th>编辑</th>
        <th>删除</th>
    </tr>
    <c:forEach items="${studentMultis}" var="studentMulti">
    <tr>
        <td>${studentMulti.student.stuId}</td>
        <td>${studentMulti.student.stuName}</td>
        <td>${studentMulti.student.stuSex}</td>
        <td><fmt:formatDate value="${studentMulti.student.stuBirth}" pattern="yyyy-MM-dd"></fmt:formatDate> </td>
        <td>${studentMulti.classes.claName}</td>
        <td>${studentMulti.classes.claTotalNum}</td>
        <td><a href="${webRoot}/studentController/detailedStudent.do?stuId=${studentMulti.student.stuId}">详情</a></td>
        <td><a href="${webRoot}/studentController/updateStudentUI.do?stuId=${studentMulti.student.stuId}">编辑</a></td>
        <td><a href="${webRoot}/studentController/deleteStudent.do?stuId=${studentMulti.student.stuId}">删除</a></td>
    </tr>
    </c:forEach>
</table>
</body>
</html>
