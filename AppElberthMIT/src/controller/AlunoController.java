package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.Aluno;
import repository.AlunoRepository;

public class AlunoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public AlunoController() {

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("aluno/cadastro.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Aluno aluno = new Aluno(request.getParameter("nome"), request.getParameter("email"));
		aluno.setIdade(Integer.valueOf(request.getParameter("idade")));
		aluno.setMensalidade(Float.valueOf(request.getParameter("mensalidade")));
		aluno.setCurso(request.getParameter("curso"));
		aluno.setDisciplinas(request.getParameterValues("disciplinas"));
		aluno.setRegiao(request.getParameter("regiao"));
		
		AlunoRepository.incluir(aluno);
		
		request.setAttribute("nome", aluno.getNome());
		request.setAttribute("alunos", AlunoRepository.obterLista());
		request.getRequestDispatcher("confirmacao.jsp").forward(request, response);
		

	}

}
