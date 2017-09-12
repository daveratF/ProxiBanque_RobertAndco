package com.nous.maven.apps.ProxiBanque_DnR.presentation;

import com.nous.maven.apps.ProxiBanque_DnR.metier.Carte;
import com.nous.maven.apps.ProxiBanque_DnR.service.IserviceAuditeur;
import com.nous.maven.apps.ProxiBanque_DnR.service.IserviceConseiller;
import com.nous.maven.apps.ProxiBanque_DnR.service.IserviceGerant;
import com.nous.maven.apps.ProxiBanque_DnR.service.ServiceAuditeur;
import com.nous.maven.apps.ProxiBanque_DnR.service.ServiceConseiller;
import com.nous.maven.apps.ProxiBanque_DnR.service.ServiceGerant;

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
		
		isg.seConnecter("Patron", "azeza");
		isa.auditerCompte();
		isa.seConnecter("AUTDIT", "azaaasssssssssss");	
	}
}
