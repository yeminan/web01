<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자료등록 실습</title>
</head>
<body>
	<div>
		<h2>자료등록 실습</h2>
		<form action="databankinsert.do" method="post" enctype="multipart/form=data">
			<label for ="title">제목</label>
			<input type ="text" name="title" id="title"/><br><br>
			<label for ="fileurl">파일</label>
			<input type ="file" name="fileurl" id="fileurl"/><br><br>
			<label for ="author">작성자</label>
			<input type ="text" name="author" id="author"/><br><br>
			
			<br>
			<br>
			<br>
			<input type="submit" name="submitBtn" value="자료등록">
		</form> 
	</div>
</body>
</html>