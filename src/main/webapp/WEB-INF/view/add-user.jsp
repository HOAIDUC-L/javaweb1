<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Add User</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/fStyle.css">
</head>
<body style="background: #e9e9e9;">
    <div class="modal-overlay">
        <div class="modal-content">
            <div class="modal-header">
                <span>> Add User</span>
                <a href="${pageContext.request.contextPath}/user/search" style="text-decoration: none; color: #333; font-weight: bold;">X</a>
            </div>
            <div class="modal-body">
                <form action="${pageContext.request.contextPath}/user/save" method="POST">
                    
                    <div class="form-group">
                        <label>login name <span class="required">必須</span></label>
                        <input type="text" name="loginName" placeholder="" required>
                        <span class="note">(Alphanumeric)</span>
                    </div>

                    <div class="form-group">
                        <label>password <span class="required">必須</span></label>
                        <input type="password" name="passwordValue" required>
                    </div>

                    <div class="form-group">
                        <label>name <span class="required">必須</span></label>
                        <input type="text" name="lastName" style="width: 120px;" placeholder="Last Name" required>
                        <input type="text" name="firstName" style="width: 120px; margin-left: 5px;" placeholder="First Name" required>
                    </div>

                    <div class="form-group">
                        <label>mail address</label>
                        <input type="text" name="email" placeholder="example@aipo.com">
                        <span class="note">(Alphanumeric)</span>
                    </div>

                    <div class="form-group">
                        <label>Telephone number (outside line)</label>
                        <input type="text" name="outTelephone" placeholder="090-1234-5678">
                        <span class="note">(Byte numbers)</span>
                    </div>

                    <div class="form-group">
                        <label>Position</label>
                        <select name="position.positionId" style="padding: 5px; width: 250px;">
                            <option value="">Not specified</option>
                            <c:forEach items="${positions}" var="pos">
                                <option value="${pos.positionId}">${pos.positionName}</option>
                            </c:forEach>
                        </select>
                    </div>
                    
                    <div class="form-group">
                        <label>Administrative privileges</label>
                        <input type="checkbox" name="isAdmin" value="true"> To administrator
                    </div>

                    <div class="modal-footer">
                        <button type="submit" class="btn-orange">Adding</button>
                        <button type="button" class="btn" onclick="window.location.href='${pageContext.request.contextPath}/user/search'">Close</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</body>
</html>