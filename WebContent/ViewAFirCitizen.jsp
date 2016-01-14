<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,com.crime.beans.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Single FIR</title>

<STYLE>
#searchTab {
	position: absolute;
	background-color: black;
	top: 100px;
	left: 0px;
	width: 900px;
	height: 40px;
	box-shadow: 0 5px 5px #898989;
	top: 100px;
}

.c_id {
	position: absolute;
	left: 600px;
	top: 10px;
}

.sbmt {
	position: absolute;
	left: 800px;
	top: 10px;
	width: 80px;
	border-radius: 5px;
}

#rear {
	position: absolute;
	top: 0px;
	left: 0px;
	background-color: gray;
	width: 1366px;
	height: 768px;
}

#cover {
	position: absolute;
	background-color: white;
	top: 0px;
	left: 230px;
	width: 900px;
	height: 100px;
	box-shadow: 0 10px 15px #888888;
}

#I {
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

hr {
	position: absolute;
	left: 20px;
	top: 63px;
}

.hr {
	position: absolute;
	left: 20px;
	top: 400px;
}

h3 {
	position: absolute;
	font-size: 100%;
	color: gray;
	top: 372px;
	left: 80px;
	font-family: high tower text;
}

#C {
	position: absolute;
	background-color: #48d1cc;
	font-size: 180%;
	color: white;
	font-family: high tower text;
	text-align: center;
	top: 376px;
	left: 45px;
	width: 30px;
	height: 32px;
}

#table {
	position: absolute;
	top: 100px;
	left: 230px;
	width: 900px;
	height: 600px;
	box-shadow: 0 0 15px #888888;
}

#tableInfo {
	position: absolute;
	left: 130px;
	width: 650px;
	top: 200px;
}

table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
}

table#tableInfo th {
	background-color: #696969;
	color: white;
	border: 1px solid black;
	border-collapse: collapse;
	font-family: high tower text;
}

table#tableInfo tr:nth-child(even) {
	background-color: #fff;
}

table#tableInfo tr:nth-child(odd) {
	background-color: #eee;
}

h1 {
	position: absolute;
	top: 14px;
	color: gray;
	left: 170px;
	font-family: high tower text;
}

#status {
	position: absolute;
	font-size: 120%;
	color: gray;
	top: 362px;
	left: 80px;
	font-family: high tower text;
}

.update {
	position: absolute;
	font-size: 120%;
	color: white;
	background-color: darkgray;
	top: 362px;
	left: 380px;
	border-radius: 5px;
	width: 150px;
	font-family: high tower text;
}
</STYLE>
</head>
<body>
	<div id="cover">
		<h1>EVIEW YOUR F.I.R</h1>
		<hr width="800" height="1"></hr>
	</div>
	<div id="I">R</div>
<%
 Object obj1  = request.getAttribute("c");
Complain c = null;
String c_id="";
if(obj1 != null){
c = (Complain)obj1;
	c_id= c.getC_id();
} 


%>	
	<div id="table">
		<div id="searchTab">
			<form method="get" action="viewafircitizen">
			<input type="text" name="c_id" placeholder="F.I.R ID" class="c_id">
			<input type="submit" name="sub" value="search" class="sbmt">
			</form>
			
		</div>
	
		

		<table id="tableInfo">
			<tr>
				<th>FIR ID</th>
				<th>Type</th>
				<th>Date</th>
				<th>Time</th>
				<th>Location</th>
				<th>Description</th>
				<th>Status</th>
				<th>Citizen ID</th>
			</tr>

			<tr>
			<%if(c!=null){ %>
			<td><%=c.getC_id()%></td>
			<td><%=c.getC_type()%></td>
			<td><%=c.getC_date() %></td>
			<td><%=c.getC_time() %></td>
			<td><%=c.getC_location() %></td>
			<td><%=c.getC_desc() %></td>
			<td><%=c.getC_status() %></td>
			<td><%=c.getCt_id()%></td>
			<%} %>
			</tr>

		</table>

	</div>
</body>
</html>