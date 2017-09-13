package com.nous.maven.apps.ProxiBanque_DnR.metier;

import java.util.ArrayList;
import java.util.List;
/**
 * La classe agence nous indique le num�ro alphabum�rique de l'agence cibl�e, ainsi que le nombre et le type d'employ�
 * qu'elle poss�de
 * @author moi2
 *
 */
public class Agence {
	//attribut
	private int idAgence;
	private String numeroAgence;
	private List<Employe> employes = new ArrayList<Employe>();
	private String dateCreation;
	//getters and setters
	
	
	public List<Employe> getEmployes() {
		return employes;
	}

	public int getIdAgence() {
		return idAgence;
	}

	public void setIdAgence(int idAgence) {
		this.idAgence = idAgence;
	}

	public void setEmployes(List<Employe> employes) {
		this.employes = employes;
	}
	

	public String getNumeroAgence() {
		return numeroAgence;
	}

	public void setNumeroAgence(String numeroAgence) {
		this.numeroAgence = numeroAgence;
	}

	public String getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(String dateCreation) {
		this.dateCreation = dateCreation;
	}

	@Override
	public String toString() {
		return "Agence [idAgence=" + idAgence + ", numeroAgence=" + numeroAgence + ", employes=" + employes
				+ ", dateCreation=" + dateCreation + "]";
	}

}
