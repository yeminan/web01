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
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>회원가입 페이지</title>
<link rel="stylesheet" href="${path1 }/inc/reset.css">
<link rel="stylesheet" href="${path1 }/inc/common.css">
</head>
<body>
	<%@ include file="../inc/header.jsp" %>
	<div id="contents" class="contents">
		<div class="container px-4 px-lg-5 mt-5">
			<div class="row">
				<br><br>		
			<h2 class="page_tit">회원가입</h2>
	       </div>
            </div>
            <div class="sub_content">
                <div class="inner">
		<form action="${path1 }/member/join.do" method="post" onsubmit="return joinCheck(this)"class="join_form" name="join_form">
	<div>
		<table>
			<tbody>
				<tr>
					<th><label for="id">아이디</label></th>
					<td>
						<c:if test="${empty uid }">
						<input type="text" name="id" id="id" size="100" class="single100" placeholder="아이디 입력" required>
						 
						</c:if>
						<c:if test="${!empty uid }">
						<input type="text" name="id" id="id" size="100" class="single100" value="${uid }"pattern="^[a-z0-9]+$" placeholder="아이디 입력" required>
						</c:if>
						<button id="chkBtn" class="btn 
						btn-primary" onclick="idCheck()">중복 확인</button>
						<c:if test="${empty msg }">
						<input type="hidden" name="ck" id="ck" />
						</c:if>
						<c:if test="${!empty msg }">
						<input type="hidden" name="ck" id="ck" value="${ck }"/>
						</c:if>
					</td>
				</tr>			
			<tr>
					<th><label for="pwd">비밀번호</label></th>
					<td><input type="password" name="pwd" id="pwd"  class="single100" placeholder="비밀번호 입력" required>
						<p>(최소 8자리에서 최대 16자리까지, 숫자, 영문 대소문자, 특수문자가 각 1 문자 이상 포함되어야 함)</p>
					</td>
				</tr>
				<tr>
					<th><label for="pwd2">비밀번호 확인</label></th>
					<td><input type="password" name="pwd2" id="pwd2"  class="single100" placeholder="비밀번호 확인" required></td>
				</tr>
				<tr>
					<th><label for="uname">이름</label></th>
					<td><input type="text" name="uname" id="uname" class="single100"  required></td>
				</tr>
				<tr>
					<th><label for="email">이메일</label></th>
					<td><input type="email" name="email" id="email" class="single100" required></td>
				</tr>
				<tr>
					<th><label for="phone">전화번호</label></th>
					<td><input type="tel" name="phone" id="phone" class="single100"  placeholder="00*-000*-0000 입력" required></td>
				</tr>
				<tr>
					<th><label for="birth" >생년월일</label></th>
					<td>
						<input type="date" name="birth" id="birth" class="single100">
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" class="btn btn-writer" value="회원가입">
						<input type="reset" class="btn btn-primary" value="취소">
					</td>
				</tr>	
		</tbody>
	</table>
		</div>
		</form>
		</div>
		</div>
				<script>
				function idCheck() {
					var uid = document.join_form.id.value;
					if(uid==""){
						alert("아이디가 입력되지 않았습니다. 아이디를 입력 후 진행하시기 바랍니다.");
						return false;
					} else {
						location.href="${path1 }/member/idCheck.do?id="+uid;
					}
				}
				</script>	
				<script>
				function joinCheck(f){
					if(f.pwd.value!=f.pwd2.value){
						alert("비밀번호와 비밀번호 확인이 서로 다릅니다.");
						return false;
					}
					if(f.ck.value!="ok"){
						alert("회원가입 중복체크를 진행하지 않았습니다.");
						return false;
					}
				}
				</script>
			<div class="blank" style="min-height:350px;"></div>
		</div>	
<%@ include file="../inc/footer.jsp" %>
</body>
</html>