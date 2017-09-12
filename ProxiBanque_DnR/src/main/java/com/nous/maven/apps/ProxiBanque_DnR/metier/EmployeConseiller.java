package com.nous.maven.apps.ProxiBanque_DnR.metier;
/**
 * La class EmployeConseiller regroupe les informations li�es aux conseiller client de l'agence, 
 * ainsi que les diff�rentes methodes d�crivant les op�rations dont ils disposent pour travailler.
 * C'est une class de type fille.
 */
import java.util.ArrayList;
import java.util.List;

public class EmployeConseiller extends Employe {
		//attribut
		private List<Client> clients = new ArrayList<Client>();
		private EmployeGerant Gerant;
		private int idConseiller;

		//getters and setters
		public List<Client> getClients() {
			return clients;
		}

		public void setClients(List<Client> clients) {
			this.clients = clients;
		}


}
