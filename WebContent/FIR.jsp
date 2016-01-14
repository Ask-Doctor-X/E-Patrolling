<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lodge your FIR</title>
<style>
#L {
	position: absolute;
	background-color: #48d1cc;
	font-size: 300%;
	color: white;
	font-family: high tower text;
	text-align: center;
	top: 20px;
	left: 345px;
	width: 50px;
	height: 52px;
}

#title {
	position: absolute;
	font-family: high tower text;
	background-color: white;
	color: gray;
	top: 0px;
	left: 0px;
	width: 1366px;
	height: 100px;
}

h1 {
	position: absolute;
	top: 14px;
	left: 400px;
}

hr {
	position: absolute;
	top: 64px;
	left: 100px;
}

#form {
	position: absolute;
	background-color: white;
	top: 110px;
	left: 280px;
	width: 800px;
	height: 900px;
	border-radius: 5px;
	box-shadow: 0 10px 10px #777;
}

.fields {
	position: absolute;
	top: 100px;
	left: 100px;
	font-family: high tower text;
}

.sbmt {
	position: absolute;
	top: 700px;
	left: 400px;
	width: 150px;
	height: 30px;
	border: none;
	background-color: #48d1cc;
	font-family: high tower text;
	cursor: pointer;
}
</style>
</head>
<body>
	<div id="title">
		<div id="L">L</div>

		<h1>ODGE YOUR F.I.R</h1>
		<hr width="1100" height="1"></hr>
	</div>

	<div id="form">

		<form method="post" action="FIR" class="fields">
			<label>Enter your citizen ID:</label><br> <br> <input
				type="text" name="ct_id"
				style="width: 400px; height: 20px; border-radius: 5px;"><br>
			<br> <label>Enter Crime Date :</label><br> <br> <input
				type="text" name="c_date"
				style="width: 400px; height: 20px; border-radius: 5px;"><br>
			<br> <label>Enter Crime time:</label><br> <br> <input
				type="text" name="c_time"
				style="width: 400px; height: 20px; border-radius: 5px;"><br>
			<br> <label>Enter Crime Location:</label><br> <br> <input
				type="text" name="c_loc"
				style="width: 400px; height: 20px; border-radius: 5px;"><br>
			<br> <label>Enter Crime Type:</label><br> <br> <select
				style="width: 150px;" name=c_type>
				<option value="kidnap">Kidnapping</option>
				<option value="theft">Theft</option>
				<option value="missing">Missing</option>
				<option value="homicide">Homicide</option>
				<option value="rape">Rape</option>
				<option value="suicide">Suicide</option>
				<option value="narcotics">Narcotics</option>
				<option value="others">Others</option>
			</select> <br> <br> <label>Enter Crime Description:</label><br>
			<br>

			<textarea rows="10" col="50" name="c_desc"
				style="width: 400px; height: 100px; border-radius: 5px;"></textarea>
			<br> <br> <input type="submit" name="sbmt" value="SUBMIT"
				class="sbmt"><br> <br>
		</form>

	</div>

	<script>
		function giveID() {
			var x = 50;
			alert("Done! Your FIR ID is: " + x);

		}
	</script>
</body>
</html>