<%-- 
    Document   : login
    Created on : 2018-3-13, 16:01:36
    Author     : jason 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>登陆</title>
    </head>
    <body>
        欢迎登陆系统<br/>
        <form action="Login.action" method="post">
              <table>
                <tr><td>用户名：</td><td><input type="text" name="user.userName"/></td></tr>
                <tr><td>密码：</td><td><input type="text" name="user.password"/></td></tr>
                <tr><td><input type="submit" value="登陆"/></td></tr>
            </table>
        </form>
    </body>
</html>
