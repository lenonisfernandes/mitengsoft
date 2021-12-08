package test;

import domain.Aluno;
import repository.AlunoRepository;

public class AlunoTest {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Lenon", "lenon@lenon.com");
		Aluno a2 = new Aluno("Ignes", "ignes@ignes.com");
		Aluno a3 = new Aluno("Bruna", "bruna@bruna.com");
		
		AlunoRepository.incluir(a1);
		AlunoRepository.incluir(a2);
		AlunoRepository.incluir(a3);
		
		for(Aluno a : AlunoRepository.obterLista()) {
			System.out.println(a.toString(true));
		}
		
		

	}

}
