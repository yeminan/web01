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
					<th>상품번호</th>
					<th>상품명</th>
					<th>가격</th>
					<th>수량</th>
					<th>중량</th>
					<th>분쇄도</th>
					<th>이미지</th>
				</tr>
				<tr>
				<td><input type="text" name="ccode" id="ccode" value="${basket.ccode }"></td>
				<td><input type="text" name="ctitle" id="ctitle" value="${basket.ctitle }"readonly></td>
				<td><input type="text" name="cprice" id="cprice" value="${basket.cprice }"readonly></td>
				<td>${basket.camount }</td>
				</tr>
			</thead>
			
			<tbody>
				
				 <c:forEach items="${basketList }" var="basket" varStatus="status">
						
						<tr>
						
							<td>
							<input type="checkbox">
							<input type="text" name="cno" id="cno" value="${basket.cno }" readonly></td>
						
							<c:if test="${id ==admin }">
							<td>
							<input type="checkbox">
							<input type="text" name="cno" id="cno" value="${basket.cno }" readonly></td>
							</c:if>
							
						
						
							<c:if test="${id ==admin }">
							<td><input type="text" name="ccode" id="ccode" value="${basket.ccode }" readonly></td>
							</c:if>
							<c:if test="${id !=admin }">
							<td><input type="hidden" name="ccode" id="ccode" value="${basket.ccode }" readonly></td>
							</c:if>
						
						
					
							<td><input type="text" name="ctitle" id="ctitle" value="${basket.ctitle }"readonly></td>
							<td><input type="text" name="ctitle" id="ctitle" value="${basket.ctitle }"readonly></td>
					
						
						
							<c:if test="${id ==admin }">
							<td><input type="text" name="cprice" id="cprice" value="${basket.cprice }"readonly></td>
							</c:if>
							<c:if test="${id !=admin }">
							<td><input type="text" name="cprice" id="cprice" value="${basket.cprice }"readonly></td>
							</c:if>
							
							
							<td>${basket.camount }<select id="camount" name="camount">
							
								<option value="1">1</option>
								<option value="2">2</option>
								<option value="3">3</option>
								<option value="4">4</option>
								<option value="5">5</option></select>
							</td>
							
							
							
							<td>${basket.cweight }
								<select id="cweight" name="cweight">
									<option value="1kg">300g</option>
									<option value="2kg">500g</option>
									<option value="3kg">1kg</option>
									<option value="4kg">3kg</option>
									<option value="5kg">5kg</option>
								</select>
							</td>	
							
										
								
							<td>${basket.cdegree }
								<select  id="cdegree" name="cdegree">
									<option value="원두">원두</option>
									<option value="프렌치프레스">프렌치프레스</option>
									<option value="핸드드립">핸드드립커피메이커</option>
									<option value="모카포트">포카포트더치커피</option>
									<option value="에스프레소">에스프레소</option>
									
								</select>
								
							</td>
							<td>
								%{basket.cimg }
							</td>	
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
							<a href="${path1 }/basket/updatebasket.do?id=${id }">상품 수량 변경</a>
							</c:if>
							<a href="../cfbean/List.do" class="button is-info">목록</a>
							<a href="../basket/deletebasket.do?ccno=${bakset.ccno }">장바구니 삭제 </a>
						</td>
						</tr>
				
			
			</tbody>
		</table>
		</form>
	
	
</body>
</html>