<%-- 
    Document   : index.jsp
    Created on : Aug 20, 2018, 8:20:04 PM
    Author     : Tuan anh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login Authentication</h1>
        <form action="NewServlet" method="post">
            Username: <input type="text" name="username"/>
            Password: <input type="password" name="password"/>
            <input type="submit" value="Login"/>
            <input type="reset" value="Reset"/>
        </form>
    </body>
</html>
