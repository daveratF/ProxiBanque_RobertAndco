package com.nous.maven.apps.ProxiBanque_DnR.service;

import fr.moi.FilRouge.dao.DAO;
import fr.moi.FilRouge.dao.Idao;
import fr.moi.FilRouge.metier.Carte;
import fr.moi.FilRouge.metier.Client;
import fr.moi.FilRouge.metier.Compte;

public class ServiceConseiller implements IserviceConseiller{
	private Idao dao = new DAO();

	@Override
	public void seConnecter(String login, String mdp) {
		// TODO Auto-generated method stub
		dao.seConnecter(login, mdp);
	}

	@Override
	public void creationCompte() {
		// TODO Auto-generated method stub
		dao.creationCompte();
	}

	@Override
	public void modificationCompte(Compte cpt) {
		// TODO Auto-generated method stub
		dao.modificationCompte(cpt);
	}

	@Override
	public void suppressionCompte(Compte cpt) {
		// TODO Auto-generated method stub
		dao.suppressionCompte(cpt);
	}

	@Override
	public void lectureCompte(Compte cpt) {
		// TODO Auto-generated method stub
		dao.lectureCompte(cpt);
	}

	@Override
	public void virementCompte(Compte cpt) {
		// TODO Auto-generated method stub
		dao.virementCompte(cpt);
	}

	@Override
	public void patrimoineCompte(Compte cpt) {
		// TODO Auto-generated method stub
		dao.patrimoineCompte(cpt);
	}

	@Override
	public void creationCarte(Carte cte) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void suppressionCarte(Carte cte) {
		// TODO Auto-generated method stub
		dao.suppressionCarte(cte);
	}

	@Override
	public void creationClient() {
		// TODO Auto-generated method stub
		dao.creationClient();
	}

	@Override
	public void suppressionClient(Client c) {
		// TODO Auto-generated method stub
		dao.suppressionClient(c);
	}

	@Override
	public void modificationClient(Client c) {
		// TODO Auto-generated method stub
		dao.modificationClient(c);
	}

}
