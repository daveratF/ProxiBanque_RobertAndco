package com.nous.maven.apps.ProxiBanque_DnR.service;

import java.util.List;

import com.nous.maven.apps.ProxiBanque_DnR.metier.Agence;
import com.nous.maven.apps.ProxiBanque_DnR.metier.Carte;
import com.nous.maven.apps.ProxiBanque_DnR.metier.Client;
import com.nous.maven.apps.ProxiBanque_DnR.metier.Compte;
import com.nous.maven.apps.ProxiBanque_DnR.metier.Employe;
import com.nous.maven.apps.ProxiBanque_DnR.metier.EmployeConseiller;
import com.nous.maven.apps.ProxiBanque_DnR.metier.EmployeGerant;

/**
 * Le g�rant poss�de les m�mes traces que le conseiller (extends IserviceConseiller)
 * ainsi que certaine n�cessitant un niveau d'accr�ditation suffisant
 * @author moi2
 *
 */
public interface IserviceGerant extends IserviceConseiller{
	public void seConnecter(String login, String mdp);
	//Conseiller
		public void creationConseiller(EmployeConseiller ec);
		public List<Compte> lectureCompte();
		public List<Client> lectureClient();
		public void suppressionConseiller(EmployeConseiller ec);
		public List<EmployeConseiller> lectureConseiller();
		public void modifierConseiller(EmployeConseiller ec);
		public void attributionEmploye(Agence a, Employe e);
		public void attributionConseiller(EmployeGerant eg, EmployeConseiller ec);
		public void attributionClient(Employe e, Client c);
		public void attributionCompte(Client c, Compte cpt);
		public void attributionCarte(Compte cpt, Carte cte);
		public List<Employe> lesEmployes(int idEmploye);
		public List<EmployeConseiller> sesConseillers(int idConseiller);
		public List<Client> sesClients(int idClient);
		public List<Compte> sesComtpes(int idComtpe);
		public List<Carte> sesCartes(int idCarte);

}
