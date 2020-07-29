package net.aulas;

public class Pessoa {
	
	private String nome;
	private String rua;
	
	public Pessoa(String nome, String rua) {
		this.nome = nome;
		this.rua = rua;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}
}