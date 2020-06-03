<%--
  Created by IntelliJ IDEA.
  User: 75403
  Date: 2020/6/1
  Time: 22:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>保存账户信息表单</h1>
<form action="${pageContext.request.contextPath}/save.action" method="post">
    用户名称<input type="text" name="name"><br/>
    账户金额<input type="text" name="money"><br/>
    <input type="submit" value="保存"><br/>
</form>
</body>
</html>
