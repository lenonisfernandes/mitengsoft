<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AppMIT</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>

<div class="container mt-3">
	<h2>Cadastramento de Solicitantes</h2>
	
	<form action="/solicitante" method="get">
		<button type="submit" class="btn btn-primary">Novo</button>
	</form>
	
	<hr>
	
	<c:if test="${not empty lista}">
	<h2>Total de alunos: ${lista.size()}</h2><hr>
	
  	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>Nome</th>
	        <th>E-mail</th>
	        <th>CPF</th>
	      </tr>
	    </thead>
	    <tbody>
	    	<c:forEach var="s" items="${lista}"> 
		      <tr>
		        <td>${s.nome}</td>
		        <td>${s.email}</td>
		        <td>${s.cpf}</td>
		      </tr>
	      </c:forEach>
	    </tbody>
	  </table>
	  
	  </c:if>
	  <c:if test="${empty lista }">
	  	<h2>Não existem solicitantes cadastrados!!!</h2>
	  </c:if>

</div>


</body>
</html>