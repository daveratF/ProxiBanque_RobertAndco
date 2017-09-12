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
	private String numeroAgence;
	private List<Employe> employes = new ArrayList<Employe>();
	private String dateCreation;
	//getters and setters
	
	public String getNumeroIdentification() {
		return numeroAgence;
	}

	public List<Employe> getEmployes() {
		return employes;
	}

	public void setEmployes(List<Employe> employes) {
		this.employes = employes;
	}

	public void setNumeroIdentification(String numeroIdentification) {
		this.numeroAgence = numeroIdentification;
	}
	
	
	public Agence(String numeroAgence) {
		super();
		this.numeroAgence = numeroAgence;
	}

	@Override
	public String toString() {
		return "Agence [numeroIdentification=" + numeroAgence + "]";
	}
	
}
