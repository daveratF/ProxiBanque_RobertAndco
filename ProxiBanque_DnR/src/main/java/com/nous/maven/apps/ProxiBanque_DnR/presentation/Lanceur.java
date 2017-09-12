package com.nous.maven.apps.ProxiBanque_DnR.presentation;

import fr.moi.FilRouge.metier.Carte;
import fr.moi.FilRouge.service.IserviceAuditeur;
import fr.moi.FilRouge.service.IserviceConseiller;
import fr.moi.FilRouge.service.IserviceGerant;
import fr.moi.FilRouge.service.ServiceAuditeur;
import fr.moi.FilRouge.service.ServiceConseiller;
import fr.moi.FilRouge.service.ServiceGerant;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IserviceConseiller isc = new ServiceConseiller();
		IserviceGerant isg = new ServiceGerant();
		IserviceAuditeur isa = new ServiceAuditeur();

		isc.creationCarte(new Carte());
		isc.seConnecter("toto", "oui");
		isc.creationCompte();
		isc.creationClient();
		isc.modificationCompte(null);
		isc.lectureCompte(null);
		
		isg.visualisationTransaction(null);
		isg.seConnecter("Patron", "azeza");
		isa.auditerCompte(null);
		isa.seConnecter("AUTDIT", "azaaasssssssssss");
		
	}

}
