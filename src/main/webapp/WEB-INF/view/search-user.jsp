<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>AIPO - User Management</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/fStyle.css">
</head>
<body>
    <div class="header">
        <div class="logo">AIPO Partout</div>
        <div class="user-info">Admin</div>
    </div>
    <div class="container">
        <div class="sidebar">
            <ul>
                <li><a href="${pageContext.request.contextPath}/">Basic information</a></li>
                <li><a href="#">import</a></li>
                <li class="active"><a href="${pageContext.request.contextPath}/user/search">User management</a></li>
                <li><a href="#">Department management</a></li>
                <li><a href="#">Position management</a></li>
            </ul>
        </div>
        <div class="main-content">
            <div class="content-box">
                <div class="page-title">User management</div>
                
                <div style="margin-bottom: 15px;">
                    <button class="btn-orange" onclick="window.location.href='${pageContext.request.contextPath}/user/add'">To add a user</button>
                </div>
                
                <div style="margin-bottom: 15px;">
                    <select style="padding: 5px; width: 200px;">
                        <option>All</option>
                    </select>
                    <button class="btn">Search</button>
                </div>
                
                <div style="margin-bottom: 10px;">
                    <button class="btn">Remove</button>
                    <button class="btn">to enable</button>
                    <button class="btn">to disable</button>
                    <button class="btn">to change the order of the user</button>
                </div>

                <table class="data-table">
                    <thead>
                        <tr>
                            <th><input type="checkbox"></th>
                            <th>State</th>
                            <th>username</th>
                            <th>name</th>
                            <th>Department name</th>
                            <th>Title</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${users}" var="u">
                            <tr>
                                <td><input type="checkbox"></td>
                                <td>Effectiveness</td>
                                <td>${u.loginName}</td>
                                <td><a href="#">${u.lastName} ${u.firstName}</a></td>
                                <td>${u.company.companyName}</td>
                                <td>${u.position != null ? u.position.positionName : ''}</td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</body>
</html>