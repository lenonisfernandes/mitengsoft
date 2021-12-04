package br.edu.infnet.appemprestimo.model.domain;

public class Cliente {
	
	private Integer id;
	private String nome;
	private String email;
	private String cpf;
	
	public Cliente(String nome, String email, String cpf) {
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
	}
	
	@Override
	public String toString() {
		StringBuilder texto = new StringBuilder();
		
		texto.append(this.id);
		texto.append(";");
		texto.append(this.nome);
		texto.append(";");
		texto.append(this.email);
		texto.append(";");
		texto.append(this.cpf);
		
		return texto.toString();
	}
	
	public Integer getId() {
		return id;
	}
	public void setID(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	

}
