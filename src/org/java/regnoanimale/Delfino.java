package org.java.regnoanimale;

public class Delfino extends Animale implements INuotante {
	
	@Override
	public void nuota() {
		System.out.println("sto nuotando come un delfino");
	}

	public Delfino(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void verso() {
		// TODO Auto-generated method stub
		System.out.println("EEEEK EEEEK");

	}

	@Override
	public void mangia() {
		// TODO Auto-generated method stub
		System.out.println("Mangia :Pesciolini");

	}

}
