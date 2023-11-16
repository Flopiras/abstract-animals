package org.java.pojo;

import org.java.pojo.abs.Animale;
import org.java.pojo.inter.IVolante;

public class Passerotto extends Animale implements IVolante {

	// constructor
	public Passerotto(String nome, int zampe) {

		super(nome, zampe);
	}
	
	// override
	@Override
	public String dormi() {
		
		return "Zzzzz";
	}

	@Override
	public String verso() {
		
		return "Cip cip";
	}

	@Override
	public String mangia() {
		
		return "Il mio cibo preferito sono i semini!";
	}

	@Override
	public void vola() {
		
		System.out.println("Sto volandooo!");;
	}

}
