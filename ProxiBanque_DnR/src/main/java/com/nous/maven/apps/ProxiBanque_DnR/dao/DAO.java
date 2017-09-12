package com.nous.maven.apps.ProxiBanque_DnR.dao;

import com.nous.maven.apps.ProxiBanque_DnR.metier.Carte;
import com.nous.maven.apps.ProxiBanque_DnR.metier.Client;
import com.nous.maven.apps.ProxiBanque_DnR.metier.Compte;
import com.nous.maven.apps.ProxiBanque_DnR.metier.EmployeConseiller;

/**
 * La class DAO permet de discuter avec la base de donn�e
 * Toutes les m�thodes des packages du projets se retrouvent ici.
 */

public class DAO implements Idao{

	@Override
	public void seConnecter(String login, String mdp) {
		System.out.println("SECONNECTER LOGIN " + login);
	}

	@Override
	public void creationCompte() {
		System.out.println("CREATION COMPTE");
	}

	@Override
	public void modificationCompte(Compte cpt) {
		System.out.println("MODIF COMPTE");
	}

	@Override
	public void suppressionCompte(Compte cpt) {
		System.out.println("SUPPRESSION COMPTE");
	}

	@Override
	public void lectureCompte(Compte cpt) {
		System.out.println("VISUALISATION COMPTE");	
	}

	@Override
	public void virementCompte(Compte cpt) {
		System.out.println("VIREMENT");
	}

	@Override
	public void patrimoineCompte(Compte cpt) {
		System.out.println("PLACEMENT EN BOURSE");
	}

	@Override
	public void simulerCredit(Compte cpt) {
		System.out.println("SIMULE UN CREDIT");
	}
	
	@Override
	public void creationCarte(Carte cte) {
		System.out.println("CREATION CARTE");
	}

	@Override
	public void suppressionCarte(Carte cte) {
		System.out.println("SUPPRIME CARTE");
	}

	@Override
	public void creationClient() {
		System.out.println("CREATION CLIENT");
	}

	@Override
	public void suppressionClient(Client c) {
		System.out.println("SUPPRIME CLIENT");
	}

	@Override
	public void modificationClient(Client c) {
		System.out.println("VISUALISATION CLIENT");
	}

	@Override
	public void lectureClient(Client c) {
		System.out.println("Lecture CLIENT");
	}
	
	@Override
	public void creationConseiller() {
		System.out.println("CREATION CONSEILLER");
	}

	@Override
	public void suppressionConseiller(EmployeConseiller ec) {
		System.out.println("SUPPRIME CONSEILLER");
	}

	@Override
	public void modifierConseiller(EmployeConseiller ec) {
		System.out.println("MODIF CONSEILLER");
	}

	@Override
	public void lireConseiller(EmployeConseiller ec) {
		System.out.println("VISUALISATION CONSEILLER");
	}

	@Override
	public void auditerCompte() {
		System.out.println("AUDIT COMPTE");
	}	
}
