<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Register</title>
<style type="text/css">
body {
	background: white;
}

#first {
	margin-left: auto;
	margin-right: auto;
}

#second {
	position: absolute;
	left: 145px;
	width: 50px;
	top: 30px;
	height: 52px;
	background-color: #2CD8CD;
	color: white;
	font-family: HIGH TOWER TEXT;
	font-size: 300%;
	text-align: center;
}

#third {
	position: absolute;
	left: 0px;
	top: 0px;
	width: 100%;
	color: #627A79;
}

h1 {
	position: absolute;
	left: 200px;
	top: 24px;
	font-family: high tower text;
}

#fourth {
	font-size: 10px;
	position: absolute;
	background-color: #E6CDA0;
	left: 200px;
	top: 120px;
	font-size: 25px;
	width: 850px;
	height: 500px;
	border-radius: 8px;
	padding: 40px;
	color: #227019;
	box-shadow: 0px 25px 25px #444;
}

hr {
	width: 1200px;
	position: absolute;
	left: 30px;
	top: 74px;
}

#five {
	position: absolute;
	left: 150px;
	top: 80px;
	font-family: high tower text;
	font-size: 20px;
}

.name {
	position: absolute;
	left: 200px;
	top: 23px;
	width: 300px;
	box-shadow: 0px 0px 5px #777;
	border-radius: 5px;
}

.contact {
	position: absolute;
	left: 200px;
	top: 150px;
	width: 300px;
	box-shadow: 0px 0px 5px #777;
	border-radius: 5px;
}

.add {
	position: absolute;
	left: 200px;
	top: 215px;
	width: 300px;
	box-shadow: 0px 0px 5px #777;
	border-radius: 5px;
}

.email {
	position: absolute;
	left: 200px;
	top: 278px;
	width: 300px;
	box-shadow: 0px 0px 5px #777;
	border-radius: 5px;
}

.sbmt {
	position: absolute;
	right: 90px;
	bottom: 100px;
	padding: 10px;
	color: #227019;
	width: 130px;
	box-shadow: 5px 5px 5px #4E3B19;
	font-family: high tower text;
	font-weight: bold;
}

.sex {
	position: absolute;
	left: 200px;
	width: 200px;
	top: 80px;
}
</style>
</head>
<body>
	<div id="first">
		<div id="second">G</div>
		<div id="third">
			<h1>ET YOURSELF REGISTERED</h1>
			<hr>
		</div>
		<div id="fourth">
			<form method="post" action="register">
				<table id="five">
					<tr>
						<td style="padding: 20px">NAME:<input type="text"
							name="uname" class="name"></td>
					</tr>
					<tr>
						<td style="padding: 20px">SEX:
						<td class="sex"><input type="radio" name="f" value="F">Female<input
							type="radio" name="f" value="M">Male</td>
					</tr>
					<tr>
						<td style="padding: 20px">CONTACT: <input type="text"
							name="ucon" class="contact"></td>
					</tr>
					<tr>
						<td style="padding: 20px">ADDRESS: <input type="text"
							name="uadd" class="add"></td>
					</tr>
					<tr>
						<td style="padding: 20px">EMAIL: <input type="text"
							name="uemail" class="email"></td>
					</tr>
					<tr>
						<td>
				</table>

				<input class="sbmt" type="submit" value="SUBMIT" name="sbmt">
			</form>


		</div>


	</div>
</body>
</html>