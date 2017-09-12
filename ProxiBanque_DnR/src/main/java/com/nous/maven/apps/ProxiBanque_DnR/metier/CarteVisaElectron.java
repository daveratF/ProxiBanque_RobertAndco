package com.nous.maven.apps.ProxiBanque_DnR.metier;

public class CarteVisaElectron extends Carte {
	private int idElectron;

	public int getIdElectron() {
		return idElectron;
	}

	public void setIdElectron(int idElectron) {
		this.idElectron = idElectron;
	}

	@Override
	public String toString() {
		return "CarteVisaElectron [idElectron=" + idElectron + "]";
	}
}
