<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h4>Scope(객체의 저장범위)</h4>
	<!-- requestScope가 먼저 호출됨 -->
	${vo.no }<br/>
	${vo.name }<br/>
	
	===============================<br/>
	<!-- 명시적 표현 -->
	${sessionScope.vo.no }<br/>
	${sessionScope.vo.name }<br/>
	
</body>
</html>