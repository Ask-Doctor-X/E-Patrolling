<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,com.crime.beans.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
	<STYLE>
#rear {
	position: absolute;
	top: 0px;
	left: 0px;
	background-color: gray;
	width: 1366px;
	height: 768px;
}


.cover {
	position: absolute;
	top:0px;
	left: 230px;
	width: 900px;
	height: 100px;
	box-shadow: 0 0 15px #888888;
}

#A {
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

#table {
	position: absolute;
	top: 100px;
	left: 230px;
	width: 900px;
	height: 1000px;
	box-shadow: 0 0 15px #888888;
}

#tableInfo {
	position: absolute;
	left: 130px;
	width: 650px;
	top: 100px;
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
</STYLE>
</head>
<body>

	<div class="cover">
		<h1>ENDING F.I.R. DATABASE</h1>
		<hr width="800" height="1"></hr>
	</div>
	<div id="A">P</div>

<%
Object obj1=request.getAttribute("pc");
ArrayList<Complain> pclist = null;
if(obj1 != null){
pclist = (ArrayList<Complain>)obj1;
}
%>
<br><br><br><br><br><br><br><br>
		<div id="table">

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
			<%for(Complain c:pclist){ %>
			
			<tr>
			<td><%=c.getC_id()%></td>
			<td><%=c.getC_type()%></td>
			<td><%=c.getC_date() %></td>
			<td><%=c.getC_time() %></td>
			<td><%=c.getC_location() %></td>
			<td><%=c.getC_desc() %></td>
			<td><%=c.getC_status() %></td>
			<td><%=c.getCt_id()%></td>
			</tr>
			
		<%} %>
		</table>
		</div>


</body>
</html>