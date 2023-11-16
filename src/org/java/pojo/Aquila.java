package org.java.pojo;

import org.java.pojo.abs.Animale;

public class Aquila extends Animale {

	// constructor
	public Aquila(String nome, int zampe) {

		super(nome, zampe);
	}
	
	// override
	@Override
	public String dormi() {
		
		return "Zzzzz";
	}

	@Override
	public String verso() {
		
		return "HIIIIIIIIIII";
	}

	@Override
	public String mangia() {
		
		return "Il mio cibo preferito sono i cuccioli degli altri animali!";
	}

}
