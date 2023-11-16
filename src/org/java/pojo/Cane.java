package org.java.pojo;

import org.java.pojo.abs.Animale;

public class Cane extends Animale {

	private String verso;
	private String nutrimento;

	// constructor
	public Cane(String nome, int zampe, String verso, String nutrimento) {

		super(nome, zampe);

		setVerso(verso);
		setNutrimento(nutrimento);
	}

	// getters and setters
	public String getVerso() {
		return verso;
	}

	public void setVerso(String verso) {
		this.verso = verso;
	}

	public String getNutrimento() {
		return nutrimento;
	}

	public void setNutrimento(String nutrimento) {
		this.nutrimento = nutrimento;
	}
	
	//methods
	

	// override
	@Override
	public String dormi() {
		
		return "Zzzzz";
	}

}
