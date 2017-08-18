<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<title>Bootstrap 101 Template</title>
<link href="/surveypark/css/bootstrap.min.css" rel="stylesheet">
<style>
#one {
	margin-top: 30px
}
</style>

</head>
<body>
	<%@include file="/nav.jsp"%>
	<c:if test="${sessionScope.loginuser!=null }">
		欢迎您,${sessionScope.loginuser.name }
	</c:if>

	<div id="one" class="panel panel-default">

		<div class="panel-heading">Panel heading</div>
		<table class="table">

			<c:choose>
				<c:when test="${requestScope.surveys==null }">
					<tr>
						<td>没有调查</td>
					</tr>

				</c:when>
				<c:otherwise>
						<c:forEach items="${requestScope.surveys }" var="item">
							<tr>
								<td>
									${item.id }
								</td>
								<td>
									${item.title }
								</td>
								<td>
									<a href="#">编辑</a>
								</td>
								<td>
									<a href="#">删除</a>
								</td>
							</tr>
						</c:forEach>
				
				</c:otherwise>
			</c:choose>


		</table>
	</div>




	<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>

	<script src="/surveypark/js/bootstrap.min.js"></script>
</body>
</html>