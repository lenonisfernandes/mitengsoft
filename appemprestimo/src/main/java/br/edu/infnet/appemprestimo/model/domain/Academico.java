package br.edu.infnet.appemprestimo.model.domain;

public class Academico extends Material {
	
	Boolean nacional;
	// lingaguem
	// tipo - artigo, tcc, resumo 

	public Academico() {
		super();
	}
	
	public Academico(Integer id, String titulo, String autor, Integer alugado, Boolean nacional) {
		super(id, titulo, autor, alugado);
		this.nacional = nacional;
	}

	public Boolean getNacional() {
		return nacional;
	}

	public void setNacional(Boolean nacional) {
		this.nacional = nacional;
	}

	//TODO No método abstrato, crie uma regra de negócio que utilize atributos 
	//da filha e da mãe.
	@Override
	public Integer restante() {
		return 1 - this.getAlugado();
	}
	
	public String toString() {
		StringBuilder texto = new StringBuilder();
		
		texto.append(super.toString());
		texto.append("; ");
		texto.append(this.nacional);
		
		return texto.toString();
	}

}