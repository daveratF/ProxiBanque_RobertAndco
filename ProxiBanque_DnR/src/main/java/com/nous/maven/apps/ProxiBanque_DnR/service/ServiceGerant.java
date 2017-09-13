package com.nous.maven.apps.ProxiBanque_DnR.service;

import java.util.List;

import com.nous.maven.apps.ProxiBanque_DnR.dao.DAO;
import com.nous.maven.apps.ProxiBanque_DnR.dao.Idao;
import com.nous.maven.apps.ProxiBanque_DnR.metier.Agence;
import com.nous.maven.apps.ProxiBanque_DnR.metier.Employe;
import com.nous.maven.apps.ProxiBanque_DnR.metier.EmployeConseiller;
import com.nous.maven.apps.ProxiBanque_DnR.metier.EmployeGerant;

public class ServiceGerant extends ServiceConseiller implements IserviceGerant{
	private Idao dao = new DAO();

	@Override
	public void creationConseiller(EmployeConseiller ec) {
		dao.creationConseiller(ec);
	}

	@Override
	public void suppressionConseiller(int idConseiller) {
		dao.suppressionConseiller(idConseiller);
	}

	
	@Override
	public void modifierConseiller(EmployeConseiller ec) {
		dao.modifierConseiller(ec);
	}

	@Override
	public void attributionEmploye(Agence a, Employe e) {
		dao.attributionEmploye(a, e);
	}

	@Override
	public void attributionConseiller(EmployeGerant eg, EmployeConseiller ec) {
		dao.attributionConseiller(eg, ec);
	}

	@Override
	public List<Employe> lesEmployes(int idEmploye) {
		return dao.lesEmployes(idEmploye);
	}

	@Override
	public List<EmployeConseiller> sesConseillers(int idConseiller) {
		return dao.sesConseillers(idConseiller);
	}

	@Override
	public List<EmployeConseiller> lectureConseiller() {
		return dao.lectureConseiller();
	}
}
