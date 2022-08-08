<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<c:set var="path1" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품목록 페이지</title>
<%@ include file="../inc/head.jsp" %>
<link rel="stylesheet" href="../inc/datatables.min.css" />
<script src="../inc/datatables.min.js"></script>
</head>
<body>
<%@ include file="../inc/header.jsp" %>
				<h2>상품목록</h2>
				<form action="${path1 }/List.do" method="get">
							<section  id="content">
							<div></div>
								<div class="box">
									<p>신상품 | 상품명 | 낮은가격 | 높은가격 | 제조사 |사용후기</p>
								
							<c:forEach items="${cfbeanList }" var="cfbean" varStatus="status">
							<tr>
								<th><img src="../img/${cfbean.cimg }" alt="img"></th><br>
								<th>${status.count }</th><br>
								<th><a href="cfbeanRead.do?cno=${cfbean.cno }">${cfbean.ctitle }</a></th><br>	
								<th>${cfbean.cprice }</th><br>
								<th>${cfbean.cdegree }</th><br>
							</tr>
							</c:forEach>
								</div>
							</section>
				</form>
</body>
</html>