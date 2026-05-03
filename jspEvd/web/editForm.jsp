<%@page import="entity.Emp" %>
<%@page import="dao.EmpDao" %>



<%
    int id = Integer.parseInt(request.getParameter("id"));    
    Emp e = EmpDao.getById(id);

%>




<form action="edit.jsp" method="post">
    
    <input type="hidden" name ="id" value="<%=e.getId()%>" />
    <label for="">Name</label>
    <input type="text" name="name" value="<%=e.getName()%>" > <br>
    <label for="">Salary</label>
    <input type="text" name="salary" value="<%=e.getSalary()%>" > <br>
    <label for="">Date of Birth</label>
    <input type="date" name="date" value="<%=e.getDate()%>" > <br>
    <label for="">Email</label>
    <input type="email" name="email" value="<%=e.getEmail()%>"> <br>
    
     <label for="">Subject</label>
    <select name="subject" >
         <option selected>Select Anyone</option>
        <option value="JEE" <%= "JEE".equals(e.getSubject()) ? "selected" : "" %>>JEE</option>
        
        <option value="DDD" <%= "DDD".equals(e.getSubject()) ? "selected" : "" %>>DDD</option>
       <option value="NT" <%= "NT".equals(e.getSubject()) ? "selected" : "" %>>NT</option>
        
    </select>
    
    <input type="submit" value="Save">



</form>
       