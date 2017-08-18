<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html lang="zh-CN">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>Bootstrap 101 Template</title>
    <link href="/surveypark/css/bootstrap.min.css" rel="stylesheet">

   
  </head>
  <body>
	<%@include file="/nav.jsp" %>

<div class=" col-md-offset-3 col-md-6">
	<form:form action="/surveypark/user/login" method="post" modelAttribute="user">

   <div class="form-group ">
    <label for="exampleInputPassword1">姓名</label>
   <input name="name" type="text" class="form-control" id="exampleInputPassword1" placeholder="name"> 
   <%-- 	<form:input path="name" class="form-control" id="exampleInputPassword1"/> --%>
  </div>


  <div class="form-group ">
    <label for="exampleInputPassword1">密码</label>
     <input name="password" type="password" class="form-control" id="exampleInputPassword1" placeholder="Password"> 
    <%-- <form:password path="password" class="form-control" id="exampleInputPassword1"/> --%>
     ${requestScope.error}
  </div>


  
 

  <button type="submit" class="btn btn-default">Submit</button>
</form:form>
</div>


    
    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    
    <script src="/surveypark/js/bootstrap.min.js"></script>
  </body>
</html>