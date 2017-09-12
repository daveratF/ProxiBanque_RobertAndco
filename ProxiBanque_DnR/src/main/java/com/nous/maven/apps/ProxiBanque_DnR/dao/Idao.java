package com.nous.maven.apps.ProxiBanque_DnR.dao;

import fr.moi.FilRouge.metier.EmployeAuditeur;
import fr.moi.FilRouge.metier.Carte;
import fr.moi.FilRouge.metier.Client;
import fr.moi.FilRouge.metier.Compte;
import fr.moi.FilRouge.metier.EmployeGerant;

public interface Idao {
	//traces methodes
	public void seConnecter(String login, String mdp);
	//traces des employes
	//Compte
	public void creationCompte();
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
	public void creationClient();
	public void suppressionClient(Client c);
	public void modificationClient(Client c);
	public void lectureClient(Client c);
	//traces pour gerant
	public void creationConseille(EmployeGerant eg);
	public void suppressionConseille(EmployeGerant eg);
	public void lireConseille(EmployeGerant eg);
	public void modifierConseille(EmployeGerant eg);

	//traces pour auditeur
	public void auditerCompte(EmployeAuditeur a);
	
	
}
