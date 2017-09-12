package com.nous.maven.apps.ProxiBanque_DnR.metier;
/**
 * La class Auditeur permet de d�finir les caract�ristiques des personnes responsables
 * d'effectuer les audits des comtpe
 * Les methodes sp�cifiques aux auditeurs y sont d�finies
 * @author moi2
 *
 */
public class EmployeAuditeur extends Employe{
	//attribut
	private int idAuditeur;

	public int getIdAuditeur() {
		return idAuditeur;
	}

	public void setIdAuditeur(int idAuditeur) {
		this.idAuditeur = idAuditeur;
	}

	@Override
	public String toString() {
		return "EmployeAuditeur [idAuditeur=" + idAuditeur + "]";
	}
}
