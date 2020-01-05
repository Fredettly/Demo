<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加员工</title>
</head>
<body>
 添加

<form action="/employee/saveOrUpdate.do" method="get">

    <p><input type="hidden" name="id" value="${employee.id}"/></p>
    <p>名称:<input type="text" name="name" value="${employee.name}"/></p>
    <p>邮箱:<input type="text" name="email" value="${employee.email}"/></p>
    <p>年龄:<input type="text" name="age" value="${employee.age}"/></p>
    <p>管理员:<input type="text" name="admin" value="${employee.admin}"/></p>
    <%--<p>部门:<input type="text" name="name"/></p>--%>
    <p><input type="submit" value="提交"/></p>

</form>
</body>
</html>
