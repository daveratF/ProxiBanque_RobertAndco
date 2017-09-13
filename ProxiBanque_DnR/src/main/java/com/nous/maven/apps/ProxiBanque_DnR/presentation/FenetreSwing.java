package com.nous.maven.apps.ProxiBanque_DnR.presentation;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import com.nous.maven.apps.ProxiBanque_DnR.metier.Carte;
import com.nous.maven.apps.ProxiBanque_DnR.metier.CarteVisaElectron;
import com.nous.maven.apps.ProxiBanque_DnR.metier.CarteVisaPremier;
import com.nous.maven.apps.ProxiBanque_DnR.metier.Client;
import com.nous.maven.apps.ProxiBanque_DnR.metier.ClientEntreprise;
import com.nous.maven.apps.ProxiBanque_DnR.metier.ClientParticulier;
import com.nous.maven.apps.ProxiBanque_DnR.metier.Compte;
import com.nous.maven.apps.ProxiBanque_DnR.metier.CompteCourant;
import com.nous.maven.apps.ProxiBanque_DnR.metier.CompteEpargne;
import com.nous.maven.apps.ProxiBanque_DnR.service.IserviceConseiller;
import com.nous.maven.apps.ProxiBanque_DnR.service.ServiceConseiller;

public class FenetreSwing extends JFrame{
	private JPanel CG = new JPanel();
	private JPanel G = new JPanel();
	private JPanel A = new JPanel();
	//Onglets C-G
		//Creer
	private JPanel Creer = new JPanel();
	private JPanel Modifier = new JPanel();
	private JPanel Lire = new JPanel();
	private JPanel Supprimer = new JPanel();
	private JPanel Virement = new JPanel();
	private JPanel Patrimoine = new JPanel();
	private JPanel Credit = new JPanel();
	private JPanel Cl = new JPanel();
	private JPanel Cpt = new JPanel();
	private JPanel Cte = new JPanel();
		//Supprimer
	private JPanel Cl2 = new JPanel();
	private JPanel Cpt2 = new JPanel();
	private JPanel Cte2 = new JPanel();
	//Creation Client
	private JLabel jLnom = new JLabel("nom");
	private JLabel jLprenom = new JLabel("prenom");
	private JLabel jLadresse = new JLabel("adresse");
	private JLabel jLville = new JLabel("ville");
	private JLabel jLcodePostal = new JLabel("codePostal");
	private JLabel jLtelephone = new JLabel("telephone");
	private JTextField jTnom = new JTextField(12);
	private JTextField jTprenom = new JTextField(12);
	private JTextField jTadresse = new JTextField(12);
	private JTextField jTville = new JTextField(12);
	private JTextField jTcodePostal = new JTextField(12);
	private JTextField jTtelephone = new JTextField(12);
	private JButton jBValider = new JButton("Valider");
	//Creation Compte
	private JLabel jLsolde = new JLabel("solde");
	private JLabel jLcode= new JLabel("code");
	private JLabel jLdateOuverture = new JLabel("dateOuverture");
	private JTextField jTsolde = new JTextField(12);
	private JTextField jTcode = new JTextField(12);
	private JTextField jTdateOuverture= new JTextField(12);
	private JButton jBValider2 = new JButton("Valider");
	//Creation Carte
	private JLabel jLnumCarte = new JLabel("numCarte");
	private JTextField jTnumCarte = new JTextField(12);
	private JButton jBValider3 = new JButton("Valider");
	//Supprimer Client
	private JLabel jLidCl = new JLabel("Identifiant Client");
	private JTextField jTidCl= new JTextField(12);
	private JButton jBSuppr = new JButton("Supprimer");
	//Supprimer Compte
	private JLabel jLCpt = new JLabel("Numéro de Compte");
	private JTextField jTCpt= new JTextField(12);
	private JButton jBSuppr2 = new JButton("Supprimer");
	//Supprimer Carte
	private JLabel jLCte = new JLabel("Numéro de Carte");
	private JTextField jTCte= new JTextField(12);
	private JButton jBSuppr3 = new JButton("Supprimer");
	
	private IserviceConseiller isc = new ServiceConseiller();
	
