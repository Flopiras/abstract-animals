package org.java.pojo.abs;

public abstract class Animale {
	
	private String nome;
	private int zampe;
	
	//constructor
	public Animale(String nome, int zampe) {
		
		setNome(nome);
		setZampe(zampe);
		
	}

	//getters and setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getZampe() {
		return zampe;
	}

	public void setZampe(int zampe) {
		this.zampe = zampe;
	}

	//abstract methods
	public abstract String dormi();
	public abstract String verso();
	public abstract String mangia();
	
	//override
	@Override
	public String toString() {

		return "Mi chiamo " + getNome() + "\n"
			+ "e ho " + getZampe() + " zampe";
	}
}
