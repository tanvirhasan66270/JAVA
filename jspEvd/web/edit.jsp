<%@page import="entity.Student" %>

<%
   
Student s = (Student) request.getAttribute("student");

%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    </form> <h1>Student Edit</h1> 
    <form action="StudentServlet" method="POST">
        <input type="hidden" name="action" value="update"/>
        <input type="hidden" name="id" value="<%= s.getId() %>"/>

        <label for="">Name</label>
        <input type="name" name="name" value="<%= s.getName() %>"> <br> <br>

        <label for="">Email</label>
        <input type="email" name="email" value="<%= s.getEmail() %>"><br> <br>

        <label  for="">Student Fee</label>
        <input type="fee" name="fee" value="<%= s.getFee() %>"><br> <br>

        <button type="submit" value="Update" >Submit</button>
    </form>
    </body>
</html>
