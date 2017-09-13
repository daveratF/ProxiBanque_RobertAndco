package com.nous.maven.apps.ProxiBanque_DnR.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.nous.maven.apps.ProxiBanque_DnR.metier.Agence;
import com.nous.maven.apps.ProxiBanque_DnR.metier.Carte;
import com.nous.maven.apps.ProxiBanque_DnR.metier.Client;
import com.nous.maven.apps.ProxiBanque_DnR.metier.ClientEntreprise;
import com.nous.maven.apps.ProxiBanque_DnR.metier.ClientParticulier;
import com.nous.maven.apps.ProxiBanque_DnR.metier.Compte;
import com.nous.maven.apps.ProxiBanque_DnR.metier.CompteCourant;
import com.nous.maven.apps.ProxiBanque_DnR.metier.CompteEpargne;
import com.nous.maven.apps.ProxiBanque_DnR.metier.Employe;
import com.nous.maven.apps.ProxiBanque_DnR.metier.EmployeAuditeur;
import com.nous.maven.apps.ProxiBanque_DnR.metier.EmployeConseiller;
import com.nous.maven.apps.ProxiBanque_DnR.metier.EmployeGerant;

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
	public void suppressionCompte(int idCompte) {
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
			ps.setInt(1, idCompte);
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
			ps.setInt(1, cte.getNumeroCarte()); 
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
	public void suppressionCarte(int idCarte) {
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
			ps.setInt(1, idCarte);
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
			ps.setString(5, c.getCodePostal());
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
	public void suppressionClient(int idClient) {
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
			ps.setInt(1, idClient);
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
			String requete = "UPDATE Client SET nom=?, prenom=?, telephone=?, adresse=?, codePostal=?, ville =? WHERE idClient=? "; 
			PreparedStatement ps = conn.prepareStatement(requete);
			ps.setString(1, c.getNom()); 
			ps.setString(2, c.getPrenom());
			ps.setInt(3, c.getTelephone());
			ps.setString(4, c.getAdresse());
			ps.setString(5, c.getCodePostal());
			ps.setString(6, c.getVille());
			ps.setInt(7, c.getIdClient());

			ps.executeUpdate();
			//5 -  récupérer le résultat
			//6 -  libérer les ressources
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("VISUALISATION CLIENT");
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
	public void suppressionConseiller(int idConseiller) {
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
			ps.setInt(1, idConseiller);
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
			String requete = "UPDATE Employe SET nom=?, prenom=?, email=?, login=?, mdp=? WHERE idEmploye=? "; 
			PreparedStatement ps = conn.prepareStatement(requete);
			ps.setString(1, ec.getNom()); 
			ps.setString(2, ec.getPrenom());
			ps.setString(3, ec.getEmail());
			ps.setString(4, ec.getLogin());
			ps.setString(5, ec.getMdp());
			ps.setInt(6, ec.getIdConseiller());

			ps.executeUpdate();
			//5 -  récupérer le résultat
			//6 -  libérer les ressources
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("MODIF CONSEILLER");
	}

	@Override
	public void auditerCompte() {
		System.out.println("AUDIT COMPTE");
	}

	@Override
	public void attributionEmploye(Agence a, Employe e) {
		
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
				String requete = "UPDATE Employe SET agenceEmploye_Id=? WHERE idEmploye= ?"; 
				PreparedStatement ps = conn.prepareStatement(requete);
				ps.setString(1, a.getNumeroAgence());
				ps.setInt(2, e.getIdEmploye());
				//5 -  récupérer le résultat
				//6 -  libérer les ressources
				ps.close();
				conn.close();
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
	}

	@Override
	public void attributionConseiller(EmployeGerant eg, EmployeConseiller ec) {
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
			String requete = "UPDATE Employe SET idGerant=? WHERE idEmploye= ?"; 
			PreparedStatement ps = conn.prepareStatement(requete);
			ps.setInt(1, eg.getIdGerant());
			ps.setInt(2, ec.getIdConseiller() );
			//5 -  récupérer le résultat
			//6 -  libérer les ressources
			ps.close();
			conn.close();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}		
	}

	@Override
	public void attributionClient(Employe e, Client c) {
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
			String requete = "UPDATE Client SET conseillerClient_Id=? WHERE idClient= ?"; 
			PreparedStatement ps = conn.prepareStatement(requete);
			ps.setInt(1, e.getIdEmploye());
			ps.setInt(2, c.getIdClient());
			//5 -  récupérer le résultat
			//6 -  libérer les ressources
			ps.close();
			conn.close();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}				
	}

	@Override
	public void attributionCompte(Client c, Compte cpt) {
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
			String requete = "UPDATE Compte SET compteClient_Id=? WHERE idCompte= ?"; 
			PreparedStatement ps = conn.prepareStatement(requete);
			ps.setInt(1, c.getIdClient());
			ps.setInt(2, cpt.getCode());
			//5 -  récupérer le résultat
			//6 -  libérer les ressources
			ps.close();
			conn.close();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}			
	}

	@Override
	public void attributionCarte(Compte cpt, Carte cte) {
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
			String requete = "UPDATE Carte SET compte_Id	=? WHERE idCarte= ?"; 
			PreparedStatement ps = conn.prepareStatement(requete);
			ps.setInt(1, cpt.getCode());
			ps.setInt(2, cte.getIdCarte());
			//5 -  récupérer le résultat
			//6 -  libérer les ressources
			ps.close();
			conn.close();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}			
	}

	@Override
	public List<Employe> lesEmployes(int idEmploye) {
		List<Employe> lesEmployes =new ArrayList<Employe>();
		EmployeConseiller ec = new EmployeConseiller();
		EmployeGerant eg = new EmployeGerant();
		EmployeAuditeur ea = new EmployeAuditeur();
		try {
		//1- charger le pilote
		Class.forName("com.mysql.jdbc.Driver");
		//2- adresse de la base de données
		String adresse="jdbc:mysql://localhost:3306/proxibanque_dnr";
		String login="root";
		String mdp="";
		//3- connecter à la base 
		Connection conn = DriverManager.getConnection(adresse, login, mdp);
		//4- préparer en envoyer la requete 
		String requete="SELECT * \r\n" + 
				"FROM Agence,Employe \r\n" + 
				"WHERE Agence.idAgence = Emlploye.agenceEmploye_Id AND idAgence= ? ";
				//requete SQL
		PreparedStatement ps= conn.prepareStatement(requete); //prépare la requete
		ps.setInt(1, idEmploye);
		//5- récuperer le resultat
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			if(rs.getInt("idEmploye")== rs.getInt("idGerant")) {
				eg.setIdGerant(rs.getInt("idGerant")); 
				eg.setNom(rs.getString("nom"));
				eg.setPrenom(rs.getString("prenom"));
				lesEmployes.add(eg);
				int iddeAgence=rs.getInt("agenceEmploye_Id");
				Agence a = new Agence();
				a.setIdAgence(iddeAgence);
				a.setNumeroAgence(rs.getString("numAgence"));
				a.setDateCreation(rs.getString("dateCreation"));
				eg.setlAgence(a);
			}
			else {
				ec.setIdConseiller(rs.getInt("idEmploye")); 
				ec.setNom(rs.getString("nom"));
				ec.setPrenom(rs.getString("prenom"));
				lesEmployes.add(ec);
				int iddeAgence=rs.getInt("agenceEmploye_Id");
				Agence a = new Agence();
				a.setIdAgence(iddeAgence);
				a.setNumeroAgence(rs.getString("numAgence"));
				a.setDateCreation(rs.getString("dateCreation"));
				ec.setlAgence(a);
			}
		}
		//6- liberer les ressources
		ps.close();
		conn.close();
		} catch (Exception e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
		}
		return lesEmployes;
	}

	@Override
	public List<EmployeConseiller> sesConseillers(int idConseiller) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Client> sesClients(int idClient) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Compte> sesComtpes(int idComtpe) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Carte> sesCartes(int idCarte) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Compte> lectureCompte() {
		List<Compte> lcpt = new ArrayList<Compte>();
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
			String requete = "SELECT * FROM Compte"; 
			PreparedStatement ps = conn.prepareStatement(requete);
			//5 -  récupérer le résultat
			ResultSet rs = ps.executeQuery(); 
			while(rs.next()) {				 
				CompteCourant cptC = new CompteCourant();
				CompteEpargne cptE = new CompteEpargne();
				if(rs.getInt("idCompte")== rs.getInt("idEpargne")){
					cptE.setCode(rs.getInt("idEpargne"));		
					cptE.setDateOuverture(rs.getString("dateOuverture"));
					cptE.setSolde(rs.getDouble("solde"));
					cptE.setTaux(rs.getDouble("taux"));
					lcpt.add(cptE);		    
				} else {
					cptC.setCode(rs.getInt("idEpargne"));		
					cptC.setDateOuverture(rs.getString("dateOuverture"));
					cptC.setSolde(rs.getDouble("solde"));
					cptC.setDecouvert(rs.getInt("decouvert"));
					lcpt.add(cptC);
				}
			}
			//6 -  libérer les ressources
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lcpt;
	}

	@Override
	public List<Client> lectureClient() {
		List<Client> lc = new ArrayList<Client>();
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
			String requete = "SELECT * FROM Client"; 
			PreparedStatement ps = conn.prepareStatement(requete);
			//5 -  récupérer le résultat
			ResultSet rs = ps.executeQuery(); 
			while(rs.next()) {				 
				ClientEntreprise cetp = new ClientEntreprise();	
				ClientParticulier cpat= new ClientParticulier();	
				if(rs.getInt("idClient")== rs.getInt("idParticulier")){
					cpat.setIdParticulier(rs.getInt("idParticulier"));		
					cpat.setNom(rs.getString("nom"));
					cpat.setPrenom(rs.getString("prenom"));
					cpat.setTelephone(rs.getInt("telephone"));
					cpat.setAdresse(rs.getString("adresse"));
					cpat.setCodePostal(rs.getString("codePostal"));
					cpat.setVille(rs.getString("ville"));
					lc.add(cpat);		    
				} else {
					cetp.setIdEntreprise(rs.getInt("idParticulier"));		
					cetp.setNom(rs.getString("nom"));
					cetp.setPrenom(rs.getString("prenom"));
					cetp.setTelephone(rs.getInt("telephone"));
					cetp.setAdresse(rs.getString("adresse"));
					cetp.setCodePostal(rs.getString("codePostal"));
					cetp.setVille(rs.getString("ville"));
					lc.add(cetp);
				}
			}
			//6 -  libérer les ressources
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lc;
	}

	@Override
	public List<EmployeConseiller> lectureConseiller() {
		List<EmployeConseiller> lec = new ArrayList<EmployeConseiller>();
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
			String requete = "SELECT * FROM Employe"; 
			PreparedStatement ps = conn.prepareStatement(requete);
			//5 -  récupérer le résultat
			ResultSet rs = ps.executeQuery(); 
			while(rs.next()) {				 
				EmployeConseiller ec = new EmployeConseiller();	
				ec.setIdConseiller(rs.getInt("idEmploye"));		
				ec.setNom(rs.getString("nom"));
				ec.setPrenom(rs.getString("prenom"));
				ec.setEmail(rs.getString("email"));
				ec.setLogin(rs.getString("login"));
				lec.add(ec);		    
			}
			//6 -  libérer les ressources
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lec;
	}	
}
