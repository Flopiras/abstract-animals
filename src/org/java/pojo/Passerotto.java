package org.java.pojo;

import org.java.pojo.abs.Animale;

public class Passerotto extends Animale {

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

}
