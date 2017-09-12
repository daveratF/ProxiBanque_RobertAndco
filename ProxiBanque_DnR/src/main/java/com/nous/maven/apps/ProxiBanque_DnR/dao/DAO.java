package com.nous.maven.apps.ProxiBanque_DnR.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
	public void creationCompte(Compte cpt) {
		try {
			//1 -  charger le pilote
			Class.forName("com.mysql.jdbc.Driver");
			//2 -  adresse de la BDD
			String adresse = "jdbc:mysql://localhost:3306/proxibanque_dnr";
			String login = "root";
			String mdp = "";
			//3 -  se connecter à la BDD
			Connection conn = DriverManager.getConnection(adresse,login,mdp);
			//4 -  préparer et envoyer requete 
			String requete = "INSERT INTO Compte (numCompte, dateOuverture, solde) VALUES (?,?,?) "; 

			PreparedStatement ps = conn.prepareStatement(requete);
			ps.setInt(1, cpt.getCode()); 
			ps.setString(2, cpt.getDateOuverture());
			ps.setDouble(3, cpt.getSolde());
			ps.executeUpdate();
			//5 -  récupérer le résultat
			//6 -  libérer les ressources
			ps.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("CREATION COMPTE");
	}

	@Override
	public void modificationCompte(Compte cpt) {
		System.out.println("MODIF COMPTE");
	}

	@Override
	public void suppressionCompte(Compte cpt) {
		try {
			//1 -  charger le pilote
			Class.forName("com.mysql.jdbc.Driver");
			//2 -  adresse de la BDD
			String adresse = "jdbc:mysql://localhost:3306/proxibanque_dnr";
			String login = "root";
			String mdp = "";
			//3 -  se connecter à la BDD
			Connection conn = DriverManager.getConnection(adresse,login,mdp);
			//4 -  préparer et envoyer requete 
			String requete = "DELETE FROM Compte WHERE idCompte=? "; 
			PreparedStatement ps = conn.prepareStatement(requete);
			ps.setInt(1, cpt.getCode());
			ps.executeUpdate();
			//5 -  récupérer le résultat
			//6 -  libérer les ressources
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
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
		try {
			//1 -  charger le pilote
			Class.forName("com.mysql.jdbc.Driver");
			//2 -  adresse de la BDD
			String adresse = "jdbc:mysql://localhost:3306/proxibanque_dnr";
			String login = "root";
			String mdp = "";
			//3 -  se connecter à la BDD
			Connection conn = DriverManager.getConnection(adresse,login,mdp);
			//4 -  préparer et envoyer requete 
			String requete = "INSERT INTO Carte (numCarte) VALUES (?) "; 

			PreparedStatement ps = conn.prepareStatement(requete);
			ps.setInt(1, cte.getNumero()); 
			ps.executeUpdate();
			//5 -  récupérer le résultat
			//6 -  libérer les ressources
			ps.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("CREATION CARTE");
	}

	@Override
	public void suppressionCarte(Carte cte) {
		try {
			//1 -  charger le pilote
			Class.forName("com.mysql.jdbc.Driver");
			//2 -  adresse de la BDD
			String adresse = "jdbc:mysql://localhost:3306/proxibanque_dnr";
			String login = "root";
			String mdp = "";
			//3 -  se connecter à la BDD
			Connection conn = DriverManager.getConnection(adresse,login,mdp);
			//4 -  préparer et envoyer requete 
			String requete = "DELETE FROM Carte WHERE idCarte=? "; 
			PreparedStatement ps = conn.prepareStatement(requete);
			ps.setInt(1, cte.getNumero());
			ps.executeUpdate();
			//5 -  récupérer le résultat
			//6 -  libérer les ressources
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("SUPPRIME CARTE");
	}

	@Override
	public void creationClient(Client c) {
		try {
			
			//1 -  charger le pilote
			Class.forName("com.mysql.jdbc.Driver");
			//2 -  adresse de la BDD
			String adresse = "jdbc:mysql://localhost:3306/proxibanque_dnr";
			String login = "root";
			String mdp = "";
			//3 -  se connecter à la BDD
			Connection conn = DriverManager.getConnection(adresse,login,mdp);
			//4 -  préparer et envoyer requete 
			String requete = "INSERT INTO Client (nom, prenom, telephone, adresse, codePostal, ville) VALUES (?,?,?,?,?,?) "; 
			PreparedStatement ps = conn.prepareStatement(requete);
			ps.setString(1, c.getNom()); 
			ps.setString(2, c.getPrenom());
			ps.setInt(3, c.getTelephone());
			ps.setString(4, c.getAdresse());
			ps.setInt(5, c.getCodePostal());
			ps.setString(6, c.getVille());
			ps.executeUpdate();
			//5 -  récupérer le résultat
			//6 -  libérer les ressources
			ps.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("CREATION CLIENT");
	}

	@Override
	public void suppressionClient(Client c) {
		try {
			//1 -  charger le pilote
			Class.forName("com.mysql.jdbc.Driver");
			//2 -  adresse de la BDD
			String adresse = "jdbc:mysql://localhost:3306/proxibanque_dnr";
			String login = "root";
			String mdp = "";
			//3 -  se connecter à la BDD
			Connection conn = DriverManager.getConnection(adresse,login,mdp);
			//4 -  préparer et envoyer requete 
			String requete = "DELETE FROM Client WHERE idClient=? "; 
			PreparedStatement ps = conn.prepareStatement(requete);
			ps.setInt(1, c.getIdClient());
			ps.executeUpdate();
			//5 -  récupérer le résultat
			//6 -  libérer les ressources
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
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
	public void creationConseiller(EmployeConseiller ec) {
		try {
			//1 -  charger le pilote
			Class.forName("com.mysql.jdbc.Driver");
			//2 -  adresse de la BDD
			String adresse = "jdbc:mysql://localhost:3306/proxibanque_dnr";
			String login = "root";
			String mdp = "";
			//3 -  se connecter à la BDD
			Connection conn = DriverManager.getConnection(adresse,login,mdp);
			//4 -  préparer et envoyer requete 
			//String requete = "INSERT INTO Client (nom, prenom, email, login, mdp,agenceEmploye_Id) VALUES (?,?,?,?,?,?) "; 
			String requete = "INSERT INTO Employe (nom, prenom, email, login, mdp) VALUES (?,?,?,?,?) "; 

			PreparedStatement ps = conn.prepareStatement(requete);
			ps.setString(1, ec.getNom()); 
			ps.setString(2, ec.getPrenom());
			ps.setString(3, ec.getEmail());
			ps.setString(4, ec.getLogin());
			ps.setString(5, ec.getMdp());
			//ps.setLong(6,ec.getlAgence());
			ps.executeUpdate();
			//5 -  récupérer le résultat
			//6 -  libérer les ressources
			ps.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("CREATION CONSEILLER");
	}

	@Override
	public void suppressionConseiller(EmployeConseiller ec) {
		try {
			//1 -  charger le pilote
			Class.forName("com.mysql.jdbc.Driver");
			//2 -  adresse de la BDD
			String adresse = "jdbc:mysql://localhost:3306/proxibanque_dnr";
			String login = "root";
			String mdp = "";
			//3 -  se connecter à la BDD
			Connection conn = DriverManager.getConnection(adresse,login,mdp);
			//4 -  préparer et envoyer requete 
			String requete = "DELETE FROM Employe WHERE idEmploye=? "; 
			PreparedStatement ps = conn.prepareStatement(requete);
			ps.setInt(1, ec.getIdConseiller());
			ps.executeUpdate();
			//5 -  récupérer le résultat
			//6 -  libérer les ressources
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
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
