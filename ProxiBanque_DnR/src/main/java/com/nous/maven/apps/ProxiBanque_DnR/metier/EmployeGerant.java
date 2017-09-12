package com.nous.maven.apps.ProxiBanque_DnR.metier;

import java.util.ArrayList;
import java.util.List;
/**
 * La class EmployeGerant regroupe toutes les informations relative au g�rant de l'agence, 
 * ainsi que les diff�rentes op�rations dont il dispose vis � vis de ses employ�s et des clients/comptes.
 * C'est une class de type fille.
 * @author moi2
 *
 */
public class EmployeGerant extends Employe {
	private List<EmployeConseiller> conseillers = new ArrayList<EmployeConseiller>();
	private int idGerant;


	public List<EmployeConseiller> getConseillers() {
		return conseillers;
	}

	public void setConseillers(List<EmployeConseiller> conseillers) {
		this.conseillers = conseillers;
	}

	@Override
	public String toString() {
		return "EmployeGerant [conseillers=" + conseillers + "]";
	}
	
}
