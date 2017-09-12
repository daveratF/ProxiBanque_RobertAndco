package com.nous.maven.apps.ProxiBanque_DnR.metier;
/**
 * La class Carte permet d'avoir les caract�ristiques des cartes li�es aux comtpes de clients
 * C'est une class de type m�re.
 * @author moi2
 *
 */
public abstract class Carte {
	//attribut
	private int idCarte;
	private Compte sonComtpe;

	
	//getters and setters
	
	public Compte getSesCartes() {
		return sonComtpe;
	}

	public int getIdCarte() {
		return idCarte;
	}

	public void setIdCarte(int idCarte) {
		this.idCarte = idCarte;
	}

	public Compte getSonComtpe() {
		return sonComtpe;
	}

	public void setSonComtpe(Compte sonComtpe) {
		this.sonComtpe = sonComtpe;
	}

	public void setSesCartes(Compte sesCartes) {
		this.sonComtpe = sesCartes;
	}
	
	public Carte() {
		super();
	}

	@Override
	public String toString() {
		return "Carte [idCarte=" + idCarte + ", sonComtpe=" + sonComtpe + "]";
	}

	
}
