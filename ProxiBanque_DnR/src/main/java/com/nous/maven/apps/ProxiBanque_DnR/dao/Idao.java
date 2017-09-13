package com.nous.maven.apps.ProxiBanque_DnR.dao;

import java.util.List;

import com.nous.maven.apps.ProxiBanque_DnR.metier.Agence;
import com.nous.maven.apps.ProxiBanque_DnR.metier.Carte;
import com.nous.maven.apps.ProxiBanque_DnR.metier.Client;
import com.nous.maven.apps.ProxiBanque_DnR.metier.Compte;
import com.nous.maven.apps.ProxiBanque_DnR.metier.Employe;
import com.nous.maven.apps.ProxiBanque_DnR.metier.EmployeAuditeur;
import com.nous.maven.apps.ProxiBanque_DnR.metier.EmployeConseiller;
import com.nous.maven.apps.ProxiBanque_DnR.metier.EmployeGerant;

public interface Idao {
	//traces methodes
	public void seConnecter(String login, String mdp);
	//Compte
	public void creationCompte(Compte cpt);
	public void modificationCompte(Compte cpt);
	public void suppressionCompte(Compte cpt);
	public List<Compte> lectureCompte();
	public void virementCompte(Compte cpt);
	public void patrimoineCompte(Compte cpt);
	public void simulerCredit(Compte cpt);
	//Compte-carte
	public void creationCarte(Carte cte);
	public void suppressionCarte(int idCarte);
	//Client
	public void creationClient(Client c);
	public void suppressionClient(Client c);
	public void modificationClient(Client c);
	public List<Client> lectureClient();
	//Conseiller
	public void creationConseiller(EmployeConseiller ec);
	public void suppressionConseiller(EmployeConseiller ec);
	public List<EmployeConseiller> lectureConseiller();
	public void modifierConseiller(EmployeConseiller ec);
	//gerant

	//Audit
	//public void creationAuditeur(EmployeAuditeur ea);
	//public void suppressionAuditeur(EmployeAuditeur ea);
	public void auditerCompte();
	
		
	//methode relation class
	//attribution poste
	public void attributionEmploye(Agence a, Employe e);
	public void attributionConseiller(EmployeGerant eg, EmployeConseiller ec);
	public void attributionClient(Employe e, Client c);
	public void attributionCompte(Client c, Compte cpt);
	public void attributionCarte(Compte cpt, Carte cte);

	
	//agence->employe
	public List<Employe> lesEmployes(int idEmploye);
	//EmployeGerant->EmployeConseiller
	public List<EmployeConseiller> sesConseillers(int idConseiller);
	//Employe->Client
	public List<Client> sesClients(int idClient);
	//Client->Compte
	public List<Compte> sesComtpes(int idComtpe);
	//compte->Carte
	public List<Carte> sesCartes(int idCarte);
	
}
