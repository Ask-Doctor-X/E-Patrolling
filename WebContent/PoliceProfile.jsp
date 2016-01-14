<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Police Profile</title>

<style>
#title {
	position: absolute;
	background-color: white;
	top: 0px;
	left: 0px;
	width: 100%;
	height: 120px;
}

#P {
	position: absolute;
	background-color: #48d1cc;
	font-size: 300%;
	color: white;
	font-family: high tower text;
	text-align: center;
	top: 30px;
	left: 145px;
	width: 50px;
	height: 52px;
}

h1 {
	position: absolute;
	top: 24px;
	color: gray;
	left: 200px;
	font-family: high tower text;
}

hr {
	position: absolute;
	left: 20px;
	top: 74px;
}

.box {
	POSITION: ABSOLUTE;
	top: 120px;
	left: 5%;
	width: 25%;
	height: 400px;
	background: #FFF;
	top: width: 30%;
}

.effect {
	position: relative;
}

.effect:before, .effect:after {
	z-index: -1;
	position: absolute;
	content: "";
	bottom: 15px;
	left: 10px;
	width: 50%;
	top: 80%;
	max-width: 300px;
	background: #777;
	box-shadow: 0 15px 10px #777;
	transform: rotate(-3deg);
}

.effect:after {
	transform: rotate(3deg);
	right: 10px;
	left: auto;
}

form {
	position: absolute;
	left: 30px;
	top: 80px;
}

#welcome {
	position: absolute;
	top: 140px;
	left: 410px;
	text-align: center;
	width: 150px;
	height: 30px;
	box-shadow: 5px 5px 10px #777;
	background: #e8e48a;
	border-radius: 5px;
}

* {
	-webkit-transition-property: all;
	-webkit-transition-duration: .2s;
	-moz-transition-timing-function: cubic-bezier(100, 50, 21, 6);
	-moz-transition-property: all;
	-moz-transition-duration: .2s;
	-moz-transition-timing-function: cubic-bezier(100, 50, 21, 6);
}

.btn {
	position: absolute;
	top: 300px; left : 30px; color : #f0f0f0; background : rgba( 0, 0, 0,
	0.5); padding : 10px 20px; font-size : 12px;
	text-decoration: none;
	letter-spacing: 2px;
	text-transform: uppercase;
	left: 30px;
}

.btn:hover {
	border: 10px;
	background: rgba(0, 0, 0, 0.4);
	background: #fff;
	padding: 40px 40px;
	color: #1b1b1b;
}
</style>
</head>

<body bgcolor="#c0c0c0">
	<div id="title">
		<h1>OLICE PROFILE</h1>
		<hr width="1200" height="1"></hr>
	</div>

	<div id="P">P</div>

	<div id="welcome">WELCOME</div>
	<div class="box effect">
		<form>
			<label>POLICE ID: &nbsp &nbsp &nbsp &nbsp &nbsp Am1258</label><br>
			<br> <br> <label>NAME: &nbsp &nbsp &nbsp &nbsp
				&nbsp &nbsp &nbsp &nbsp &nbsp Amar Sinha</label><br> <br> <br>
			<label>LOCATION: &nbsp &nbsp &nbsp &nbsp &nbsp Park Street</label><br>
			<br> <br> <label>USERNAME: &nbsp &nbsp &nbsp &nbsp
				AmSinha19</label><br> <br> <br>

		</form>

	</div>

	<a href="PoliceProfile" class="btn"
		style="left: 1000px; top:250px;height: 80px; width: 200px;">VIEW ALL
		COMPLAINTS</a>
	<a href="ViewAFir.jsp" class="btn"
		style="left: 750px; top:250px;height: 80px; width: 200px;">VIEW A COMPLAINT</a>
		
	<a href="viewpendingcomplaints" class="btn"
		style="left: 500px;top:250px; height: 80px; width: 200px;">VIEW PENDING
		COMPLAINTS</a>
		
	<a href="complaintsbytype.jsp" class="btn"
		style="left: 1000px; top:380px; height: 80px; width: 200px;">VIEW COMPLAINTS BY TYPE</a>
	<a href="complaintpercitizen.jsp" class="btn"
		style="left: 750px; top:380px; height: 80px; width: 200px;">VIEW COMPLAINT PER CITIZEN</a>
	<a href="viewcitizendetails.jsp" class="btn"
		style="left: 500px; top:380px; height: 80px; width: 200px;">VIEW CITIZEN DETATILS</a>
</body>
</html>