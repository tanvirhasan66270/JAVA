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
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>All Students List</title>
    
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body { background-color: #f4f7f6; }
        .table-container { margin-top: 50px; }
        .card { border: none; border-radius: 12px; }
        .btn-add { border-radius: 20px; padding: 8px 20px; }
        .table thead { background-color: #003d7a; color: white; }
    </style>
</head>
<body>

<div class="container table-container">
    <div class="card shadow-sm">
        <div class="card-body p-4">
            
            <div class="d-flex justify-content-between align-items-center mb-4">
                <h2 class="text-secondary fw-bold mb-0">All Student Records</h2>
                <a href="add.jsp" class="btn btn-primary btn-add shadow-sm">
                    + Add New Student
                </a>
            </div>

            <div class="table-responsive">
                <table class="table table-hover align-middle border">
                    <thead>
                        <tr class="text-center">
                            <th>Roll</th>
                            <th>Name</th>
                            <th>Subject</th>
                            <th>Marks</th>
                            <th>Department</th>
                            <th>Actions</th>
                        </tr>
                    </thead>
                    <tbody>
                        
                        <c:forEach items="${list}" var="s"> 
                            <tr class="text-center">
                                <td class="fw-bold text-muted">${s.id}</td>
                                <td class="text-start ps-4">${s.name}</td>
                                <td>${s.subject}</td>
                                <td>
                                    <span class="badge bg-info text-dark">${s.marks}</span>
                                </td>
                                <td>${s.departments}</td>
                                <td>
                                    <div class="d-flex justify-content-center gap-2">
                                        <a href="StudentServlet?action=edit&id=${s.id}" class="btn btn-sm btn-outline-warning">
                                            Edit
                                        </a>
                                        <a href="StudentServlet?action=delete&id=${s.id}" 
                                           class="btn btn-sm btn-outline-danger"
                                           onclick="return confirm('Are you sure you want to delete this Student?')">
                                            Delete
                                        </a>
                                    </div>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>

           
            <c:if test="${empty list}">
                <p class="text-center mt-3 text-muted">No students found in the database.</p>
            </c:if>

        </div>
    </div>
</div>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>


