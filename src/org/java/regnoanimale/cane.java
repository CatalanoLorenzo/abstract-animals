package org.java.regnoanimale;

public class Cane extends Animale implements INuotante  {

	public Cane(String nome) {
		super(nome);
	}
	
	public void nuota() {
		System.out.println("sto nuotando come un cane");
	}

	@Override
	public void verso() {
		// TODO Auto-generated method stub
		System.out.println("BAU BAU");
		
	}

	@Override
	public void mangia() {
		// TODO Auto-generated method stub
		System.out.println("Mangia : Carne");

	}
	

}
