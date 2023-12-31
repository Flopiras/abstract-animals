package org.java.pojo;

import org.java.pojo.abs.Animale;

public class Cane extends Animale {

	// constructor
	public Cane(String nome, int zampe) {

		super(nome, zampe);
	}
	
	// override
	@Override
	public String dormi() {
		
		return "Zzzzz";
	}

	@Override
	public String verso() {
		
		return "Bau bau";
	}

	@Override
	public String mangia() {
		
		return "Il mio cibo preferito è l'osso!";
	}

}
