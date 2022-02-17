<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml2/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<title>stu nicholls dot com | menu - Professional dropdown #3</title>
		<meta name="Author" content="Stu Nicholls" />
		<link rel="stylesheet" type="text/css" href="menu/pro_dropdown_3.css" />
		<script src="menu/stuHover.js" type="text/javascript">
</script>
	</head>
	<body bgcolor='skyblue'>
		<ul id="nav">

			<li class="top">
				<a href="/AddAreas.jsp" id="products" class="top_link"><span
					class="down">Regional</span> </a>
				<ul class="sub">
					<li>
						<a href="#nogo3" class="fly">States</a>
						<ul>
							<li>
								<a href="./viewRegStateAction.do" class="parent"><span>ViewStates</span>
								</a>
							</li>
						</ul>
					</li>
					<li class="mid">
						<a href="#nogo7" class="fly">Districts</a>
						<ul>
							<li>
								<a href="./viewStateDistrictAction.do" class="parent"><span>ViewDistrict</span>
								</a>
							</li>

						</ul>
					</li>

					<li class="mid">
						<a href="#nogo7" class="fly">Cities</a>
						<ul>

							<li>
								<a href="./ViewCityViewStateAction.do" class="parent"><span>ViewCity</span>
								</a>
							</li>

						</ul>
					</li>
				</ul>
			</li>
			<li class="top">
				<a href="#nogo22" id="services" class="top_link"><span
					class="down">Studies</span> </a>
				<ul class="sub">
					<li>
						<a href="./ViewEduInfoAction.do" class="parent"><span>ViewCareerInformation</span>
						</a>
					</li>
				</ul>
			</li>




			<li class="top">
				<a href="/AddAreas.jsp" id="products" class="top_link"><span
					class="down">FoodSafety</span> </a>
				<ul class="sub">
					<li>
						<a href="#nogo3" class="fly">Restaurents</a>
						<ul>
							
							<li>
								<a href="./ViewCityRestaurantAction.do" class="parent"><span>ViewCityRestaurents</span>
								</a>
							</li>


						</ul>
					</li>
					<li class="mid">
						<a href="#nogo7" class="fly">LocalDiet</a>
						<ul>
							
							<li>
								<a href="./ViewAdminFoodInfoAction.do?food=Diet"
									class="parent"><span>ViewLocalDiet</span> </a>
							</li>

						</ul>
					</li>

					<li class="mid">
						<a href="#nogo7" class="fly">FoodHandlingGuide</a>
						<ul>
							
							<li>
								<a
									href="./ViewAdminFoodInfoAction.do?food=Guide"
									class="parent"><span>ViewFoodHandlingGuide</span> </a>
							</li>

						</ul>
					</li>
					<li class="mid">
						<a href="#nogo7" class="fly">vitaminReports</a>
						<ul>
							
							<li>
								<a href="./ViewAdminFoodInfoAction.do?food=Reports"
									class="parent"><span>ViewVitaminAnalysisReports</span> </a>
							</li>

						</ul>
					</li>
					<li class="mid">
						<a href="#nogo7" class="fly">FoodsafetyConcern</a>
						<ul>
						
							<li>
								<a href="./ViewAdminFoodInfoAction.do?food=SafetyInstructions"
									class="parent"><span>ViewFoodsafetyInstructions</span> </a>
							</li>

						</ul>
					</li>
					<li class="mid">
						<a href="#nogo7" class="fly">FoodQuality</a>
						<ul>
							
							<li>
								<a href="./ViewAdminFoodInfoAction.do?food=Quality"
									class="parent"><span>ViewFoodQuality</span> </a>
							</li>

						</ul>
					</li>
				</ul>
			</li>
			<li class="top">
				<a href="/AddAreas.jsp" id="products" class="top_link"><span
					class="down">Complaints & Enquiry</span> </a>
				<ul class="sub">
					<li>
						<a href="#nogo3" class="fly">Enquiry</a>
						<ul>
							<li>
								<a href="./AddEnquiryDetails.jsp" class="parent"><span>PostEnquiry</span>
								</a>
							</li>
							<li>
								<a href="./ViewEmquiryInfoAction.do?user=Active" class="parent"><span>ViewWnquiryQuestions</span>
								</a>
							</li>


						</ul>
					</li>
					<li class="mid">
						<a href="#nogo7" class="fly">Tips</a>
						<ul>
							<li>
								<a href="./TipsSuggesstions.jsp" class="parent"><span>PostTips</span>
								</a>
							</li>
							<li>
								<a
									href="./ViewTipsSuggesitionAction.do?cityidref=${sessionScope.cityid}"
									class="parent"><span>ViewTips</span> </a>
							</li>

						</ul>
					</li>

					<li class="mid">
						<a href="#nogo7" class="fly">Complaints</a>
						<ul>
							<li>
								<a href="./FeedBack.jsp" class="parent"><span>PostFeedBack</span>
								</a>
							</li>
							<li>
								<a
									href="./ViewComplaintsAction.do?cityidref=${sessionScope.cityid}"
									class="parent"><span>ViewComplaints</span> </a>
							</li>

						</ul>
					</li>
					<li class="mid">
						<a href="#nogo7" class="fly">FeedBack</a>
						<ul>
							<li>
								<a href="./CityComplaint.jsp" class="parent"><span>PostComplaints</span>
								</a>
							</li>
							<li>
								<a
									href="./ViewFeedBackAction.do?cityidref=${sessionScope.cityid}"
									class="parent"><span>ViewFeedback</span> </a>
							</li>

						</ul>
					</li>
				</ul>
			</li>


			<li class="top">
				<a href="#nogo22" id="services" class="top_link"><span
					class="down">Profile</span> </a>
				<ul class="sub">
					<li>
						<a href="./ViewProfileAction.do" class="parent"><span>ViewProfile</span>
						</a>
					</li>
				</ul>
			</li>
			<li class="top">
				<a href="#nogo22" id="services" class="top_link"><span
					class="down">security</span> </a>
				<ul class="sub">
					<li>
						<a href="./ChangePassword.jsp" class="parent"><span>ChangePassword</span>
						</a>

					</li>

				</ul>
			</li>
			<li class="top">
				<a href="./LogoutAction.do" class="top_link"><span>Logout</span>
				</a>
			</li>
		</ul>
	</body>
</html>
