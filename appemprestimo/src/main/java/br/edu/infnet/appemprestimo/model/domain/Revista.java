package br.edu.infnet.appemprestimo.model.domain;

public class Revista extends Material {

	public Revista() {
		super();
	}
	
	public Revista(Integer id, String titulo, String autor, Integer qntd) {
		super(id, titulo, autor, qntd);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Integer restante() {
		// TODO Auto-generated method stub
		return null;
	}

}
