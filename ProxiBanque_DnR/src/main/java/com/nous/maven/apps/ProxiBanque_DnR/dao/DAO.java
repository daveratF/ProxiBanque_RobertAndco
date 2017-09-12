package com.nous.maven.apps.ProxiBanque_DnR.dao;
/**
 * La class DAO permet de discuter avec la base de donn�e
 * Toutes les m�thodes des packages du projets se retrouvent ici.
 */
import fr.moi.FilRouge.metier.EmployeAuditeur;
import fr.moi.FilRouge.metier.Carte;
import fr.moi.FilRouge.metier.Client;
import fr.moi.FilRouge.metier.Compte;
import fr.moi.FilRouge.metier.EmployeGerant;

public class DAO implements Idao{

	@Override
	public void seConnecter(String login, String mdp) {
		// TODO Auto-generated method stub
		System.out.println("SECONNECTER LOGIN " + login);
	}

	@Override
	public void creationCompte() {
		// TODO Auto-generated method stub
		System.out.println("CREATIONCOMPTE");

	}

	@Override
	public void modificationCompte(Compte cpt) {
		// TODO Auto-generated method stub
		System.out.println("MODIFIFIAZR");

	}

	@Override
	public void suppressionCompte(Compte cpt) {
		// TODO Auto-generated method stub
		System.out.println("SUPPRESSION");

	}

	@Override
	public void lectureCompte(Compte cpt) {
		System.out.println("sfsfqsfqsfqsfqsf");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void virementCompte(Compte cpt) {
		// TODO Auto-generated method stub
		System.out.println("VIREMENT");

	}

	@Override
	public void patrimoineCompte(Compte cpt) {
		// TODO Auto-generated method stub
		System.out.println("PATRICK");
	}

	@Override
	public void creationCarte(Carte cte) {
		// TODO Auto-generated method stub
		System.out.println("CARTACTARCAZRAE");
	}

	@Override
	public void suppressionCarte(Carte cte) {
		// TODO Auto-generated method stub
		System.out.println("SUPP CARTE");

	}

	@Override
	public void creationClient() {
		// TODO Auto-generated method stub
		System.out.println("CREAT CLIENT");

	}

	@Override
	public void suppressionClient(Client c) {
		// TODO Auto-generated method stub
		System.out.println("SUPPRE CLIENT");

	}

	@Override
	public void modificationClient(Client c) {
		// TODO Auto-generated method stub
		System.out.println("MODIF CLIENT");

	}

	@Override
	public void visualisationTransaction(EmployeGerant eg) {
		// TODO Auto-generated method stub
		System.out.println("VISU TRANSAC");

	}

	@Override
	public void auditerCompte(EmployeAuditeur a) {
		// TODO Auto-generated method stub
		System.out.println("AUDITCOMPTE");

	}

	
	
}
