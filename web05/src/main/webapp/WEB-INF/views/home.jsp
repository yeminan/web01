<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:set var="path1" value="pageContext.request.contextPath"></c:set>
<html>
<head>
	<title>MAIN</title>
	
</head>
<body>
<%@ include file="./inc/header.jsp" %>
<div class="wrap">
	<div id="content" class="content">
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
</div>
<p>sid : ${sid  }</p>
<p>id :  ${id }</p>
</div>
</body>
</html>
