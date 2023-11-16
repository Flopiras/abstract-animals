package org.java.pojo;

import org.java.pojo.abs.Animale;
import org.java.pojo.inter.INuotante;

public class Delfino extends Animale  implements INuotante{

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
	
	@Override
	public void nuota() {
		System.out.println("Sto nuotandooo!!");
		
	}
	
}
