<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html lang="zh-CN">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    
    <title>Bootstrap 101 Template</title>
    <link href="/surveypark/css/bootstrap.min.css" rel="stylesheet">

   
  </head>
  <body>
	<%@include file="/nav.jsp" %>
<div class=" col-md-offset-3 col-md-6">
	<form:form action="/surveypark/user/reg" method="post" modelAttribute="user">
  <div class="form-group ">
    <label for="exampleInputEmail1">邮箱</label>
    <input name="email" type="email" class="form-control" id="exampleInputEmail1" placeholder="Email">
  </div>
  <div class="form-group ">
    <label for="exampleInputPassword1">密码</label>
    <input name="password" type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
    <form:errors path="password"></form:errors>
  </div>
   <div class="form-group ">
    <label for="exampleInputPassword1">姓名</label>
    <input name="name" type="text" class="form-control" id="exampleInputPassword1" placeholder="name">
    ${requestScope.error}
  </div>
   <div class="form-group ">
    <label for="exampleInputPassword1">昵称</label>
    <input name="nickName" type="text" class="form-control" id="exampleInputPassword1" placeholder="nickname">
  </div>
  
  
 

  <button type="submit" class="btn btn-default">Submit</button>
</form:form>
</div>




    
    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    
    <script src="/surveypark/js/bootstrap.min.js"></script>
  </body>
</html>