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
<title>장바구니 상세목록</title>
<%@ include file="../inc/head.jsp" %>
<link rel="stylesheet" href="../inc/datatables.min.css" />
<script src="../inc/datatables.min.js"></script>
</head>
<body>
<%@ include file="../inc/header.jsp" %>
</head>
<body>
<h2>장바구니 리스트 페이지</h2>
			
	<form action="${path1 }/payment/getPayment.do" method="post">
		<table class="basket">				
			<thead>
				<tr>
					
					<th>상품체크</th>
					<th>상품명</th>
					<th>가격</th>
					<th>수량</th>
					<th>중량</th>
					<th>분쇄도</th>
					<th>이미지</th>
				</tr>	
			</thead>
			<tbody>	
				<c:forEach items="${basket }" var="basket" varStatus="status">
				<tr>
				<td><input type="checkbox" name="cno" id="cno" value="${basket.cno }"></td>
				<c:if test="${id == admin }">
				<td><input type="hidden" name="ccode"id="ccode" value="${basket.ccode }"></td>
				</c:if>
				<td><input type="text" name="ctitle"id="ctitle" value="${basket.ctitle }" readonly></td>
				<td><input type="text" name="cprice" id="cprice" value="${basket.cprice }"readonly></td>
				
				<td><input type="number" name="camount" id="camount"value="${basket.camount }"></td>
					
				<td><input type="text" name="cweight" id="cweight" value="${basket.cweight }"readonly><td>
				<td><input type="text"name="cdegree" id="cdegree" value="${basket.cdegree }" readonly></td>
				<td><img src="../img/${basket.cimg }"  name="cimg" id="cimg"  alt="img" ></td>
				</tr>
				</c:forEach>
				
		
			
			
						<tr>					
							<td colspan="3">
							<c:if test="${id == 'admin' }">
							<input type="submit" value="상품 정보 수정" class="button is-info"/>
							<input type="reset" value="취소" class="button is-info"/>
							</c:if>
							<c:if test="${id != 'admin' }">
							<input type="submit" value="구매하기">
							<a href="${path1 }/basket/updateBasket.do?id=${id }">상품 수량 변경</a>
							<a href="${path1 }/basket/deleteBasket.do?id=${id }">장바구니 삭제 </a>
							</c:if>
							<a href="../cfbean/List.do" class="button is-info">목록</a>
							
						</td>
						</tr>
				
			
			</tbody>
		</table>
		</form>

</body>
</html>