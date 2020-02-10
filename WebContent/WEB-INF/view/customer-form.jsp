<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>

<html>

<head>
     <title>Save Customer</title>
    
</head>
<body>

<div id="wrapper">
    <div id="header">
    <h2>CRM - Customer Relationship manager</h2>
    </div>
</div>

<div id="container">
 <h3>Save Customer</h3>
 
 <form:form action="saveCustomer" modelAttribute="customer" method="POST">
     <form:hidden path="id" />
       <table>
            <tbody>
            <tr>
            <td><label>First Name:</label></td>
            <td><form:input path="firstName" /></td>
            </tr>
            <tr>
            <td><label>Last Name:</label></td>
            <td><form:input path="lastName" /></td>
            </tr>
            <tr>
            <td><label>Email:</label></td>
            <td><form:input path="email" /></td>
            </tr>
            <tr>
            <td><label></label></td>
            <td><input type="submit" value="Save" class="Save" /></td>
            </tr>
            </tbody>
       
       </table>
 
 </form:form>
</div>
</body>
</html>