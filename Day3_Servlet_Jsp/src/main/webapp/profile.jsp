<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Profile API</h1>
	<hr>
	<br>
	<label>Name : ${Name} </label>
	<br>
	<br>
	<label>ID : ${ID} </label>
	<br>
	<br>
	<label>City : ${City}</label>
	<br>
	<br>
	<label>Email :${Email} </label>
	<br>
	<br>


	<%
	// System.out.println("Hello ");

	//PrintWriter out = req.getWriter();

	//out.println();
	// request.getParameter(name);

	//session.setAttribute(, arg1);

	for (int i = 1; i <= 30; i++) {

		if (i % 2 == 0) {
			out.println("<h1>" + i + "</h1>");
		}
	}
	%>



</body>
</html>