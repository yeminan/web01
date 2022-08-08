<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<c:set var="path1" value="{pageContext.request.contextPath }" />

<!DOCTYPE html>
<html>
<script src="https://code.jquery.com/jquery-latest.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<head>
<meta charset="UTF-8">

<link rel="stylesheet" href="${path1 }/inc/reset.css">
<link rel="stylesheet" href="${path1 }/inc/common.css">
<script>
$(document).ready(function(){
	$("#fr1").css("z-index","1000");
});
</script>

</head>
<body>
<div id="con" class="content">
<%@ include file="../inc/header.jsp" %>
	<h2 class="page_tit">로그인</h2>
	  <div class="col-lg-6" id="fr1">
	<form action="signin.do" method="post" name="loginForm" >
	<div class="table_form_wrap">
		<div class="form-group">
			<input type="text" name="id" id="id" class="form-control" placeholder="아이디 입력" required/>
		</div>
		<br><br>
		<div class="form-group">
			<input type="password" name="pwd" id="pwd" class="form-control" placeholder="비밀번호 입력" required/>
		</div>
		<br><br>
		<div class="form-group">
			<div class="text-right">
				<button type="submit" class="btn btn-primary">로그인</button>
				<button type="reset" class="btn btn-primary">취소</button>
			</div>
		</div>
		<br><br>
		<hr>
		<br><br>
	</div>
	</form>
	<c:if test="${msg == false }">
			<div class="msg" style="margin-bottom:50px;">아이디 또는 비밀번호 입력이 잘못되어 로그인이 실패되었습니다.</div>
	</c:if>	
	</div>
				
</div>>
</body>
</html>