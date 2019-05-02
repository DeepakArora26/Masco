<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<form action="/registerUser" >



 <table>
 
            <tr>
            <td>First Name:</td>
            <td><input type='text' name='firstName' ></td>
         </tr>
         
               
         
          <tr>
            <td>Last Name:</td>
            <td><input type='text' name='lastName' ></td>
         </tr>
 
 
            <tr>
            <td>UserName:</td>
            <td><input type='text' name='userName' ></td>
         </tr>
 
 
          <tr>
            <td>Mobile No:</td>
            <td><input type="number" name='mobileNo' ></td>
         </tr>
         
       <tr>
            <td>Password:</td>
            <td><input type="password" name='password' ></td>
         </tr>
         
         
       <tr>
            <td>Confirm Password:</td>
            <td><input type="password" name='ConfirmPassword' ></td>
         </tr>
       
          
         
           <tr>
            <td>DOB:</td>
            <td><input type="date" name='dOB'></td>
         </tr>
         
           <tr>
            <td>Email</td>
            <td><input type="email" name='emailId' ></td>
         </tr>
         
          <tr>
      
            <td><input type="submit" value='Submit' ></td>
         </tr>
</table>

</form>


</body>
</html>