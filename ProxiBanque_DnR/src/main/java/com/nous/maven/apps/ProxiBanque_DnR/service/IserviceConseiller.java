package com.nous.maven.apps.ProxiBanque_DnR.service;

import fr.moi.FilRouge.metier.Carte;
import fr.moi.FilRouge.metier.Client;
import fr.moi.FilRouge.metier.Compte;
/**
 * Liste des traces dont le conseiller peut disposer pour g�rer les comptes et clients
 * @author moi2
 *
 */
public interface IserviceConseiller {
	public void seConnecter(String login, String mdp);	
	//compte
	public void creationCompte();
	public void modificationCompte(Compte cpt);
	public void suppressionCompte(Compte cpt);
	public void lectureCompte(Compte cpt);
	public void virementCompte(Compte cpt);
	public void patrimoineCompte(Compte cpt);
	//Compte-carte
	public void creationCarte(Carte cte);
	public void suppressionCarte(Carte cte);

	//Client
	public void creationClient();
	public void suppressionClient(Client c);
	public void modificationClient(Client c);
}
