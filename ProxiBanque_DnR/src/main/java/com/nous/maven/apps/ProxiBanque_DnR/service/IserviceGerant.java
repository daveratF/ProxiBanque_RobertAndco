package com.nous.maven.apps.ProxiBanque_DnR.service;

import fr.moi.FilRouge.metier.EmployeGerant;
/**
 * Le g�rant poss�de les m�mes traces que le conseiller (extends IserviceConseiller)
 * ainsi que certaine n�cessitant un niveau d'accr�ditation suffisant
 * @author moi2
 *
 */
public interface IserviceGerant extends IserviceConseiller{
	public void seConnecter(String login, String mdp);
	public void visualisationTransaction(EmployeGerant eg);
}
