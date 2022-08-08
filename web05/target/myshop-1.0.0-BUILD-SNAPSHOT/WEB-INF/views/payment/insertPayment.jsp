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
<%@ include file="../inc/header.jsp" %>
<title>구매정보페이지</title>
</head>
<body>
<h2>상품 구매정보 페이지</h2>

	<form action="payment.do" method="post">
		<div class="panel-body">
					<table class="table">
						<thead><tr><th>연번</th><th>구입제품</th><th>결제금액</th><th>구입일</th></tr></thead>
						<tbody id="orderData">
							<c:if test="${paymentList == null || empty paymentList}">
								<tr><td colspan="4">구매하신 제품이 없습니다.</td><tr>
							</c:if>
							<c:if test="${paymentList != null || !empty paymentList}">
							<c:forEach items="${paymentList}" var="payment" varStatus="status">
								<tr>
									<td>${status.count }</td>
									<td><a href="getPayment.do?cno=${payment.cno}">${payment.ccode }</a></td>
									<td>${payment.money }</td>
									<td>${payment.sdate }</td>
								</tr>
							</c:forEach>
							</c:if>
						</tbody>
					</table>
				</div>
	</form>
</body>
</html>