package com.nous.maven.apps.ProxiBanque_DnR.service;

import java.util.List;

import com.nous.maven.apps.ProxiBanque_DnR.dao.DAO;
import com.nous.maven.apps.ProxiBanque_DnR.dao.Idao;
import com.nous.maven.apps.ProxiBanque_DnR.metier.Carte;
import com.nous.maven.apps.ProxiBanque_DnR.metier.Client;
import com.nous.maven.apps.ProxiBanque_DnR.metier.Compte;
import com.nous.maven.apps.ProxiBanque_DnR.metier.Employe;

public class ServiceConseiller implements IserviceConseiller{
	private Idao dao = new DAO();

	@Override
	public void seConnecter(String login, String mdp) {
		dao.seConnecter(login, mdp);	
	}

	@Override
	public void creationCompte(Compte cpt) {
		dao.creationCompte(cpt);	
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
	public void suppressionCarte(int idCarte) {
		dao.suppressionCarte(idCarte);
	}

	@Override
	public void creationClient(Client c) {
		dao.creationClient(c);
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
	public void attributionClient(Employe e, Client c) {
		dao.attributionClient(e, c);
	}

	@Override
	public void attributionCompte(Client c, Compte cpt) {
		dao.attributionCompte(c, cpt);
	}

	@Override
	public void attributionCarte(Compte cpt, Carte cte) {
		dao.attributionCarte(cpt, cte);
	}

	@Override
	public List<Client> sesClients(int idClient) {
		return dao.sesClients(idClient);
	}

	@Override
	public List<Compte> sesComtpes(int idComtpe) {
		return dao.sesComtpes(idComtpe);
	}

	@Override
	public List<Carte> sesCartes(int idCarte) {
		return dao.sesCartes(idCarte);
	}

	@Override
	public List<Compte> lectureCompte() {
		return dao.lectureCompte();
	}

	@Override
	public List<Client> lectureClient() {
		return dao.lectureClient();
	}
}
