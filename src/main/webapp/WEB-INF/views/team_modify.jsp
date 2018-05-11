<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Project Manager</title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
<link rel="stylesheet"
	href="<spring:url value="/resources/css/home.css"/>" type="text/css" />
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
<script type="text/javascript"
	src="https://code.jquery.com/jquery-1.11.3.min.js"></script>

</head>
<body>

	<jsp:include page="../views/fragments/header.jsp"></jsp:include>

	<div class="container">
		<div class="row">
			<form class="col-md-8 col-md-offset-2" accept-charset="utf-8"  method="post">
				<div class="form-group">
					<label for="name_row">Név</label> <input type="text"
						id="name_row" class="form-control" name="name" />
				</div>

				<div class="form-group">
					<label for="leader_row">Csapatkapitány</label> <input type="text"
						id="leader_row" class="form-control" name="leader" />
				</div>
				<button type="submit" class="btn btn-default">Létrehozás</button>
			</form>

		</div>
	</div>
</body>
</html>