

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml2/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en">
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<head id="ctl00_header">
		<head>

			<script language="JavaScript" src="scripts/gen_validatorv31.js"
				type="text/javascript">
</script>
			<script language="JavaScript" type="text/javascript"
				src="scripts/ts_picker.js">
</script>
			<script language="JavaScript1.1" src="scripts/pass.js">
</script>
			<script type="text/javascript" src="scripts/image.js">
</script>
			<script type="text/javascript" src="scripts/general.js">
</script>
			<script type="text/javascript" src="scripts/adi.js">
</script>
			<script type="text/javascript" src="scripts/form_validation.js">
</script>

			<script language="JavaScript" src="images/javascripts.js">
</script>
			<script language="JavaScript" src="images/pop-closeup.js">
</script>
			<script>

//var x_win = window.self; 

</script>



			<style type="text/css">
.Title {
	font-family: Verdana;
	font-weight: bold;
	font-size: 8pt
}

.Title1 {
	font-family: Verdana;
	font-weight: bold;
	font-size: 8pt
}
</style>
		</head>
		<body>

			<jsp:include page="Header.jsp"></jsp:include>
			<br />
			<center>
			<h3>

				<span class=subHead><br />Recover Password Form </span>
			</h3>
			</center>

			<form action="./RecoverPasswordAction.do" name="password"
				method='post' onsubmit="return validate()">
				<!--<table border="1"><tr><td></td></tr></table>-->
				<input type="hidden" name="port" value="<%=request.getLocalPort()%>" />
				<input type="hidden" name="host"
					value="<%=request.getServerName()%>" />
				<br />

				<table border='0' align="center" width=70%>
					<tr>
						<td align='right'>
							<b>User Name :</b>
						</td>
						<td>
							<input type="text" name="loginname" value="" size="20" />
						</td>
					</tr>

					<tr>
						<td align='right'>
							<b>SecurityQuestion :</b>
						</td>
						<td>
							<select name="forgotpwquestion">
								<option value="" selected="true">
									<font size="3" face="Verdana">--Select One---</font>
								</option>
								<option value="What is your favorite pastime?">
									<font size="3" face="Verdana">What is your favorite
									pastime?</font>
								</option>
								<option value="Who your childhood hero?">
									<font size="3" face="Verdana">Who your childhood hero?</font>
								</option>
								<option value="What is the name of your first school?">
									<font size="3" face="Verdana">What is the name of your
									first school?</font>
								</option>
								<option value="Where did you meet your spouse?">
									<font size="3" face="Verdana">Where did you meet your
									spouse?</font>
								</option>
								<option value="What is your favorite sports team?">
									<font size="3" face="Verdana">What is your favorite
									sports team?</font>
								</option>
								<option value="What is your father middle name?">
									<font size="3" face="Verdana">What is your father middle
									name?</font>
								</option>
								<option value="What was your high school mascot?">
									<font size="3" face="Verdana">What was your high school
									mascot?</font>
								</option>
								<option value="What make was your first car or bike?">
									<font size="3" face="Verdana">What make was your first
									car or bike?</font>
								</option>
								<option value="What is your pet name?">
									<font size="3" face="Verdana">What is your pet name?</font>
								</option>
							</select>
						</td>
					</tr>

					<tr>
						<td align='right'>
							<b>Security Answer :</b>
						</td>
						<td>
							<input type="text" name="forgotpwanswer" value="" size="20" />
						</td>
					</tr>
					<tr>
						<td align='right'>
							<input type="submit" name="Submit" value="submit" />
						</td>
						<td align='left'>
							<input type="reset" name="reset" value="reset" />
						</td>
					</tr>
				</table>
			</form>

			<script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
var frmvalidator = new Validator("password");

frmvalidator.addValidation("loginname", "req", "Please enter your Login Name");
frmvalidator.addValidation("forgotpwquestion", "dontselect=0");
frmvalidator.addValidation("forgotpwanswer", "req", "Please enter your Answer");
</script>

			<br />
			<br />

			<jsp:include page="Footer.jsp"></jsp:include>


		</body>
</html>