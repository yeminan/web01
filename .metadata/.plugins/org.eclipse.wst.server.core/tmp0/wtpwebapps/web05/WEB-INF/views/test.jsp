<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:set var="path1" value="{pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>통합 테스트 페이지</title>
<style>
table { border-collapse:collapse; }
table th, table td { border-bottom:1px solid #333; padding:14px; } 
table th { border-top:1px solid #333; background-color:#333; color:#fff; }
h2 strong { color:red; }
</style>
</head>
<body>
<h2>Controller -> Service -> DAO -> MyBatis -> DB And View <strong>Integration Test</strong></h2>
<p>회원수 : ${cnt }</p>
<table>
	<tr>
		<th>연번</th>
		<th>아이디</th>
		<th>성명</th>
		<th>가입일자</th>
		<th>생년월일</th>
	</tr>
	<c:forEach items="${sampleList }" var="sample" varStatus="status">
	<tr>
		<td>${status.count }</td>
		<td>${sample.id }</td>
		<td>${sample.uname }</td>
		<td>${sample.regdate }</td>
		<td>${sample.birth }</td>
	</tr>
	</c:forEach>
</table>
</body>
</html>