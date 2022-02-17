


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>

	</head>

	<body>
		<form action="./deleteStateAction.do" mehtod='post'>

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
						<c:if test="${sessionScope.role eq admin}">
							<td></td>
						</c:if>
						<td>
							<b>State Id</b>
						</td>
						<td>
							<b>State Name</b>
						</td>
					</tr>

					<c:if test="${not empty vStates}">
						<c:forEach var="state" items="${vStates}">
							<tr>
								<c:if test="${sessionScope.role eq admin}">
									<td align='right'>
										<input type="checkbox" name='ch' value="${state.stateid }">
									</td>
								</c:if>
								<td align="center">
									<b> ${state.stateid } </b>
								</td>

								<c:choose>
									<c:when test="${sessionScope.role eq admin}">
										<td align="center">
											<b> <a
												href="./stateViewUpdation.do?stateid=${state.stateid }">${state.statename
													}</a> </b>

										</td>
									</c:when>

									<c:otherwise>
										<td align="center">
											<b> ${state.statename }</b>
										</td>

									</c:otherwise>
								</c:choose>


							</tr>
						</c:forEach>
					</c:if>
					<c:if test="${sessionScope.role eq admin}">
						<tr>
							<td colspan="3">
								<center>
									<input type="submit" value='Delete'>
								</center>
							</td>
						</tr>
					</c:if>
				</table>
			</center>
		</form>
	</body>

	<br />
	<jsp:include page="./Footer.jsp"></jsp:include>

</html>
