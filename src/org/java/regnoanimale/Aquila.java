package org.java.regnoanimale;

public class Aquila extends Animale implements IVolante ,INuotante {

	@Override
	public void vola() {
		
		System.out.println("**Sto volando!!! come un aquila**");
	}
	@Override
	public void nuota() {
		System.out.println("sto nuotando");
	}

	public Aquila(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub

	}

	@Override
	public void verso() {
		// TODO Auto-generated method stub
		System.out.println("SKREE SKREE");

	}

	@Override
	public void mangia() {
		// TODO Auto-generated method stub
		System.out.println("Mangia :Topi");

	}

}
