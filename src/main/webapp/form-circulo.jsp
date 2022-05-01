<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Circulo</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
	<%@ include file="/WEB-INF/jsp/includes/header.jsp" %>
	<div class="container">
		<h1>Circulo</h1>
		<form method="GET" action="calculo-circulo">
		<div class="mb3">
			<select class="form-select" name="operacion">
			  <option selected>Seleccione una opción</option>
			  <option value="area">Calcular Area</option>
			  <option value="perimetro">Calcular perimetro</option>
			</select>
		</div>
			<div class="mb-3">
		  		<label for="diametro" class="form-label">Diametro</label>
		  		<input type="text" class="form-control" id="diametro" name="diametro">
			</div>
			<button class="btn btn-warning" type="submit">Calcular</button>
		</form>
	</div>	
</body>
</html>