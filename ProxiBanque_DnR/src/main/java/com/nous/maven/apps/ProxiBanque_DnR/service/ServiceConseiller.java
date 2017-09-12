package com.nous.maven.apps.ProxiBanque_DnR.service;

import com.nous.maven.apps.ProxiBanque_DnR.dao.DAO;
import com.nous.maven.apps.ProxiBanque_DnR.dao.Idao;
import com.nous.maven.apps.ProxiBanque_DnR.metier.Carte;
import com.nous.maven.apps.ProxiBanque_DnR.metier.Client;
import com.nous.maven.apps.ProxiBanque_DnR.metier.Compte;

public class ServiceConseiller implements IserviceConseiller{
	private Idao dao = new DAO();

	@Override
	public void seConnecter(String login, String mdp) {
		dao.seConnecter(login, mdp);	
	}

	@Override
	public void creationCompte() {
		dao.creationCompte();	
	}

	@Override
	public void modificationCompte(Compte cpt) {
		dao.modificationCompte(cpt);		
	}

	@Override
	public void suppressionCompte(Compte cpt) {
		dao.suppressionCompte(cpt);		
	}

	@Override
	public void lectureCompte(Compte cpt) {
		dao.lectureCompte(cpt);		
	}

	@Override
	public void virementCompte(Compte cpt) {
		dao.virementCompte(cpt);		
	}

	@Override
	public void patrimoineCompte(Compte cpt) {
		dao.patrimoineCompte(cpt);		
	}

	@Override
	public void simulerCredit(Compte cpt) {
		dao.simulerCredit(cpt);		
	}

	@Override
	public void creationCarte(Carte cte) {
		dao.creationCarte(cte);		
	}

	@Override
	public void suppressionCarte(Carte cte) {
		dao.suppressionCarte(cte);
	}

	@Override
	public void creationClient() {
		dao.creationClient();
	}

	@Override
	public void suppressionClient(Client c) {
		dao.suppressionClient(c);
	}

	@Override
	public void modificationClient(Client c) {
		dao.modificationClient(c);
	}

	@Override
	public void lectureClient(Client c) {
		dao.lectureClient(c);
	}
}
