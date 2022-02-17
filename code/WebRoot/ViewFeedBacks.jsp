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

		<title>My JSP 'ViewFeedBacks.jsp' starting page</title>

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
		<form action="./DeleteFeedbackAction.do" mehtod='post'>

			<jsp:include page="Header.jsp"></jsp:include>
			<br />
			<center>
				<table border='0'>
					<caption>
						<h3>
							Feedbacks
						</h3>
					</caption>


					<tr bgcolor="ashblue">
						<%
							if (session.getAttribute("role").equals("admin")) {
						%>
						<td><br><br></td>
						<%
							}
						%>
						<td>
							<b>FeedBack On</b>
						</td>
						<td>
							<b>Sender Name</b>
						</td>
						<td>
							<b>FeedBack</b>
						</td>
					</tr>
					<c:if test="${not empty vFeedbacks}">
						<c:forEach var="feedback" items="${vFeedbacks}">
							<tr>
								<%
									if (session.getAttribute("role").equals("admin")) {
								%>
								<td align='right'>
									<input type="checkbox" name='ch'
										value="${feedback.feedbackid }">
								</td>
								<%
									}
								%>
								<td align="center">
									<b> ${feedback.feedbackitem} </b>
								</td><td align="center">
									<b> ${feedback.feedsendername} </b>
								</td>
								<td align="center">
									<b> ${feedback.feedbackdescription} </b>

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
