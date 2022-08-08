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
<title>상품구매</title>
</head>
<%@ include file="../inc/head.jsp" %>
</head>
<body>
<%@ include file="../inc/header.jsp" %>
<h2 class="page-tit">구매 상품 목록</h2>
	<table class="table-pay">
					
			<thead>
			
				<tr>
					<th>순번</th>
					<th>아이디</th>
					<th>상품명</th>
					<th>결제금액</th>
					<th>결제일</th>
					<th>수신상태<th>
				</tr>
			</thead>
			<tbody>
					<c:forEach items="${userPaymentList }" var="userPaymentList" varStatus="status">
					<tr>
					<td><a href="${userPaymentList.cno }">${userPaymentList.cno }</a></td>
					<td><a href="${userPaymentList.userid }">${userPaymentList.userid }</a></td>
					<td><a href="${userPaymentList.ctitle }">${userPaymentList.ctitle }</a></td>
					<td>${userPaymentList.cprice }</td>
					<td>${userPaymentList.rdate }</td>
					<td>${userPaymentList.rstatus }</td>
					</tr>					
					</c:forEach>
					<tr>
				<td colspan="5">
					<c:if test="${vo==null }">
						<span class="nothing">더 이상 상품이 존재하지 않습니다.</span>
					</c:if>
				</td>
			</tr>
	</tbody>
</table>								
</body>
</html>