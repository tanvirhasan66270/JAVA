<%-- 
    Document   : add
    Created on : Apr 28, 2026, 4:36:57 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

    </form> <h1>Student From</h1> 
    <form action="StudentServlet" method="POST">
        <input type="hidden" name="action" value="add"/>

        <label for="">Name</label>
        <input type="name" name="name"> <br> <br>

        <label for="">Email</label>
        <input type="email" name="email"><br> <br>

        <label  for="">Student Fee</label>
        <input type="fee" name="fee"><br> <br>

        <button type="submit" value="save">Submit</button>
    </form>
</body>
</html>
