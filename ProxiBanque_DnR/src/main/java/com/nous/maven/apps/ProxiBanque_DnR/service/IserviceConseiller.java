package com.nous.maven.apps.ProxiBanque_DnR.service;

import java.util.List;

import com.nous.maven.apps.ProxiBanque_DnR.metier.Carte;
import com.nous.maven.apps.ProxiBanque_DnR.metier.Client;
import com.nous.maven.apps.ProxiBanque_DnR.metier.Compte;
import com.nous.maven.apps.ProxiBanque_DnR.metier.Employe;

/**
 * Liste des traces dont le conseiller peut disposer pour g�rer les comptes et clients
 * @author moi2
 *
 */
public interface IserviceConseiller {
	//traces methodes
		public void seConnecter(String login, String mdp);
		//Compte
		public void creationCompte(Compte cpt);
		public void modificationCompte(Compte cpt);
		public void suppressionCompte(Compte cpt);
		public void lectureCompte(Compte cpt);
		public void virementCompte(Compte cpt);
		public void patrimoineCompte(Compte cpt);
		public void simulerCredit(Compte cpt);
		//Compte-carte
		public void creationCarte(Carte cte);
		public void suppressionCarte(Carte cte);
		//Client
		public void creationClient(Client c);
		public void suppressionClient(Client c);
		public void modificationClient(Client c);
		public void lectureClient(Client c);
		public void attributionClient(Employe e, Client c);
		public void attributionCompte(Client c, Compte cpt);
		public void attributionCarte(Compte cpt, Carte cte);
		public List<Client> sesClients(int idClient);
		public List<Compte> sesComtpes(int idComtpe);
		public List<Carte> sesCartes(int idCarte);

}
