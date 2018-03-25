<%--
  Created by IntelliJ IDEA.
  User: pengwei
  Date: 2018/3/25
  Time: 9:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1> 自定义登录</h1>
    <form method="post">
        <p>
            账号：
            <input type="text" id="loginName" value="zhangsan">
        </p>
        <p>
            密码：
            <input type="text" id="password" name="password" value="zhangsan">
        </p>
        <p>
            验证码：
            <input type="text" id="code" name="code" value="1111s">
        </p>
        <button type="submit">登录</button>
    </form>
</body>
</html>
