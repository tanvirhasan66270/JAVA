<%@page import="entity.Student" %>

<%
   
Student s = (Student) request.getAttribute("student");

%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Student Edit/Update</title>
    <style>
        /* Ekdom simple styling */
        body { font-family: sans-serif; margin: 50px; background-color: #f9f9f9; }
        .form-box { 
            background: white; 
            padding: 20px; 
            border: 1px solid #ccc; 
            max-width: 350px; 
            border-radius: 5px; 
        }
        input { 
            width: 100%; 
            padding: 8px; 
            margin: 10px 0; 
            display: block; 
            box-sizing: border-box; 
        }
        label { font-weight: bold; }
        button { 
            background-color: #4CAF50; 
            color: white; 
            padding: 10px 15px; 
            border: none; 
            cursor: pointer; 
            width: 100%;
        }
        button:hover { background-color: #ffc107; }
    </style>
</head>
<body>

<div class="form-box">
    <h3>Student Edit</h3>
    
    <form action="StudentServlet" method="POST">
        <!-- Hidden fields -->
        <input type="hidden" name="action" value="update"/>
        <input type="hidden" name="id" value="<%= s.getId() %>"/>

        <label>Name</label>
        <input type="text" name="name" value="<%= s.getName() %>" required>

        <label>Subject</label>
        <input type="text" name="subject" value="<%= s.getSubject() %>" required>

        <label>Marks</label>
        <input type="number" name="marks" value="<%= s.getMarks() %>" required>

        <label>Department</label>
        <input type="text" name="departments" value="<%= s.getDepartments() %>" required>

        <button  type="submit">Update</button>
    </form>
</div>

</body>
</html>
