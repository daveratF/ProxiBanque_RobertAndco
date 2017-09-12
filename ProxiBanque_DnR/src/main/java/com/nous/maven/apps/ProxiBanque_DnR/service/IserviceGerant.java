package com.nous.maven.apps.ProxiBanque_DnR.service;

import com.nous.maven.apps.ProxiBanque_DnR.metier.EmployeConseiller;

/**
 * Le g�rant poss�de les m�mes traces que le conseiller (extends IserviceConseiller)
 * ainsi que certaine n�cessitant un niveau d'accr�ditation suffisant
 * @author moi2
 *
 */
public interface IserviceGerant extends IserviceConseiller{
	public void seConnecter(String login, String mdp);
	//Conseiller
		public void creationConseiller();
		public void suppressionConseiller(EmployeConseiller ec);
		public void lireConseiller(EmployeConseiller ec);
		public void modifierConseiller(EmployeConseiller ec);
}
