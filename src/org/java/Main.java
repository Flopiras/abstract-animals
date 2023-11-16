package org.java;

import org.java.pojo.Aquila;
import org.java.pojo.Cane;
import org.java.pojo.Delfino;
import org.java.pojo.Passerotto;
import org.java.pojo.abs.Animale;
import org.java.pojo.inter.INuotante;
import org.java.pojo.inter.IVolante;

public class Main {

	public static void main(String[] args) {

		Cane c1 = new Cane("Toby", 4);

		Passerotto p1 = new Passerotto("Cippy", 2);

		Aquila a1 = new Aquila("Geremia", 2);

		Delfino d1 = new Delfino("Skipper", 0);

		Animale[] animali = new Animale[4];
		animali[0] = c1;
		animali[1] = p1;
		animali[2] = a1;
		animali[3] = d1;

		for (int x = 0; x < animali.length; x++) {

			Animale a = animali[x];

			System.out.print("\n--------------------------------\n" + a.toString() + "\n" + "Quando dormo faccio " + "'"
					+ a.dormi() + "'" + "\n" + "Quando parlo coi miei amici invece faccio " + "'" + a.verso() + "'"
					+ "\n" + a.mangia());

		}

		IVolante[] volanti = new IVolante[2];
		volanti[0] = p1;
		volanti[1] = a1;

		INuotante[] nuotanti = new INuotante[1];
		nuotanti[0] = d1;

		for (int x = 0; x < volanti.length; x++) {

			faiVolare(volanti[x]);
		}

		for (int x = 0; x < nuotanti.length; x++) {

			faiNuotare(nuotanti[x]);
		}

	}

	public static void faiVolare(IVolante a) {

		a.vola();
	}
	
	public static void faiNuotare(INuotante a) {

		a.nuota();
	}
}
