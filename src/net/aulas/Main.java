package net.aulas;

public class Main {
	
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Gabriel", "Vicente");
		
		System.out.println("Pessoas");
		System.out.println("Pessoa:");
		System.out.println(" Nome: " + pessoa.getNome());
		System.out.println(" Rua: " + pessoa.getRua());
	}
}