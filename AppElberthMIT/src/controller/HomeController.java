package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import repository.AlunoRepository;

public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public HomeController() {

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setAttribute("alunos", AlunoRepository.obterLista());
		request.getRequestDispatcher("aluno/lista.jsp").forward(request, response);

	}

}
