<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자유게시판 글보기</title>
</head>
<body>
	<h2>자유게시판 글 내용</h2>
	<hr>
	<table width="600" border="1" cellpadding="0" cellspacing="0">
		<tr>
			<td>제 목</td>
			<td>안녕하세요 반갑습니다!</td>			
		</tr>
		<tr>
			<td>글쓴이</td>
			<td>홍길동</td>
		</tr>		
		<tr>
			<td>등록일</td>
			<td>2022-10-20 19:08:17</td>
		</tr>
		<tr>
			<td>조회수</td>
			<td>150</td>			
		</tr>
		<tr>
			<td>내 용</td>
			<td>저는 홍길동입니다. 가입인사드립니다.</td>			
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="button" value="글수정">
				<input type="button" value="글삭제">
				<input type="button" value="글목록" onclick="javascript:window.location='list.do'">
			</td>
		</tr>
	</table>
</body>
</html>