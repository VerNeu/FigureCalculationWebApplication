<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="servlets.FigureFormServlet" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Figuren-Ergebnis</title>
		<link rel="stylesheet" href="style.css">
	</head>
	<body>
	<div id="title" class="centerContainer">
        <h1>Formen-Rechner</h1>
        <h2>Ergebnisse</h2>
    </div>
    <div class="centerContainer">
    
    <%if (servlets.FigureFormServlet.shape == "dice") {%>
        <h2>Würfel</h2>
        <p>Grundfläche: ${floorResult} cm²</p>
        <p>Oberfläche: ${surfaceResult} cm²</p>
        <p>Volumen: ${volumeResult} cm³</p>
    <%}
 	else if (FigureFormServlet.shape == "cuboid"){%>
		<h2>Quader</h2>
        <p>Grundfläche: ${floorResult} cm²</p>
        <p>Oberfläche: ${surfaceResult} cm²</p>
        <p>Volumen: ${volumeResult} cm³</p>
    <%}
 	else if (FigureFormServlet.shape == "globe"){%>
		<h2>Kugel</h2>
        <p>Querschnittsfläche: ${floorResult} cm²</p>
        <p>Oberfläche: ${surfaceResult} cm²</p>
        <p>Volumen: ${volumeResult} cm³</p>
	<%}
 	else {%>
		<h2>Vierseitige Pyramide</h2>
        <p>Grundfläche: ${floorResult} cm²</p>
        <p>Oberfläche: ${surfaceResult} cm²</p>
        <p>Volumen: ${volumeResult} cm³</p>
    <%}%>
 	</div>
 	<div id="backButton" class="centerContainer">
        <button onclick="document.location='index.html'">Zurück zur Startseite </button>
    </div>
</body>
</html>