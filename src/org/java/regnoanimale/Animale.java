package org.java.regnoanimale;

public abstract class Animale {

	private String nome;

	public Animale(String nome) {
		this.setNome(nome);
	}

	public abstract void verso();

	public abstract void mangia();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void dormi() {

		System.out.println("Zzz");

	}

}
