package org.java.regnoanimale;

public class Passerotto extends Animale implements IVolante,INuotante {
	@Override
	public void vola() {
		System.out.println("sto volando come un passerotto");
	}
	
	public void nuota() {
		System.out.println("sto nuotando");
	}
	
	public Passerotto(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void verso() {
		// TODO Auto-generated method stub
		System.out.println("CIP CIP");

	}

	@Override
	public void mangia() {
		// TODO Auto-generated method stub
		System.out.println("Mangia : Semmenta,Vermi");

	}

}
