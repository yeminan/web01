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
<title>장바구니 페이지</title>
<%@ include file="../inc/head.jsp" %>
<link rel="stylesheet" href="../inc/datatables.min.css" />
<script src="../inc/datatables.min.js"></script>
</head>
<body>
<%@ include file="../inc/header.jsp" %>
</head>
<body>
	<h2>장바구니 목록 페이지</h2>
		<form action="${path1 }/basket/List.do" id="basket"method="post">
			<table>
			
				<tbody>
				
					<c:forEach items="${basketList }" var="basket" varStatus="status">
					<c:if test="${id !='admin' }">
					<tr>
					<th><label for="cno" >상품번호</label></th>
					<td><input type="text" name="cno" id="cno" value="${basket.cno }" >
						
					</td>
					</tr>
					</c:if>
					<c:if test="${id =='admin' }">
					<tr>
					<th><label for="ccode" >상품코드</label></th>
					<td><input type="text" name="ccode" id="ccode" value="${basket.ccode }" >
						
					</td>
					</tr>
					</c:if>
					
					<c:if test="${id !='admin' }">
					<tr>
					<th><label for="ctitle" >상품명</label></th>
					<td><input type="text" name="ctitle" id="ctitle" value="${basket.ctitle }">
					</td>
					</tr>
					</c:if>
					
					<c:if test="${id !='admin' }">
					<tr>
					<th><label for="camount">상품가격</label></th>
					<td><input type="text" name="camount" id="camount" value="${basket.camount }"></td>
					</tr>
					</c:if>
					
					<c:if test="${id !='admin' }">
					<tr>
					<th><label for="camount">상품수량</label></th>
					<td><select id="camount" name="camount">
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="4">4</option>
						<option value="5">5</option></select>
						value="${basket.camount }"
					</td>
					</tr>
					</c:if>
					
					<c:if test="${id !='admin' }">
					<tr>
					<th><label for="cweight">중량</label></th>
						<td>
						<select id="cweight" name="cweight">
							<option value="300g">300g</option>
							<option value="2kg">500g</option>
							<option value="3kg">1kg</option>
							<option value="4kg">3kg</option>
							<option value="5kg">5kg</option>
						</select>
						value="${basket.cweight }"
						</td>
					</tr>
					</c:if>
					
					<c:if test="${id !='admin' }">
						<tr>
						<th><label for="cdegree">분쇄도</label></th>
						<td>
						<select  id="cdegree" name="cdegree">
							<option value="원두">원두</option>
							<option value="프렌치프레스">프렌치프레스</option>
							<option value="핸드드립">핸드드립커피메이커</option>
							<option value="모카포트">포카포트더치커피</option>
							<option value="에스프레소">에스프레소</option>
						</select>
						value="${basket.cdegree }"
						</td>
					</tr>
					</c:if>
					<c:if test="${id !='admin' }">
					<tr>
					<th><label for="cimg">상품이미지</label></th>
					<td><input type="file" name="cimg" id="cimg" value="${basket.cimg }">
					</td>
					</tr>
					</c:if>
					</c:forEach>
					<tr>
							<td colspan="2">
								<input type="submit" class="btn btn-primary" value="장바구니등록 ">
								<input type="reset" class="btn btn-primary" value="취소">
							</td>
						</tr>	

				</tbody>
			</table>
		</form>
	
</body>
</html>