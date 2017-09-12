package com.nous.maven.apps.ProxiBanque_DnR.metier;

public class CarteVisaPremier extends Carte {
	private int idPremier;

	public int getIdPremier() {
		return idPremier;
	}

	public void setIdPremier(int idPremier) {
		this.idPremier = idPremier;
	}

	@Override
	public String toString() {
		return "CarteVisaPremier [idPremier=" + idPremier + "]";
	}
}
