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
<title>커피상품상세정보 보기</title>
<%@ include file="../inc/head.jsp" %>
</head>
<body>
<%@ include file="../inc/header.jsp" %>
<div id="contents" class="contents">
	<div class="container px-4 px-lg-5 mt-5">
		<div class="row">
			<br><br>		
			<h2 class="tit">커피상품정보 보기</h2>
			<c:if test="${id =='admin' }">
			<form action="${path1 }/cfbean/updateCfbean.do?cno=${cfbean.cno }" method="post">
			</c:if>
			 <c:if test="${id !='admin' }">
			<form action="${path1 }/basket/insertBasket.do" method="post">
			</c:if>
			
			
			<table class="table">
				<tbody>
					
			 		<tr>
						<th><label for="cno">상품번호</label></th>							
						<td>
							<c:if test="${id == 'admin' }">
							<input type="text" name="cno" id="cno" value="${cfbean.cno }">
							<input type="hidden" name="id" id="id"  value="${id }"/>
							</c:if>	
							<c:if test="${id != 'admin' }">
							<input type="hidden" name="cno" id="cno" value="${cfbean.cno }">
							<input type="hidden" name="id" id="id"  value="${id }"/>
							</c:if>					
						</td>
					</tr>
					
					<tr>
						<th><label for="ctitle">상품제목</label></th>
						<td>
							<c:if test="${id == 'admin' }">
							<input type="hidden" name="ccode" id="ccode" value="${cfbean.ccode }">
							<input type="text" name="ctitle" id="ctitle" value="${cfbean.ctitle }">
							</c:if>	
							<c:if test="${id != 'admin' }">
							<input type="hidden" name="ccode" id="ccode" value="${cfbean.ccode }">
							<input type="text" name="ctitle" id="ctitle" value="${cfbean.ctitle }" readonly>
							</c:if>
						</td>
						</tr>
					<tr>
						<th><label for="ccontent">상품내용</label></th>
						<td>
							<c:if test="${id == 'admin' }">
							<input type="text" name="ccontent" id="ccontent" value="${cfbean.ccontent }">
							</c:if>	
							<c:if test="${id != 'admin' }">
							<input type="text" name="ccontent" id="ccontent" value="${cfbean.ccontent }">
							</c:if>			
						</td>
					</tr>
					<tr>
						<th><label for="cimg">상품이미지</label></th>							
						<td>
							<c:if test="${id == 'admin' }">
							<input type="image" src="../img/${cfbean.cimg }" value="${cfbean.cimg }"  id="cimg" alt="img">
							<input type="hidden"value="${cfbean.cimg }" name="cimg">
							</c:if>	
							<c:if test="${id != 'admin' }">
							<input type="image" src="../img/${cfbean.cimg }" value="${cfbean.cimg }"  id="cimg" alt="img">
							<input type="hidden"value="${cfbean.cimg }" name="cimg">
							</c:if>			
						</td>
					</tr>
					<tr>
						<th><label for="camount">상품수량</label></th>							
						<td>
							<c:if test="${id == 'admin' }">
							<input type="text" name="camount" id="camount" value="${cfbean.camount }">
							</c:if>	
							<c:if test="${id != 'admin' }">
							<input type="number" name="camount" id="camount" max="10" value="${cfbean.camount }"> 
							</c:if>					
						</td>
					</tr>
					<tr>
					<th><label for="cprice">상품가격</label></th>
					<td>	
							<c:if test="${id == 'admin' }">
							<input type="text" name="cprice" id="cprice" value="${cfbean.cprice }">
							</c:if>	
							<c:if test="${id != 'admin' }">
							<input type="text" name="cprice" id="cprice" value="${cfbean.cprice }">
							</c:if>					
						
					</td>
					</tr>
					
					<tr>
					<th><label for="cweight">중량</label></th>
					<td>
							<select id="cweight" name="cweight" >
							<option value="${cfbean.cweight }">300g</option>
							<option value="2kg">500g</option>
							<option value="3kg">1kg</option>
							<option value="4kg">3kg</option>
							<option value="5kg">5kg</option>
							</select>
					</td>
					</tr>
					<tr>
					<th><label for="cdegree">분쇄도</label></th>
					<td>
							<select  id="cdegree" name="cdegree">
							<option value="${cfbean.cdegree }">원두</option>
							<option value="프렌치프레스">프렌치프레스</option>
							<option value="핸드드립">핸드드립커피메이커</option>
							<option value="모카포트">포카포트더치커피</option>
							<option value="에스프레소">에스프레소</option>
							</select>			
					</td>
					</tr>
					
					<tr>					
							<td colspan="3">
							<c:if test="${id == 'admin' }">
							<input type="submit" value="제품정보수정" class="btn btn-primary"/>
							<a href="${path1 }/cfbean/deleteCfbean.do?cno=${cfbean.cno }" class="btn btn-primary">제품삭제</a>
							<input type="reset" value="취소" class="btn btn-primary"/>
							</c:if>
							<c:if test="${id != 'admin' }">
							<input type="submit" class="btn btn-primary" value="구매하기">
							<input type="submit" value="장바구니 담기" class="btn btn-primary" />
							</c:if>
							<a href="List.do" class="btn btn-primary">목록</a>				
						</td>
					</tr>	
		
				</tbody>
				
			</table>
			</form>
	</form>
							
									
							
		</div>
	</div>		
</div>

</body>
</html>