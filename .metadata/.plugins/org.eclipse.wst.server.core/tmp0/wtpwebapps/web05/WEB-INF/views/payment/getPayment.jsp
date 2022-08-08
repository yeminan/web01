<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<c:set var="path1" value="{pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@ include file="../inc/head.jsp" %>
<link rel="stylesheet" href="../inc/datatables.min.css" />
<script src="../inc/datatables.min.js"></script>
</head>
<body>
<%@ include file="../inc/header.jsp" %>
<div id="contents" class="contents">
	<div class="container px-4 px-lg-5 mt-5">
		<div class="row">
			<br><br>		
			<h2 class="tit">구입 상품 보기</h2>
			<br><hr>
			<input type="hidden" name="cno" id="cno" value="${payment.cno }" />
			<div class="panel-body">
				<table class="table">
					<tbody>
						<tr>
							<th><label for="cno">주문번호</label></th>
							<td>
								${payment.cno } 
							</td>
						</tr>
						<tr>
							<th><label for="paytype">결제정보</label></th>
							<td>
								<p><strong>결제 방식</strong> : ${payment.paytype }</p> 
								<p><strong>결제 기관</strong> : ${payment.payplace }</p>
								<p><strong>결제 카드(계좌) 번호</strong> : ${payment.payno }</p>
								<p><strong>구매 수량</strong> : ${payment.amount }</p>
								<p><strong>결제 금액</strong> : ${payment.money }</p>
								<p><strong>결제일</strong> : ${payment.sdate }</p>
							</td>
						</tr>
						<tr>
							<th><label for="gnum">주문 제품 정보</label></th>
							<td>
								<div>
									<input type="hidden" name="cfbeaninfo" id="cfbeaninfo" value="${payment.cno }" />
									<p id="cno">제품 번호 : ${payment.cno }</p>
									<p id="ctitle">제품명 : </p>
									<p id="cprice">제품가격 : </p>
									<p>제품 사진 : <img src="" alt="" id="cimg" /></p>
								</div> 
							</td>
						</tr>
						<c:if test="${!empty payment.transno}">
						<tr>
							<th><label for="">배송정보</label></th>
							<td>
								<div>
									<p>배송코드 : ${payment.transno}</p>
									<p>배송업체 : ${payment.transco}</p>
									<p>수신상태 : ${payment.rstatus}</p>
									<p>도착예정일 : ${payment.rdate}</p>
								</div>
							</td>
						</tr>
						</c:if>
						<c:if test="${empty payment.transno}">
						<tr>
							<td colspan="2">아직 배송정보가 없습니다.</td>
						</tr>
						</c:if>
						<tr>
							<td colspan="2">
								<a href="list.do" class="btn btn-primary">목록</a>
								<c:if test="${empty payment.transno }">
								<a href="deletepayment.do?cno=${payment.cno }" class="btn btn-primary">주문취소</a>
								</c:if>
							</td>
						</tr>
					</tbody>
				</table>
				<div>배송이 시작되면, 주문 취소가 불가능합니다.</div>
				<script>
				$(document).ready(function(){
					var ctitle = document.getElementById("Cfbeaninfo").value;
					function loadingCfbeans(){
						$.ajax({
							type:"get",
							url:"../cfbeans/getAjaxcfbeans.do?camount="+camount,
							dataType:"json",
							success:function(cfbean){
								$("#ctitle").html("제품명 : "+cfbean.ctitle);
								$("#cprice").html("제품가격 : "+cfbean.cprice);
								$("#cimg").attr({"src":"../upload/"+cfbean.cimg,"alt":cfbean.ctitle});
							},
							error:function(cfbean, status, err){
								
							}
						});
					}
					loadingcfbean();
				});
				</script>			
			</div>
		</div>
	</div>
	<div class="blank" style="min-height:350px"></div>		
</div>
<%@ include file="../inc/footer.jsp" %>
</body>
</html>

</body>
</html>