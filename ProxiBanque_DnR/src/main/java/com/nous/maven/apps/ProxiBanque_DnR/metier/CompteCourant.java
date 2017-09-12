package com.nous.maven.apps.ProxiBanque_DnR.metier;
/**
 * La class CompteCourant correspond � un type de compte sp�cifique avec des op�rations sp�cifiques
 * C'est une class de type fille.
 * @author moi2
 *
 */
public class CompteCourant extends Compte {
	//attribut
	private int decouvert;
	//getters and setters
	public int getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(int decouvert) {
		this.decouvert = decouvert;
	}

	
	public CompteCourant(int decouvert) {
		super();
		this.decouvert = decouvert;
	}

	@Override
	public String toString() {
		return "CompteCourant [decouvert=" + decouvert + "]";
	}
	
}
