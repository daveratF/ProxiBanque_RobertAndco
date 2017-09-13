package com.nous.maven.apps.ProxiBanque_DnR.presentation;

import com.nous.maven.apps.ProxiBanque_DnR.service.IserviceConseiller;
import com.nous.maven.apps.ProxiBanque_DnR.service.ServiceConseiller;

public class Lanceur {

	public static void main(String[] args) {
		IserviceConseiller isc = new ServiceConseiller();
		isc.creationClient(null);
		isc.creationCompte(null);

	}
}
