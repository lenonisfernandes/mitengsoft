<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div class="">
		<h2>Cadastramento de Alunos</h2>
		
		
		<table class="table table-striped">
			<thead>
				<tr>
					<th>ID</th>
					<th>Nome</th>
					<th>E-mail</th>
					<th>CPF</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="s" items="${lista}">
					<tr>
						<td>${s.id}</td>
						<td>${s.nome}</td>
						<td>${s.email}</td>
						<td>${s.cpf}</td>
						<td><a href="/solicitante/${s.id}/excluir">excluir</td>
					</tr>
				</c:forEach>
			
			</tbody>
		
		</table>
	
	</div>

</body>
</html>