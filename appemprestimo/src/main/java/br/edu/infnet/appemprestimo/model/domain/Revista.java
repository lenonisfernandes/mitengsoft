package br.edu.infnet.appemprestimo.model.domain;

import br.edu.infnet.appemprestimo.exceptions.QuantidadeAcademicoAlugadoException;
import br.edu.infnet.appemprestimo.exceptions.QuantidadeAluguelNegativaException;

public class Revista extends Material {

	public Revista() {
		super();
	}
	
	public Revista(Integer id, String titulo, String autor) {
		super(id, titulo, autor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Integer restante() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void setAlugado(Integer alugado) throws QuantidadeAluguelNegativaException {
		if (alugado < 0) {
			throw new QuantidadeAluguelNegativaException("Não há quantidades negativas de materiais alugados.");
		}
		this.alugado = alugado;
	}


}
