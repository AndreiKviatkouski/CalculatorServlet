<%--
  Created by IntelliJ IDEA.
  User: andre
  Date: 31.05.2020
  Time: 20:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>History</title>
</head>
<body>
<form action="/history" method="post">
    <select name="operation">
        <option value="str">summation</option>
        <option value="str4">subtraction</option>
        <option value="str3">multiplication</option>
        <option value="str2">division</option>
        <option value="all_operation.clear()">clear</option>
        <option value="str5">showAll</option>
    </select>
    <button>Show</button>
</form>
<form action="/main">
    <button>Return in Calculator</button>
</form>
History:${requestScope.str}
${requestScope.massage}
</body>
</html>
