package com.nous.maven.apps.ProxiBanque_DnR.metier;

import java.util.ArrayList;
import java.util.List;
/**
 * La class Client permet d'obtenir les informations li�es aux cli�nts de l'agence, 
 * ainsi que les op�rations p�rmetant aux conseiller de travailler
 * @author moi2
 *
 */
public abstract class Client {
	//attribut
	private int idClient;
	private String nom;
	private String prenom;
	private String adresse;
	private String ville;
	private int codePostal;
	private int telephone;
	private EmployeConseiller sonConseiller;
	private List<Compte> sesComptes = new ArrayList<Compte>();
	private int plafond;
	//getters and setters
	
	public String getNom() {
		return nom;
	}
	public int getIdClient() {
		return idClient;
	}
	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}
	public List<Compte> getSesComptes() {
		return sesComptes;
	}
	public void setSesComptes(List<Compte> sesComptes) {
		this.sesComptes = sesComptes;
	}
	public EmployeConseiller getSonConseiller() {
		return sonConseiller;
	}
	public void setSonConseiller(EmployeConseiller sonConseiller) {
		this.sonConseiller = sonConseiller;
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
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public int getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}
	public int getTelephone() {
		return telephone;
	}
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	public int getPlafond() {
		return plafond;
	}
	public void setPlafond(int plafond) {
		this.plafond = plafond;
	}
	public Client() {
		super();
	}
	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", ville=" + ville
				+ ", codePostal=" + codePostal + ", telephone=" + telephone + ", sonConseiller=" + sonConseiller
				+ ", sesComptes=" + sesComptes + ", plafond=" + plafond + "]";
	}
}
