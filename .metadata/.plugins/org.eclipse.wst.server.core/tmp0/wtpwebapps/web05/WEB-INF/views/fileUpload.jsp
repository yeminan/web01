<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>업로드 실습</title>
</head>
<body>
	<div>
		<form action="fileUpload.do" method="post" enctype="multipart/form=data">
			<label for ="file">파일 업로드</label>
			<input type ="file" name="myfile" />
			<br>
			<br>
			<br>
			<input type="submit" name="submitBtn" value="파일업로드">
		</form> 
	</div>
</body>
</html>