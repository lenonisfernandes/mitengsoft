package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.Usuario;
import repository.AlunoRepository;
import repository.UsuarioRepository;


public class AcessoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AcessoController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		
		Usuario usuario = UsuarioRepository.validar(email, senha);
		
		System.out.println(email + " - " + senha);
		
		
		if(usuario != null) {
			System.out.println("Usuário autenticado:" + usuario.getNome());
			request.getRequestDispatcher("index.jsp").forward(request, response);
		} else {
			request.setAttribute("mensagem", "Impossível realizar a autenticação: "+email+"!");
			doGet(request, response);
		}
		
	}

}
