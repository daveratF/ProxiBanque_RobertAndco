package com.nous.maven.apps.ProxiBanque_DnR.service;

import com.nous.maven.apps.ProxiBanque_DnR.dao.DAO;
import com.nous.maven.apps.ProxiBanque_DnR.dao.Idao;
import com.nous.maven.apps.ProxiBanque_DnR.metier.EmployeConseiller;

public class ServiceGerant extends ServiceConseiller implements IserviceGerant{
	private Idao dao = new DAO();

	@Override
	public void creationConseiller() {
		dao.creationConseiller();
	}

	@Override
	public void suppressionConseiller(EmployeConseiller ec) {
		dao.suppressionConseiller(ec);
	}

	@Override
	public void lireConseiller(EmployeConseiller ec) {
		dao.lireConseiller(ec);
	}

	@Override
	public void modifierConseiller(EmployeConseiller ec) {
		dao.modifierConseiller(ec);
	}
}
