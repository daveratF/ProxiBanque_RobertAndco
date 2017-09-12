package com.nous.maven.apps.ProxiBanque_DnR.service;
/**
 * 
 */
import fr.moi.FilRouge.dao.DAO;
import fr.moi.FilRouge.dao.Idao;
import fr.moi.FilRouge.metier.EmployeAuditeur;

public class ServiceAuditeur implements IserviceAuditeur{
	private Idao dao = new DAO();

	@Override
	public void seConnecter(String login, String mdp) {
		// TODO Auto-generated method stub
		dao.seConnecter(login, mdp);
	}

	@Override
	public void auditerCompte(EmployeAuditeur a) {
		// TODO Auto-generated method stub
		dao.auditerCompte(a);
	}
	
}
