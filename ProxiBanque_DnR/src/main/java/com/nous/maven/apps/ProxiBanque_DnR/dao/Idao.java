package com.nous.maven.apps.ProxiBanque_DnR.dao;

import com.nous.maven.apps.ProxiBanque_DnR.metier.Carte;
import com.nous.maven.apps.ProxiBanque_DnR.metier.Client;
import com.nous.maven.apps.ProxiBanque_DnR.metier.Compte;
import com.nous.maven.apps.ProxiBanque_DnR.metier.EmployeConseiller;

public interface Idao {
	//traces methodes
	public void seConnecter(String login, String mdp);
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
	//Conseiller
	public void creationConseiller();
	public void suppressionConseiller(EmployeConseiller ec);
	public void lireConseiller(EmployeConseiller ec);
	public void modifierConseiller(EmployeConseiller ec);
	//Audit
	public void auditerCompte();
}
