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
<title>구매하기</title>
<%@ include file="../inc/head.jsp" %>
</head>
<body>
<%@ include file="../inc/header.jsp" %>
</head>
<body>
	<h2>구매하기 폼</h2>
	<form action="${path1 }/payment/insertPayment.do" method="post" id="payment">
	<table class="table" id="lst_tb">	
	
				<tbody>
					<tr>
						<th><label for="ctitle">상품제목</label></th>		
						<td>
							<c:if test="${id != 'admin' }">
								${cfbean.ctitle }
							</c:if>
						</td>
					</tr>
					<tr>
						<th><label for="cimg">상품이미지</label></th>							
						<td>
							<c:if test="${id != 'admin' }">
							<input type="image" src="../img/${cfbean.cimg }" name="cimg" id="cimg" alt="img">
							</c:if>			
						</td>
					</tr>
					<tr>
					<th><label for="cprice">상품수량</label></th>
					<td>	
						${cfbean.cprice }		
					</td>
					</tr>
					<tr>
						<th><label for="camount">상품가격</label></th>							
						<td>
						${cfbean.camount }				
						</td>
					</tr>
					<tr>
						<th>수신자명</th>
						<td>
							<input type="text" name="cname" required>
						</td>
					</tr>
					<tr>
						<th>수신자 연락처</th>
						<td>
							<input type="text" name="tel" required>
						</td>
					</tr>
					<tr>
						<th>수신자 주소</th>
						<td>
							<input type="text" name="addr1" id="addr1" required><br>
							<input type="text" name="addr2" id="addr2" placeholder="상세주소 입력" required><br>
							<input type="text" name="postcode" id="postcode" required>
							<input type="button" value="주소찾기" onclick="findAddr()" class="button is-info">
						</td>
					</tr>
					<tr>
						<th>배송장에 남길 말씀</th>
						<td>
							<input type="text" name="memo" id="memo">
						</td>
					</tr>
					<tr>
						<th>결제 방식</th>
						<td>
							<select name="paytype" required>
								<option value="credit">신용카드 결제</option>
								<option value="check">체크카드 결제</option>
								<option value="account">계좌이체</option>
							</select>
						</td>
					</tr>
					<tr>
						<th>결제 카드 번호</th>
						<td>
							카드사/은행명 : <input type="text" name="payplace" required><br>
							카드번호/계좌번호 : <input type="text" name="payno" required>
						</td>
					</tr>
					<tr>
						<td colspan="2">
							<input type="submit" value="구매" class="button is-info"/>
							<input type="reset" value="취소" class="button is-info"/>
							<p>모든 항목은 필수항목으로 꼭 입력하셔야 합니다.</p>
						</td>
					</tr>
				</tbody>
				
			</table>
		</form>
		<script>
		function findAddr() {
			new daum.Postcode({
				oncomplete: function(data) {
					console.log(data);
					var roadAddr = data.roadAddress;
					var jibunAddr = data.jibunAddress;
					document.getElementById("postcode").value = data.zonecode;
					if(roadAddr !== '') {
						document.getElementById("addr1").value = roadAddr;				
					} else if(jibunAddr !== ''){
						document.getElementById("addr1").value = jibunAddr;
					}
				}
			}).open();
		}
		</script>
		<script src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>							
</body>
</html>
