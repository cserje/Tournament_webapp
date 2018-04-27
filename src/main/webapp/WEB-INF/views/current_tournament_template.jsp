<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Torna nyilvántartó</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
	<link rel="stylesheet" href="<spring:url value="/resources/css/home.css"/>" type="text/css"/>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>

</head>
<body>
	
	<jsp:include page="../views/fragments/header.jsp"></jsp:include>			

	<div class="container">
<div class="container">
<h2>Tornák</h2>
<ul class="container">
<li class="list-group-item"><label>Név:</label><br><span>${currentTournament.name}</span></li>
<li class="list-group-item"><label>Dátum:</label><br><span>${currentTournament.date}</span></li>
<li class="list-group-item"><label>Leírás:</label><br><span>${currentTournament.description}</span></li>
</ul>
</div>
	</div>
</body>
</html>