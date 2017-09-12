package com.nous.maven.apps.ProxiBanque_DnR.service;

import fr.moi.FilRouge.metier.EmployeAuditeur;
/**
 * L'auditeur est plus restreint et poss�de moins de traces que les autres utilistaeur
 * @author moi2
 *
 */
public interface IserviceAuditeur {
	public void seConnecter(String login, String mdp);
	public void auditerCompte(EmployeAuditeur a);

}
