<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
<li class="list-group-item"><label>Név: &nbsp</label><span>${currentTournament.name}</span></li>
<li class="list-group-item"><label>Dátum: &nbsp</label><span>${currentTournament.date}</span></li>
<li class="list-group-item"><label>Leírás: &nbsp</label><span>${currentTournament.description}</span></li>
</ul>
</div>
	</div>
	<div class="container">

		<h2>Regisztrált csapatok</h2>
				<button type="button" class="btn" style="background:#129c30;color:white" onclick="window.location.href='<spring:url value="/tournament/${currentTournament.tournamentId}/addTeam"/>'">Új csapat felvétele</button>
		<button type="button" class="btn" style="background:#5774C5;color:white">Meccsek megtekintése</button>
		<table id="example" class="table table-striped table-bordered" style="width:100%; margin-top:10px;">
			<thead>
			<tr>
					<th>Név</th><th>Csapatkapitány</th><th>Műveletek</th>
				</tr>
			</thead>

			<tbody>
				
				<c:forEach items="${teams}" var="team">
					<tr>
					    
						<td>${team.name}</td>
						<td>${team.leader}</td>
						<td>
						<button onclick="window.location.href='<spring:url value="/tournament/delete/TODO:URL"/>'" type="button" class="btn" style="background:#dd2c00; color:white;">Törlés</button>
					
						<button type="button" class="btn" style="background:#ff6600; color:white;">Módosítás</button></td>
					</tr>	
				</c:forEach>
			</tbody>
		</table>
		
	</div>
	<script type="text/javascript">
	$(document).ready(function() {
	    $('#example').DataTable( {
	        "language": {
	            "url": "//cdn.datatables.net/plug-ins/9dcbecd42ad/i18n/Hungarian.json"
	        }
	    } );
	} );</script>
</body>
</html>