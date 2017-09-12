package com.nous.maven.apps.ProxiBanque_DnR.service;

import com.nous.maven.apps.ProxiBanque_DnR.dao.DAO;
import com.nous.maven.apps.ProxiBanque_DnR.dao.Idao;

/**
 * 
 */

public class ServiceAuditeur implements IserviceAuditeur{
	private Idao dao = new DAO();

	@Override
	public void seConnecter(String login, String mdp) {
		dao.seConnecter(login, mdp);
	}

	@Override
	public void auditerCompte() {
		dao.auditerCompte();
	}
}
