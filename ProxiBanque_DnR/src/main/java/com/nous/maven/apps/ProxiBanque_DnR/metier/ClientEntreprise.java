package com.nous.maven.apps.ProxiBanque_DnR.metier;
/**
 * La class ClientEntreprise correspond � un type de client sp�cifique poss�dant des droits sp�cifiques
 * @author moi2
 *
 */
public class ClientEntreprise extends Client {
	//attribut
	private int idEntreprise;
	//getters and setters

	public int getIdEntreprise() {
		return idEntreprise;
	}

	public void setIdEntreprise(int idEntreprise) {
		this.idEntreprise = idEntreprise;
	}

	@Override
	public String toString() {
		return "ClientEntreprise [idEntreprise=" + idEntreprise + "]";
	}
}
