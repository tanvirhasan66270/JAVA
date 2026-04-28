<%@page import="entity.Student" %>
<%@page import="dao.StudentDao" %>
<%@page import="java.util.*" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
   
List<Student> list = StudentDao.findAll();
request.setAttribute("list",list);
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body >
<thead>
<a href="add.jsp"  >Add Student</a>
<h1>All Student</h1>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Email</th>
        <th>Student Fee</th>
        <th>Action</th>
    </tr>

</thead>

<tbody>

    <c:forEach items="${list}" var="s"  > 
        <tr>
            <td>${s.id}</td>
            <td>${s.name}</td>
            <td>${s.email}</td>
            <td>${s.fee}</td>
            <td>

                <a href="StudentServlet?action=edit&id=${s.id}">Edit</a>
                <a href="StudentServlet?action=delete&id=${s.id}">Delete</a>

            </td>
        </tr>
    </c:forEach>
</tbody>
</table>
</body>

</html>



