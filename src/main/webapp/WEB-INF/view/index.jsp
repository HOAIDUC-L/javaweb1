<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>AIPO - Basic Information</title>
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
                <li class="active"><a href="${pageContext.request.contextPath}/">Basic information</a></li>
                <li><a href="#">import</a></li>
                <li><a href="${pageContext.request.contextPath}/user/search">User management</a></li>
                <li><a href="#">Department management</a></li>
                <li><a href="#">Position management</a></li>
            </ul>
        </div>
        <div class="main-content">
            <div class="content-box">
                <div class="page-title" style="display:flex; justify-content: space-between;">
                    <span>Basic information</span>
                    <button class="btn">Configuration</button>
                </div>
                
                <h4>Access from the house</h4>
                <p style="font-size: 13px; color: #666; margin: 10px 0;">It is the address to access from the house to the "Aipo". The house of the user, please contact us to this address.</p>
                <p><strong>Aipo site (in-house)</strong> http://157.7.209.80/</p>
                <div style="text-align: center; margin: 15px 0;"><button class="btn">To edit</button></div>
                <hr style="border:0; border-top:1px solid #eee; margin:20px 0;">
                
                <h4>Access from outside the company</h4>
                <p style="font-size: 13px; color: #666; margin: 10px 0;">The address for accessing the "Aipo" from outside the company.</p>
                <p><strong>Aipo site (Outside)</strong></p>
                <div style="text-align: center; margin: 15px 0;"><button class="btn">To edit</button></div>
            </div>
        </div>
    </div>
</body>
</html>