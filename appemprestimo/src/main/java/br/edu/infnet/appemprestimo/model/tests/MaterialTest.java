package br.edu.infnet.appemprestimo.model.tests;

import br.edu.infnet.appemprestimo.model.domain.*;

public class MaterialTest {
	
	public static void main(String[] args) {
		
		Academico academico = new Academico(1, "Titulo", "autor", true);
		Livro livro = new Livro(2,"Titulo", "autor", 10, 2, 2020);
		Revista revista = new Revista(3,"Titulo", "autor");
		
		System.out.println(academico.toString()+"; "+academico.restante());
		System.out.println(livro.toString());
		System.out.println(revista.toString());
	}

}
