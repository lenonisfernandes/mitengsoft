package br.edu.infnet.appemprestimo.model.domain;

import br.edu.infnet.appemprestimo.exceptions.QuantidadeAcademicoAlugadoException;
import br.edu.infnet.appemprestimo.exceptions.QuantidadeAluguelNegativaException;

abstract class Material {
	
	private Integer id;
	private String titulo;
	private String autor;
	protected Integer alugado;
	
	public Material() {
		
	}
	
	public Material (Integer id, String titulo, String autor) {
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
	}

	public Integer getId() {
		return id;
	}
	

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public Integer getAlugado() {
		return alugado;
	}
	
	public abstract Integer restante();
	
	public String toString() {
		StringBuilder texto = new StringBuilder();
		
		texto.append(this.id);
		texto.append("; ");
		texto.append(this.titulo);
		texto.append("; ");
		texto.append(this.autor);
		texto.append("; ");
		texto.append(this.alugado);
		
		return texto.toString();
	}

}
