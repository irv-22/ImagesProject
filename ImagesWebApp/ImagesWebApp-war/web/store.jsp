<%-- 
    Document   : store
    Created on : 27 Apr 2024, 11:45:18 PM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Store page</title>
    </head>
    <body>
        <h1>Store an image</h1>
        <form action="StoreServlet" method="POST" enctype="="multipart">
            <table>
                
                <tr>
                    <td>Image ID:</td>
                    <td><input type="text" name="imgId"></td>
                </tr>
                <tr>
                    <td>Image Name:</td>
                    <td><input type="text" name="imgName"></td>
                </tr>
                <tr>
                    <td>Image path:</td>
                    <td><input type="file" name="imagepath"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Store"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
