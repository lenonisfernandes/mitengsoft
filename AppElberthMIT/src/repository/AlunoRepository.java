package repository;

import java.util.ArrayList;
import java.util.List;

import domain.Aluno;

public class AlunoRepository {
	
	private static List<Aluno> alunos = new ArrayList<Aluno>();
	
	public static void incluir(Aluno aluno) {
		alunos.add(aluno);
	}
	
	public static List<Aluno> obterLista() {
		return alunos;
	}

}
