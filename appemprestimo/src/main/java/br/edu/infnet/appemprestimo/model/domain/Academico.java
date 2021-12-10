package br.edu.infnet.appemprestimo.model.domain;

import br.edu.infnet.appemprestimo.exceptions.QuantidadeAcademicoAlugadoException;
import br.edu.infnet.appemprestimo.exceptions.QuantidadeAluguelNegativaException;

public class Academico extends Material {
	
	Boolean nacional;
	// lingaguem
	// tipo - artigo, tcc, resumo 

	public Academico() {
		super();
	}
	
	public Academico(Integer id, String titulo, String autor, Boolean nacional) {
		super(id, titulo, autor);
		this.nacional = nacional;
	}

	public Boolean getNacional() {
		return nacional;
	}
	
	public void setAlugado(Integer alugado) throws QuantidadeAcademicoAlugadoException {
		if (alugado != 0 && alugado != 1) {
			throw new QuantidadeAcademicoAlugadoException("Materias acadêmicos não podem ter mais de uma cópia alugadas.");
		}
		this.alugado = alugado;
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