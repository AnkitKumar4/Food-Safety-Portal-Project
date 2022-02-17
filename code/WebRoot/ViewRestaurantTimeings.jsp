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
		<form action="./DeleteRestaurantInfoAction.do" mehtod='post'>

			<jsp:include page="Header.jsp"></jsp:include>
			<br />
			<center>
				<table border='0'>
					<caption>
						<h3>
							City Restaurants Information
						</h3>
					</caption>


					<tr bgcolor="ashblue">
						<%
							if (session.getAttribute("role").equals("subadmin")) {
						%>
						<td></td>
						<%
							}
						%>
						<td>
							<b>Restaurant Name</b>
						</td>
						<td>
							<b>Restaurant Certification</b>
						</td>
						<td>
							<b>Restaurant Type</b>
						</td>
						<td>
							<b>Open Time </b>
						</td>
						<td>
							<b>Close Time</b>
						</td>
						<td>
							<b>Supply Pattern</b>
						</td>
						<td>
							<b>Contact Address</b>
						</td>
						<td>
							<b>Menu</b>
						</td>
					</tr>
					<c:if test="${not empty wSupplies}">
						<c:forEach var="supply" items="${wSupplies}">
							<tr>
								<%
									if (session.getAttribute("role").equals("subadmin")) {
								%>
								<td align='right'>
									<input type="checkbox" name='ch'
										value="${supply.restarantid }">
								</td>
								<%
									}
								%>
								<%
									if (session.getAttribute("role").equals("subadmin")) {
								%>
								<td align="center">
									<b> <a
										href='./UpdateRestaurantRecord.do?restarantid=${supply.restarantid }'>${supply.restaurantname}
									</a> </b>
								</td>
								<%
									} else {
								%><td align="center">
									<b> ${supply.restaurantname} </b>
								</td>
								<%
									}
								%>
								<td align="center">
									<b> ${supply.certification} </b>

								</td>
								<td align="center">
									<b> ${supply.restauranttype} </b>

								</td>
								<td align="center">
									<b> ${supply.opentime} </b>

								</td>
								<td align="center">
									<b> ${supply.closetime} </b>

								</td>
								<td align="center">
									<b> ${supply.supplypattrn} </b>

								</td>
								<td align="center">
									<b>${supply.contactaddresses} </b>

								</td>
								<td align="center">
									<b> <a href="${supply.menupath}">${supply.restaurantname}</a>
									</b>

								</td>
							</tr>
						</c:forEach>
					</c:if>
					<%
						if (session.getAttribute("role").equals("subadmin")) {
					%>
					<tr>
						<td colspan="7">
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
