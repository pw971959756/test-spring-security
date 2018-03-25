<%--
  Created by IntelliJ IDEA.
  User: pengwei
  Date: 2018/3/25
  Time: 11:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>世界您好！~ </h1>
    <sec:authorize access="hasAnyAuthority('HOME_F1')">
        <h1>厉害了我的国</h1>
    </sec:authorize>
    <sec:authorize access="hasAnyAuthority('HOME_F2')">
        <h1>英雄联盟</h1>
    </sec:authorize>

    <sec:authorize access="hasAnyAuthority('HOME_F3')">
        <h1>绝地求生</h1>
    </sec:authorize>
    <sec:authorize access="hasAnyAuthority('HOME_F4')">
        <h1>绝地求生</h1>
    </sec:authorize>
    <sec:authorize access="hasAnyAuthority('HOME_F5')">
        <h1>穿越火线</h1>
    </sec:authorize>
    <sec:authorize access="hasAnyAuthority('HOME_F6')">
        <h1>大兄弟你穿越了也</h1>
    </sec:authorize>




</body>
</html>
