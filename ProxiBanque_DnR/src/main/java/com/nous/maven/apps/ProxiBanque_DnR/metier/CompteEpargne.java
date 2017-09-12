package com.nous.maven.apps.ProxiBanque_DnR.metier;
/**
 * La class CompteEpargne correspond � un type de compte sp�cifique avec des op�rations sp�cifiques
 * C'est une class de type fille.
 * @author moi2
 *
 */
public class CompteEpargne extends Compte {
	//attribut
	private double taux;
	//getters and setters
	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}

	public CompteEpargne(double taux) {
		super();
		this.taux = taux;
	}

	@Override
	public String toString() {
		return "CompteEpargne [taux=" + taux + "]";
	}
	
}
