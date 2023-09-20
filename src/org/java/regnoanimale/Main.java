package org.java.regnoanimale;

public class Main {

	public static void main(String[] args) {

		Cane Animale1 = new Cane("canide");
		Animale1.dormi();
		Animale1.mangia();
		Animale1.verso();
		
		faiNuotare(Animale1);

		Passerotto Animale2 = new Passerotto("passero");
		Animale2.dormi();
		Animale2.mangia();
		Animale2.verso();
		
		faiVolare(Animale2);
		faiNuotare(Animale2);

		Aquila Animale3 = new Aquila("reale");
		Animale3.dormi();
		Animale3.mangia();
		Animale3.verso();
		
		faiNuotare(Animale3);
		faiVolare(Animale3);

		Delfino Animale4 = new Delfino("flipper");
		Animale4.dormi();
		Animale4.mangia();
		Animale4.verso();
		
		faiNuotare(Animale4);

	}

	private static void faiNuotare(INuotante animale) {
		// TODO Auto-generated method stub
		animale.nuota();

	}

	private static void faiVolare(IVolante animale) {
		animale.vola();
	}
}
