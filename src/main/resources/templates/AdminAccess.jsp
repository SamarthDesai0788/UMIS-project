<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Registered Members</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
          crossorigin="anonymous">
    <style>
        .container {
            margin-top: 50px;
        }
    </style>
</head>
<body>
<div class="container">
    <h1>Registered Members</h1>
    <%-- Check if the user is logged in as admin --%>
    <c:if test="${empty sessionScope.admin}">
        <div class="alert alert-danger" role="alert">
            You must log in as admin to view this page.
        </div>
        <a href="/login" class="btn btn-primary">Login</a>
    </c:if>
    <%-- If the user is logged in as admin, display the member count --%>
    <c:if test="${not empty sessionScope.admin}">
        <div class="alert alert-success" role="alert">
            Total registered members: ${registeredMembers}
        </div>
        <a href="/logout" class="btn btn-danger">Logout</a>
    </c:if>
</div>
</body>
</html>