	public FenetreSwing() {
		setTitle("PROXI-BANQUE");
		setSize(800, 600);
		setResizable(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Les onglets
		JTabbedPane Creer = new JTabbedPane();
		Creer.addTab("Client", Cl);
		Creer.addTab("Compte", Cpt);
		Creer.addTab("Carte", Cte);
		
		//Onlget Creation
			//Creation Client
		Cl.add(jLnom);
		Cl.add(jTnom);
		Cl.add(jLprenom);
		Cl.add(jTprenom);
		Cl.add(jLadresse);
		Cl.add(jTadresse);
		Cl.add(jLville);
		Cl.add(jTville);
		Cl.add(jLcodePostal);
		Cl.add(jTcodePostal);
		Cl.add(jLtelephone);
		Cl.add(jTtelephone);
		jBValider.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Je crée un client dans la BDD");
				Client cp = new ClientParticulier();
				Client ce = new ClientEntreprise();
				cp.setNom(jTnom.getText());
				cp.setPrenom(jTprenom.getText());
				cp.setAdresse(jTadresse.getText());
				cp.setVille(jTville.getText());
				cp.setCodePostal(Integer.parseInt(jTcodePostal.getText()));
				cp.setTelephone(Integer.parseInt(jTtelephone.getText()));
				ce.setNom(jTnom.getText());
				ce.setPrenom(jTprenom.getText());
				ce.setAdresse(jTadresse.getText());
				ce.setVille(jTville.getText());
				ce.setCodePostal(Integer.parseInt(jTcodePostal.getText()));
				ce.setTelephone(Integer.parseInt(jTtelephone.getText()));
				isc.creationClient(cp);
				isc.creationClient(ce);
				jTnom.setText("");
				jTprenom.setText("");
				jTadresse.setText("");
				jTville.setText("");
				jTcodePostal.setText("");
				jTtelephone.setText("");
			}
		});
		Cl.add(jBValider);
			//Creation Compte
		Cpt.add(jLsolde);
		Cpt.add(jTsolde);
		Cpt.add(jLcode);
		Cpt.add(jTcode);
		Cpt.add(jLdateOuverture);
		Cpt.add(jTdateOuverture);
		jBValider2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Je crée un compte dans la BDD");
				Compte cc = new CompteCourant(1000);
				Compte ce = new CompteEpargne(0.03);
				cc.setSolde(Integer.parseInt(jTsolde.getText()));
				cc.setCode(Integer.parseInt(jTcode.getText()));
				cc.setDateOuverture(jTdateOuverture.getText());
				ce.setSolde(Integer.parseInt(jTsolde.getText()));
				ce.setCode(Integer.parseInt(jTcode.getText()));
				ce.setDateOuverture(jTdateOuverture.getText());
				isc.creationCompte(cc);
				isc.creationCompte(ce);
				jTsolde.setText("");
				jTdateOuverture.setText("");
			}
		});
		Cpt.add(jBValider2);
			//Creation Carte
		Cte.add(jLnumCarte);
		Cte.add(jTnumCarte);
		jBValider3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Je crée une carte dans la BDD");
				Carte cp = new CarteVisaPremier();
				Carte ce = new CarteVisaElectron();
				cp.setIdCarte(Integer.parseInt(jTnumCarte.getText()));
				ce.setIdCarte(Integer.parseInt(jTnumCarte.getText()));
				isc.creationCarte(cp);
				isc.creationCarte(ce);
				jTnumCarte.setText("");
			}
		});
		Cte.add(jBValider3);
			//Ajout de tous les onglets
		Creer.addTab("CLient", Cl2);
		Creer.addTab("Compte", Cpt2);
		Creer.addTab("Carte", Cte2);
		//Onglet Supprimer
		JTabbedPane Suppr = new JTabbedPane();
		Suppr.addTab("Client", Cl2);
		Suppr.addTab("Compte", Cpt2);
		Suppr.addTab("Carte", Cte2);
			//Supprimer client
		Cl2.add(jLidCl);
		Cl2.add(jTidCl);
		jBSuppr.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Je supprime un client de la BDD");
				Client cp = new ClientParticulier();
				Client ce = new ClientEntreprise();
				isc.suppressionClient(cp);
				isc.suppressionClient(ce);
				jTidCl.setText("");
			}
		});
		Cl2.add(jBSuppr);
			//Supprimer Compte
		Cpt2.add(jLCpt);
		Cpt2.add(jTCpt);
		jBSuppr2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Je supprime un compte de la BDD");
				Compte cc = new CompteCourant(1000);
				Compte ce = new CompteEpargne(0.03);
				isc.suppressionCompte(cc);
				isc.suppressionCompte(ce);
				jTidCl.setText("");
			}
		});
		Cpt2.add(jBSuppr2);
			//Supprimer Carte
		Cte2.add(jLCte);
		Cte2.add(jTCte);
		jBSuppr3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Je supprime un compte de la BDD");
				Carte cp = new CarteVisaPremier();
				Carte ce = new CarteVisaElectron();
				isc.suppressionCarte(cp);
				isc.suppressionCarte(ce);
				jTidCl.setText("");
			}
		});
		Cte2.add(jBSuppr3);
		//Ajout de tous les onglets
				Suppr.addTab("CLient", Cl2);
				Suppr.addTab("Compte", Cpt2);
				Suppr.addTab("Carte", Cte2);
		
		JTabbedPane CG = new JTabbedPane();
		CG.addTab("Creer", Creer);
		CG.addTab("Modifier",Modifier);
		CG.addTab("Lire", Lire);
		CG.addTab("Supprimer", Supprimer);
		CG.addTab("Virement", Virement);
		CG.addTab("Patrimoine", Patrimoine);
		CG.addTab("Credit", Credit);
			
		JTabbedPane onglets = new JTabbedPane();
		onglets.addTab("Conseiller/Gérant", CG);
		onglets.addTab("Gérant", G);
		onglets.addTab("Auditeur", A);
			getContentPane().add(onglets);
	}
	
	public static void main(String[] args) {
		FenetreSwing f = new FenetreSwing();
		f.setVisible(true);
	}

}
