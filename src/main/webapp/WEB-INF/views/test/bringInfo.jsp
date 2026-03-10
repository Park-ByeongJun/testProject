<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://code.jquery.com/jquery-3.7.1.min.js"></script>
<title>bring data</title>
<style>
 table{
 	border: 1px solid black;
 }
  tr td{
  	border: 1px solid black;
  }
</style>
</head>
<body>

<table>
	<tr>
		<th>id</th>
		<th>name</th>
		<th>number</th>
	</tr>
	<tbody id="informTable">
		
	</tbody>
</table>


<script src="${pageContext.request.contextPath}/static/js/bringData.js"></script>
</body>
</html>