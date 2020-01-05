<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>员工页面</title>
</head>
<body>
    员工页面...<br>
    使用EL表达式取出model对象中的数据<br>
    ${list}

    <hr><br>

    <a href="/employee/input.do">添加</a>
    <table width="500" height="300" border="1" cellspacing="0">
        <thead>
            <tr>
                <th>序号</th>
                <th>名称</th>
                <th>邮箱</th>
                <th>年龄</th>
                <th>管理员</th>
                <th>部门</th>
                <th>操作</th>
            </tr>
        </thead>
        <tbody>

            <c:forEach items="${list}" var="emp" varStatus="v">
                <tr>
                    <td>${v.count}</td>
                    <td>${emp.name}</td>
                    <td>${emp.email}</td>
                    <td>${emp.age}</td>
                    <td>${emp.admin}</td>
                    <td>${emp.deptId}</td>
                    <td>
                        <a href="/employee/input.do?id=${emp.id}">修改</a>|
                        <a href="/employee/delete.do?id=${emp.id}">删除</a>|
                    </td>
                </tr>
            </c:forEach>

        </tbody>


    </table>

</body>
</html>
