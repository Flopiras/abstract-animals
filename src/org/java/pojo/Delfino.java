package org.java.pojo;

import org.java.pojo.abs.Animale;

public class Delfino extends Animale {

	// constructor
	public Delfino(String nome, int zampe) {

		super(nome, zampe);
	}
	
	// override
	@Override
	public String dormi() {
		
		return "Zzzzz";
	}

	@Override
	public String verso() {
		
		return "Gnee keee gneee";
	}

	@Override
	public String mangia() {
		
		return "Il mio cibo preferito sono i piccoli pesci!";
	}

}
