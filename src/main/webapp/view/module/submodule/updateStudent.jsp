<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../../tagPage.jsp"%>
<html>
<head>
    <title>updateStudent</title>
</head>
<body>
<h1>编辑学生</h1>
<a href="#">返回</a>
<form action="${webRoot}/studentController/updateStudent.do" method="post">
    学号:<input type="text" id="stuId" name="stuId" value="${student.stuId}" /><br>
    姓名:<input type="text" id="stuName" name="stuName" value="${student.stuName}" /><br>
    性别:<input type="radio"  name="stuSex" value="男"
            <c:if test="${student.stuSex eq '男'}">
            checked='checked'
            </c:if>
        />男
    <input type="radio"  name="stuSex" value="女"
            <c:if test="${student.stuSex eq '女'}">
                checked='checked'
            </c:if>
        />女<br>
    出生年月:<input type="text" id="stuBirth" name="stuBirth"
                value="<fmt:formatDate value="${student.stuBirth}" pattern="yyyy-MM-dd" /> " /><br>
    班级号:<select id="class" name="stuClaId">
                <option value="1"
                        <c:if test="${student.stuClaId eq '1'}">
                            selected="selected"
                        </c:if>
                 >1</option>
                <option value="2"
                        <c:if test="${student.stuClaId eq '2'}">
                            selected="selected"
                        </c:if>
                 >2</option>
            </select><br>
    <input type="submit" value="编辑"/>
    <input type="reset" value="重置"/>

</form>
</body>
</html>
