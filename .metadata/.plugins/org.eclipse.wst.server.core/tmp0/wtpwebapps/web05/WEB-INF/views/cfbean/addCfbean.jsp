<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품등록 페이지</title>
<%@ include file="../inc/head.jsp" %>
</head>
<body>
<%@ include file="../inc/header.jsp" %>
<div id="contents" class="contents">
	<div class="container px-4 px-lg-5 mt-5">
		<div class="row">
			<br><br>		
			<h2 class="tit">상품등록</h2>
			<form action="addCfbeanForm.do" id="cfbean" method="post">
				<table class="form">
					<tbody>
						
						<tr>
							<th><label for="cno">상품번호</label></th>
							<td><input type="text" name="cno" id="cno" size="10" class="single100" placeholder="상품번호 입력" required></td>
						</tr>
					
						<tr>
							<th><label for="ccode">상품코드</label></th>
							<td><input type="hidden" name="ccode" id="ccode" size="10" class="single100" placeholder="상품코드 입력" required></td>
						</tr>
						<tr>
							<th><label for="ctitle">제목</label></th>
							<td><input type="text" name="ctitle" id="ctitle" size="100" class="single100" placeholder="상품제목 입력" required></td>
						</tr>
						<tr>
						<th><label for="camount">상품수량</label></th>
						<td><select id="camount" name="camount">
							<option value="1">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
							<option value="4">4</option>
							<option value="5">5</option></select>
						</td>
						</tr>
						<tr>
						<th><label for="cprice">상품가격</label></th>
						<td><input type="text" name="cprice" id="cprice" size="30" class="single100" ></td>
						</tr>
						<tr>
						<th><label for="cimg">상품이미지</label></th>
						<td><input type="file" name="cimg" id="cimg">
						<tr>
							<th><label for="ccontent">내용</label></th>
							<td><textarea name="ccontent" id="ccontent" cols="100" rows="8" class="multi100" placeholder="상품 내용 입력" required></textarea></td>
						</tr>
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
						</td>
						</tr>
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
						</td>
						</tr>
						<tr>
							<td colspan="2">
								<input type="submit" class="btn btn-primary" value="상품등록 ">
								<input type="reset" class="btn btn-primary" value="취소">
							</td>
						</tr>	
					</tbody>
				</table>
			</form>
		</div>
	</div>		
</div>
</body>
</html>