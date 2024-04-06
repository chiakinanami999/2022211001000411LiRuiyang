<%--
  Created by IntelliJ IDEA.
  User: nanami
  Date: 2024/4/6
  Time: 11:09
  To change this template use File | Settings | File Templates.
--%>
<%@include file="header.jsp"%>
<h1><%= "Login" %>
</h1>
<form method="post" action="/login">

    <label for="username">Username: </label>
    <input type="text" id="username" name="username" placeholder="Username" required><br/>

    <label for="password">Password: </label>
    <input type="password" id="password" name="password" placeholder="Password" required><br/>

    <input type="submit" value="Login">

</form>
<%@include file="footer.jsp"%>
