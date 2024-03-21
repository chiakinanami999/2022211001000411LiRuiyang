<%--
  Created by IntelliJ IDEA.
  User: nanami
  Date: 2024/3/13
  Time: 16:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register JSP page</title>
    <style>
        h1 div {
            text-align: center;
        }

    </style>
</head>
<body>
    <h1>New User Registration</h1>
    <div>
        <form method="post" action="register">
            username<input type="text" name="username"/><br/>
            ID<input type="text" name="password"/><br/>
            email<input type="text" name="email"/><br/>
            Gender: <input type="radio" name="gender" value="Male">Male <input type="radio" name="gender" value="Female">Female<br/>
            <input type="text" name="birthDate"><br/>
            <input type="submit" value="Register"/>
        </form>

    </div>

</body>
</html>
