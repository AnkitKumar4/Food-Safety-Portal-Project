

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//w3c//dtd html 4.0 transitional//en">
<html>
	<head>
		<script language="JavaScript"
			src="<%=request.getContextPath() + "/js/gen_validatorv31.js"%>"
			type="text/javascript">
</script>

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
		<body>
			<jsp:include page="Header.jsp"></jsp:include>
			<center>
				<h3>
					Restaurant Entry Form
				</h3>
			</center>
			<form action="./AddRestaurantDetailsAction.do" method="post"
				name="restaurant">
				<!--<table border="1"><tr><td></td></tr></table>-->
				<table border="0" align="center">
					<tr>
						<td align='right'>
							Name of the Restaurant :
						</td>
						<td>
							<input type="text" name="restaurantname" value="" />

						</td>
					</tr>
					<tr>
						<td align='right'>
							Market Certification :
						</td>
						<td>
							<select name="certification">
								<option value="select" selected="true">
									<font size="3" face="Verdana">--Select--</font>
								</option>
								<option value="*">
									<font size="3" face="Verdana">*</font>
								</option>
								<option value="**">
									<font size="3" face="Verdana">**</font>
								</option>
								<option value="***">
									<font size="3" face="Verdana">***</font>
								</option>
								<option value="****">
									<font size="3" face="Verdana">****</font>
								</option>
								<option value="*****">
									<font size="3" face="Verdana">*****</font>
								</option>
								<option value="******">
									<font size="3" face="Verdana">******</font>
								</option>

							</select>
						</td>
					</tr>
					<tr>
						<td align='right'>
							Restaurant Type :
						</td>
						<td>
							<select name="restauranttype">
								<option value="select" selected="true">
									<font size="3" face="Verdana">--Select--</font>
								</option>
								<option value="Only Veg">
									<font size="3" face="Verdana">Only Veg</font>
								</option>
								<option value="Chiniese">
									<font size="3" face="Verdana">Chiniese</font>
								</option>
								<option value="Veg-Nonveg">
									<font size="3" face="Verdana">Veg-Nonveg</font>
								</option>
								<option value="All">
									<font size="3" face="Verdana">All</font>
								</option>

							</select>
						</td>
					</tr>
					<tr>
						<td align='right'>
							Open Time :

						</td>
						<td>
							<input type="text" name="opentime" value="" size="20" />
							(12:00AM/PM)
						</td>
					</tr>

					<tr>
						<td align='right'>

							close Time :

						</td>
						<td>
							<input type="text" name="closetime" value="" size="20" />
							(12:00AM/PM)
						</td>
					</tr>
					<tr>
						<td align='right'>
							Delivery Supply :

						</td>
						<td>
							<select name="supplypattrn">
								<option value="-select-" selected="true">
									<font size="3" face="Verdana">--Select--</font>
								</option>
								<option value="DoorDelevary">
									<font size="3" face="Verdana">DoorDelevary</font>
								</option>
								<option value="SelfService">
									<font size="3" face="Verdana">SelfService</font>
								</option>
								<option value="OnlyParcels">
									<font size="3" face="Verdana">OnlyParcels</font>
								</option>
								<option value="OnlyEvining">
									<font size="3" face="Verdana">OnlyEvining</font>
								</option>
								<option value="AnyTime">
									<font size="3" face="Verdana">AnyTime</font>
								</option>
						</td>
					</tr>
					<tr>
						<td align='right'>
							restaurant Menu :

						</td>
						<td>
							<input type="file" name="menupath" value="" size="20" />
						</td>
					</tr>
					<tr>
						<td align='right'>
							Contact Address :
						</td>
						<td>
							<input type="text" name="contactaddresses" value="" size="20" />
							<input type='hidden' name='cityidref'
								value='${sessionScope.cityid}' />
						</td>
					</tr>
					<tr>
						<td></td>
						<td align="center">
							<font size="3" face="Verdana"> <input type="submit"
									name="register" value="Submit" />&nbsp; <input type="reset"
									name="cancel" value="Cancel" /> </font>
						</td>
						<td align="center"></td>
					</tr>
				</table>
			</form>

			<script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
var frmvalidator = new Validator("restaurant");
frmvalidator.addValidation("restaurantname", "req", "Please enter Restaurent Name");
frmvalidator.addValidation("certification", "dontselect=0");
frmvalidator.addValidation("restauranttype", "dontselect=0");
frmvalidator.addValidation("opentime", "req", "Please enter From Time");
frmvalidator.addValidation("closetime", "req", "Please enter To time");
frmvalidator.addValidation("supplypattrn", "req", "Please enter To time");
frmvalidator.addValidation("menu", "req", "Please enter To time");
frmvalidator.addValidation("contactaddresses", "req", "Please enter To time");
</script>
			<jsp:include page="Footer.jsp"></jsp:include>
		</body>
</html>
