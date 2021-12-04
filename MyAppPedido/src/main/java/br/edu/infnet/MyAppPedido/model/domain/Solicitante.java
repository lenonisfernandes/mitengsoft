package br.edu.infnet.MyAppPedido.model.domain;

public class Solicitante {
	
	private Integer id;
	private String nome;
	private String email;
	private String cpf;
	
	
	public Solicitante(String nome, String email, String cpf) {
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
	
	
	public String getNome() {
		return nome;
	}
	public String getEmail() {
		return email;
	}
	public String getCpf() {
		return cpf;
	}

}
