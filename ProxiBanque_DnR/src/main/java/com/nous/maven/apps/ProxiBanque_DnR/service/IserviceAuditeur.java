package com.nous.maven.apps.ProxiBanque_DnR.service;

/**
 * L'auditeur est plus restreint et possède moins de traces que les autres utilistaeur
 * @author moi2
 *
 */
public interface IserviceAuditeur {
	public void seConnecter(String login, String mdp);
	//Audit
		public void auditerCompte();
}
