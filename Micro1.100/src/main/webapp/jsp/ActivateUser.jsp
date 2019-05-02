<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<style>
    .bs-example{
    	margin: 20px;
    }
</style>



</head>
<body>






<form:form id="simpleDomainForm" modelAttribute="simpleDomain">
<input name="UserName" value="${user.getFirstName()}" readonly="readonly" class="required">
<input name="modelName" value='<c:out value="$${user.getLastName()}"></c:out>' readonly="readonly" class="required">
<input type="button" value="Toggle" onclick="toggleForm();">
</form:form>

<div class="bs-example">
    <table class="table">
        <thead class="thead-dark">
            <tr>
                <th>Row</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Mobile No</th>
                <th>DOB</th>
                <th>Email</th>
                 <th>Role</th>
                  <th>Confirm</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>1 </td>
                <td>${user.getFirstName()}</td>
                <td>${user.getLastName()}</td>
                <td>${user.getMobileNo()}</td>
                 <td>${user.getdOB()}</td>
                  <td>${user.getEmailId()}</td>
                  <td> <select name="Role">
                       <option value="USER">USER</option>
                       <option value="ADMIN">ADMIN</option>
                
                        </select>
                  </td>
                  
                  
                  
                  <% request.setAttribute("Role","${user.getFirstName()}");%>
                  
                  <td><a href="/confirm"><input type="button" value="Submit" onclick="getOption()"></a></td>
            </tr>
                
        </tbody>
    </table>
</div>

</body>
</html>