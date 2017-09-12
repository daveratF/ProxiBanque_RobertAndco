package com.nous.maven.apps.ProxiBanque_DnR.metier;
/**
 * La class Employe permet de regrouper les informations relatives aux membres de l'agence, 
 * ainsi que les op�rations entre les diff�rents employ�s.
 * C'est une class de type m�re.
 * @author moi2
 *
 */
public abstract class Employe {
	//attribut
	private int idEmploye;
	private String nom;
	private String prenom;
	private String email;
	private String login;
	private String mdp;
	private Agence lAgence;
	//getters and setters
	
	
	public String getNom() {
		return nom;
	}
	public int getIdEmploye() {
		return idEmploye;
	}
	public void setIdEmploye(int idEmploye) {
		this.idEmploye = idEmploye;
	}
	public Agence getlAgence() {
		return lAgence;
	}
	public void setlAgence(Agence lAgence) {
		this.lAgence = lAgence;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	
	public Employe() {
		super();
	}
	
	
	
}
