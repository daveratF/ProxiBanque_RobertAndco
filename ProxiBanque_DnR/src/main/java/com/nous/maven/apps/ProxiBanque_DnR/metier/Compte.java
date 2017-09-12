package com.nous.maven.apps.ProxiBanque_DnR.metier;

import java.util.ArrayList;
import java.util.List;

/**
 * La class Compte regroupe les informations relative aux comptes des clients de l'agence, 
 * ainsi que les op�rations effectuables par les acteurs du system ProxyBanque SI
 * C'est une class de type m�re.
 * @author moi2
 *
 */
public abstract class Compte {
	//attribut
	private double solde;
	private int code;
	private String dateOuverture;
	private Client leClient;
	private List<Carte> sesCartes= new ArrayList<Carte>();
	//getters and setters
	public double getSolde() {
		return solde;
	}
	
	public List<Carte> getSesCartes() {
		return sesCartes;
	}

	public void setSesCartes(List<Carte> sesCartes) {
		this.sesCartes = sesCartes;
	}

	public Client getLeClient() {
		return leClient;
	}
	public void setLeClient(Client leClient) {
		this.leClient = leClient;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getDateOuverture() {
		return dateOuverture;
	}
	public void setDateOuverture(String dateOuverture) {
		this.dateOuverture = dateOuverture;
	}
	
	public Compte() {
		super();
	}

	@Override
	public String toString() {
		return "Compte [solde=" + solde + ", code=" + code + ", dateOuverture=" + dateOuverture + ", leClient="
				+ leClient + ", sesCartes=" + sesCartes + "]";
	}
	
	
}
