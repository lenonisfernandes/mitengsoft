package br.edu.infnet.appemprestimo.model.tests;

import br.edu.infnet.appemprestimo.model.domain.Livro;

public class LivroTest {

	public static void main(String[] args) {
		
		Livro livro = new Livro(1, "Titulo", "Autor", 3, 2, 2020, 10);
		
		System.out.println(livro.toString()+"; "+livro.restante());

	}

}
