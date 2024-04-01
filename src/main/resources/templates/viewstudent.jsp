<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>View Students</title>
</head>
<body>
    <h1>View Students</h1>
    
    <table border="1">
        <tr>
            <th>Name</th>
            <th>Username</th>
            <th>Email</th>
            <th>Phone</th>
            <th>Action</th>
        </tr>
        <c:forEach var="student" items="${students}">
            <tr>
                <td>${student.name}</td>
                <td>${student.username}</td>
                <td>${student.email}</td>
                <td>${student.phone}</td>
                <td>
                    <a href="approveStudent?username=${student.username}">Approve</a>
                    <a href="updateStudentForm.jsp?username=${student.username}">Update</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
