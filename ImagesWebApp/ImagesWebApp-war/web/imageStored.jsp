<%-- 
    Document   : imageStored
    Created on : 28 Apr 2024, 12:24:16 AM
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
        <h1>Outcome</h1>
        <p>Image successfully stored to database</p>
        <%String path=(String)request.getAttribute("path");%>
        <p>image path:<%=path%></p>
        <p><a href="menu.html">Menu</a></p>
    </body>
</html>
