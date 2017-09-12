package com.nous.maven.apps.ProxiBanque_DnR.metier;
/**
 * La class Carte permet d'avoir les caract�ristiques des cartes li�es aux comtpes de clients
 * C'est une class de type m�re.
 * @author moi2
 *
 */
public class Carte {
	//attribut
	private int numero;
	private Compte sonComtpe;

	
	//getters and setters
	public int getNumero() {
		return numero;
	}

	public Compte getSesCartes() {
		return sonComtpe;
	}

	public void setSesCartes(Compte sesCartes) {
		this.sonComtpe = sesCartes;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	public Carte() {
		super();
	}

	@Override
	public String toString() {
		return "Carte [numero=" + numero + ", sesCartes=" + sonComtpe + "]";
	}
}
