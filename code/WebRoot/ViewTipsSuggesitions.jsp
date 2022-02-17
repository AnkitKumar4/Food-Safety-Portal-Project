<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="./UserCheck.jsp"></jsp:include>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>My JSP 'ViewTipsSuggesitions.jsp' starting page</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

	</head>

	<body>
		<form action="./DeleteTipsAction.do" mehtod='post'>

			<jsp:include page="Header.jsp"></jsp:include>
			<br />
			<center>
				<table border='0'>
					<caption>
						<h3>
							STATES INFORMATION
						</h3>
					</caption>


					<tr bgcolor="ashblue">
						<%
							if (session.getAttribute("role").equals("admin")) {
						%>
						<td></td>
						<%
							}
						%>
						<td>
							<b>Citizen Name</b>
						</td>
						<td>
							<b>Suggesstion Description</b>
						</td>
						<td>
							<b>EmailId</b>
						</td>
					</tr>
					<c:if test="${not empty vSuggestions}">
						<c:forEach var="tips" items="${vSuggestions}">
							<tr>
								<%
									if (session.getAttribute("role").equals("admin")) {
								%>
								<td align='right'>
									<input type="checkbox" name='ch' value="${tips.suggesstionid }">
								</td>
								<%
									}
								%>
								<td align="center">
									<b> ${tips.citizenname} </b>
								</td>
								<td align="center">
									<b> ${tips.suggestonsdescription} </b>

								</td>
								<td align="center">
									<b> ${tips.emailid} </b>

								</td>
							</tr>
						</c:forEach>
					</c:if>
					<%
						if (session.getAttribute("role").equals("admin")) {
					%>
					<tr>
						<td colspan="3">
							<center>
								<input type="submit" value='Delete'>
							</center>
						</td>
					</tr>
					<%
						}
					%>
				</table>
			</center>
		</form>
	</body>

	<br />
	<jsp:include page="./Footer.jsp"></jsp:include>

</html>
