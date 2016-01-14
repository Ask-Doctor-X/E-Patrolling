<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
#title1 {
	position: absolute;
	left: 100px;
	top: 10px;
}

#title2 {
	position: absolute;
	left: 340px;
	top: 10px;
}

#background {
	position: absolute;
	left: 0px;
	top: 520px;
	width: 1366px;
	height: 80px;
	background-color: #40E0D0;
	color: white;
}

#cover {
	position: absolute;
	background-color: gray;
	opacity: 0.4;
	transition-property: all;
	transition-duration: .1s;
	transition-timing-function: cubic-bezier(100, 50, 21, 6);
	left: 0px;
	top: 100px;
	width: 1366px;
	height: 500px;
}

#E {
	position: absolute;
	background-color: #48d1cc;
	font-size: 300%;
	color: white;
	font-family: high tower text;
	text-align: center;
	top: 20px;
	left: 45px;
	width: 50px;
	height: 52px;
}

#C {
	position: absolute;
	background-color: #48d1cc;
	font-size: 200%;
	color: white;
	font-family: high tower text;
	text-align: center;
	top: 22px;
	left: 170px;
	width: 40px;
	height: 40px;
}

hr {
	position: absolute;
	top: 54px;
	left: 20px;
}

.p_user {
	position: absolute;
	top: 150px;
	right: 30px;
}

.p_pass {
	position: absolute;
	top: 190px;
	right: 30px;
}

.p_log {
	position: absolute;
	font-family: high tower text;
	background-color: #696969;
	cursor: pointer;
	color: white;
	top: 250px;
	right: 30px;
	width: 100px;
	height: 25px;
	border: 0 none;
	border-radius: 1px;
}

.reg {
	text-align:right;
	position: absolute;
	font-family: high tower text;
	font-size: 120%;
	top: 200px;
	left: 230px;
	color: #f0f0f0;
	padding:3px;
	left:175px;
	width:200px;
	background: #696969;
	text-decoration: none;
	top: 200px;
}

.reg:hover {
	text-decoration: underline;
	
}

.view {
	position: absolute;
	font-family: high tower text;
	font-size: 120%;
	top: 240px;
	left: 250px;
	color: green;
	text-decoration: none;
}

.view:hover {
	text-decoration: underline;
}

.emergency {
	position: absolute;
	font-family: high tower text;
	font-size: 90%;
	top: 45px;
	left: 1150px;
	color: green;
	text-decoration: none;
}

.emergency:hover {
	text-decoration: underline;
}

.fir {
	position: absolute;
	font-family: high tower text;
	font-size: 120%;
	padding:3px;
	text-align:right;
	background: #696969;
	top: 200px;
	width:200px;
	left: 175px;
	color: #f0f0f0;
	text-decoration: none;
}

.fir:hover {
	text-decoration: underline;
}

.review {
	position: absolute;
	font-family: high tower text;
	font-size: 120%;
	top: 250px;
	left: 175px;
	color: #f0f0f0;
	width:200px;
	text-align:right;
	padding:3px;
	background: #696969;
	text-decoration: none;
}

.review:hover {
	text-decoration: underline;
}

h4 {
	position: absolute;
	font-size: 120%;
	top: 8px;
	left: 218px;
}

.Co {
	position: absolute;
	top: 12px;
	left: 160px;
	width: 50px;
	height: 52px;
}

#citizen {
	position: absolute;
	background-color: white;
	box-shadow: 5px 5px 5px #888888;
	top: 120px;
	left: 50px;
	width: 400px;
	height: 380px;
}

#complain {
	position: absolute;
	background-color: white;
	box-shadow: 5px 5px 5px #888888;
	top: 120px;
	left: 485px;
	width: 400px;
	height: 380px;
}

#police {
	position: absolute;
	background-color: white;
	box-shadow: 5px 5px 5px #888888;
	top: 120px;
	right: 50px;
	width: 400px;
	height: 380px;
}
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Online crime reporting system</title>
</head>
<body>
	<div id="E">O</div>
	<div id="title1">
		<h1>
			<font face="high tower text" color="#40e0d0">NLINE CRIME </font>
		</h1>
	</div>
	<div id="title2">
		<h1>
			<font face="high tower text" color=gray>INVESTIGATION SYSTEM </font>
		</h1>
	</div>

	<a href="Emergency.jsp" class="emergency">EMERGENCY CONTACT</a>
	<div id="cover"></div>



	<div id="citizen">
		<div id="C">C</div>
		<h4>
			<font face="high tower text" color=gray>ITIZEN</font>
		</h4>
		<hr width="350" height="1"></hr>
		<div id="link">
			<a href="Register.jsp" class="reg">Register Yourself</a><br>

		</div>

	</div>


	<div id="police">
		<div id="C">P</div>
		<h4>
			<font face="high tower text" color=gray>OLICE</font>
		</h4>
		<hr width="350" height="1"></hr>
		<form method="GET" action="login">

			<input type="text" name="p_uname" placeholder="Username"
				class="p_user"> <input type="password" name="p_pass"
				placeholder="Password" class="p_pass"> <input type="submit"
				name="p_log" value="Sign In" class="p_log">
		</form>
	</div>

	<div id="complain">
		<div id="C">C</div>

		<h4>
			<font face="high tower text" color=gray>OMPLAIN</font>
		</h4>
		<hr width="350" height="1"></hr>
		
		<a href="FIR.jsp" class="fir" onclick="enterID()"> Lodge F.I.R</a> 
		
		<a href="ViewAFirCitizen.jsp"
			class="review">View F.I.R</a>
	</div>

	<div id="background">
		<h2>
			<font face="high tower text"><marquee>There are variety of actions you can take everyday to ensure the safety of yourself and your city!!
					</marquee></font>
		</h2>
	</div>

<script>
function enterID(){
	String s="Subho";
	String id=promt("Enter your Citizen ID:", s);
	if(id!=null){
		document.getElementById("complain").innerHTML="You entered :"+id;
	}
}
</script>
</body>
</html>