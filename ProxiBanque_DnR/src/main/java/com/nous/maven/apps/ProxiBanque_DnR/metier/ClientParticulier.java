package com.nous.maven.apps.ProxiBanque_DnR.metier;
/**
 * La class ClientParticulier correspond � un type de client sp�cifique poss�dant des droits sp�cifiques
 * @author moi2
 *
 */
public class ClientParticulier extends Client {
	private int idParticulier;

	public int getIdParticulier() {
		return idParticulier;
	}

	public void setIdParticulier(int idParticulier) {
		this.idParticulier = idParticulier;
	}

	@Override
	public String toString() {
		return "ClientParticulier [idParticulier=" + idParticulier + "]";
	}
}
