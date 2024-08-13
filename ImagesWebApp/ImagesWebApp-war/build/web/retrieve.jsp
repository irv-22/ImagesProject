<%-- 
    Document   : retrieve
    Created on : 27 Apr 2024, 11:45:40 PM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Get an image from DB</h1>
         <form action="GetServlet" method="POST">
            <table>
                <tr>
                    <td>Image ID:</td>
                    <td><input type="text" name="imgId"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Display"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
