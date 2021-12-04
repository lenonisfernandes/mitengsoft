package br.edu.infnet.appemprestimo.model.domain;

public class Livro extends Material {

	Integer edicao;
	Integer ano;
	Integer qnt;
	
	public Livro() {
		super();
	}
	
	public Livro(Integer id, String titulo, String autor, Integer alugado, 
			Integer edicao, Integer ano, Integer qnt) {
		super(id, titulo, autor, alugado);
		this.edicao = edicao;
		this.ano = ano;
		this.qnt = qnt;
	}

	public Integer getEdicao() {
		return edicao;
	}

	public Integer getAno() {
		return ano;
	}

	public Integer getQnt() {
		return qnt;
	}
	
	public void setQnt(Integer qnt) {
		this.qnt = qnt;
	}
	
	public void setEdicao(Integer edicao) {
		this.edicao = edicao;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	@Override
	public Integer restante() {
		return this.qnt - this.getAlugado();
	}
	
	public String toString() {
		StringBuilder texto = new StringBuilder();
		
		texto.append(super.toString());
		texto.append("; ");
		texto.append(this.edicao);
		texto.append("; ");
		texto.append(this.ano);
		texto.append("; ");
		texto.append(this.qnt);
		
		return texto.toString();
		
	}
	
	
}
