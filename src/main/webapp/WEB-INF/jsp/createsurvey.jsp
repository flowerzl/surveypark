<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
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
	
	<form:form action="/surveypark/survey/newsurvey" method="post" modelAttribute="survey">
		 <div class="form-group ">
    <label for="exampleInputPassword1">题目</label>
  <!--  <input name="name" type="text" class="form-control" id="exampleInputPassword1" placeholder="name"> --> 
 	<form:input path="title" class="form-control" id="exampleInputPassword1"/> 
 	</div>
		
	<button type="submit" class="btn btn-default">Submit</button>
	
	</form:form>



    
    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    
    <script src="/surveypark/js/bootstrap.min.js"></script>
  </body>
</html>