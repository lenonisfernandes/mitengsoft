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

	<div class="container mt-3">
	  <h2>Autenticação</h2>
	  <form action="login" method="post">
	    
	    <div class="mb-3 mt-3">
	      <label>Email:</label>
	      <input type="email" class="form-control" placeholder="Entre com o seu email" value="lenon@lenon.com" name="email">
	    </div>
	    
	    <div class="mb-3">
	      <label>Senha:</label>
	      <input type="password" class="form-control" placeholder="Entre com a sua senha" value="lenon@lenon.com" name="senha">
	    </div>
	    
	    <button type="submit" class="btn btn-primary">Acessar</button>
	  </form>
	</div>


</body>
</html>