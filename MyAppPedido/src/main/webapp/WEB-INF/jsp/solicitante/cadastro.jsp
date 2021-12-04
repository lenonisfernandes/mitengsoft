<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>

<div class="container mt-3">
  <h2>Cadastramento de Solicitantes</h2>
  
  <form action="solicitante/incluir" method="post">
    <div class="mb-3 mt-3">
      <label>Nome:</label>
      <input type="text" class="form-control" value="Lenon" name="nome">
    </div>
    
    <div class="mb-3 mt-3">
      <label>E-mail:</label>
      <input type="email" class="form-control" placeholder="Entre com o seu email" value="lenon@email.com" name="email">
    </div>
    
    <div class="mb-3 mt-3">
      <label>CPF:</label>
      <input type="text" class="form-control" placeholder="Entre com o seu cpf" value="12345678901" name="cpf">
    </div>

    <button type="submit" class="btn btn-primary">Cadastrar</button>
  </form>
</div>


</body>
</html>