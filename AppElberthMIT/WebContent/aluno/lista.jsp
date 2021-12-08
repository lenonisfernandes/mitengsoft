<%@page import="domain.Aluno"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AppMIT</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>
	<%
	List<Aluno> alunos = (List<Aluno>)request.getAttribute("alunos");
	%>
	
<div class="container mt-3">
	<h2>Cadastramento de Alunos</h2>
	<h2>Total de alunos: <%=alunos.size() %></h2><hr>
	
	<form action="aluno" method="get">
		<button type="submit" class="btn btn-primary">Novo</button>
	</form>
	
	<hr>
  
  	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>Nome</th>
	        <th>E-mail</th>
	      </tr>
	    </thead>
	    <tbody>
	    	<% for(Aluno a : alunos) { %>
	      <tr>
	        <td><%=a.getNome() %></td>
	        <td><%=a.getEmail() %></td>
	      </tr>
	      <%} %>
	    </tbody>
	  </table>

</div>


</body>
</html>