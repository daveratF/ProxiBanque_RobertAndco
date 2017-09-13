package com.nous.maven.apps.ProxiBanque_DnR.presentation;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
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
import com.nous.maven.apps.ProxiBanque_DnR.metier.Employe;
import com.nous.maven.apps.ProxiBanque_DnR.metier.EmployeConseiller;
import com.nous.maven.apps.ProxiBanque_DnR.service.IserviceConseiller;
import com.nous.maven.apps.ProxiBanque_DnR.service.IserviceGerant;
import com.nous.maven.apps.ProxiBanque_DnR.service.ServiceConseiller;
import com.nous.maven.apps.ProxiBanque_DnR.service.ServiceGerant;

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
		//Modifier
	private JPanel Cl3 = new JPanel();
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
	private JButton jBSuppr = new JButton("Supprimer Client");
	//Supprimer Compte
	private JLabel jLidCpt = new JLabel("Numéro de Compte");
	private JTextField jTidCpt= new JTextField(12);
	private JButton jBSuppr2 = new JButton("Supprimer Compte");
	//Supprimer Carte
	private JLabel jLidCte = new JLabel("id Carte");
	private JTextField jTidCte= new JTextField(12);
	private JButton jBSuppr3 = new JButton("Supprimer Carte");
	//Modification Client
	private JLabel jLnom3 = new JLabel("nom");
	private JLabel jLprenom3 = new JLabel("prenom");
	private JLabel jLadresse3 = new JLabel("adresse");
	private JLabel jLville3 = new JLabel("ville");
	private JLabel jLcodePostal3 = new JLabel("codePostal");
	private JLabel jLtelephone3 = new JLabel("telephone");
	private JTextField jTnom3 = new JTextField(12);
	private JTextField jTprenom3= new JTextField(12);
	private JTextField jTadresse3 = new JTextField(12);
	private JTextField jTville3 = new JTextField(12);
	private JTextField jTcodePostal3 = new JTextField(12);
	private JTextField jTtelephone3 = new JTextField(12);
	private JButton jBModif = new JButton("Valider Modification");
	//Onglets G
			//Creer
		private JPanel Creerc = new JPanel();
		private JPanel Modifierc = new JPanel();
		private JPanel Lirec = new JPanel();
		private JPanel Supprimerc = new JPanel();
		private JPanel Csr = new JPanel();
			//Supprimer
		private JPanel Csr2 = new JPanel();
			//Modifier
		private JPanel Csr3 = new JPanel();
			//Creation Conseiller
		private JLabel jLnomc = new JLabel("nom");
		private JLabel jLprenomc = new JLabel("prenom");
		private JLabel jLemail = new JLabel("email");
		private JLabel jLlogin = new JLabel("login");
		private JLabel jLmdp = new JLabel("Mot-de-Passe");
		private JTextField jTnomc = new JTextField(12);
		private JTextField jTprenomc = new JTextField(12);
		private JTextField jTemail = new JTextField(12);
		private JTextField jTlogin = new JTextField(12);
		private JTextField jTmdp = new JTextField(12);
		private JButton jBValiderc = new JButton("Creer Conseiller");
			//Supprimer Conseiller
		private JLabel jLidCsr = new JLabel("Identifiant Conseiller");
		private JTextField jTidCsr = new JTextField(12);
		private JButton jBSupprc = new JButton("Supprimer Conseiller");
			//Modifier Conseiller
		private JLabel jLidc2 = new JLabel("id");
		private JLabel jLnomc2 = new JLabel("nom");
		private JLabel jLprenomc2 = new JLabel("prenom");
		private JLabel jLemail2 = new JLabel("email");
		private JLabel jLlogin2 = new JLabel("login");
		private JLabel jLmdp2 = new JLabel("Mot de passe");
		private JTextField jTidc2 = new JTextField(12);
		private JTextField jTnomc2 = new JTextField(12);
		private JTextField jTprenomc2 = new JTextField(12);
		private JTextField jTemail2 = new JTextField(12);
		private JTextField jTlogin2 = new JTextField(12);
		private JTextField jTmdp2 = new JTextField(12);
		private JButton jBModifc = new JButton("Valider Modification");
	
		private IserviceConseiller isc = new ServiceConseiller();
		private IserviceGerant isg = new ServiceGerant();
		
	public FenetreSwing() {
		setTitle("PROXI-BANQUE");
		setSize(800, 600);
		setResizable(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//ONGLET CG
		//Onlget Creation
		JTabbedPane Creer = new JTabbedPane();
		Creer.addTab("Client", Cl);
		Creer.addTab("Compte", Cpt);
		Creer.addTab("Carte", Cte);
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
				//Client ce = new ClientEntreprise();
				cp.setNom(jTnom.getText());
				cp.setPrenom(jTprenom.getText());
				cp.setAdresse(jTadresse.getText());
				cp.setVille(jTville.getText());
				cp.setCodePostal(jTcodePostal.getText());
				cp.setTelephone(Integer.parseInt(jTtelephone.getText()));
				//ce.setNom(jTnom.getText());
				//ce.setPrenom(jTprenom.getText());
				//ce.setAdresse(jTadresse.getText());
				//ce.setVille(jTville.getText());
				//ce.setCodePostal(jTcodePostal.getText());
				//ce.setTelephone(Integer.parseInt(jTtelephone.getText()));
				isc.creationClient(cp);
				//isc.creationClient(ce);
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
				Compte cc = new CompteCourant();
				//Compte ce = new CompteEpargne();
				cc.setSolde(Integer.parseInt(jTsolde.getText()));
				cc.setCode(Integer.parseInt(jTcode.getText()));
				cc.setDateOuverture(jTdateOuverture.getText());
				//ce.setSolde(Integer.parseInt(jTsolde.getText()));
				//ce.setCode(Integer.parseInt(jTcode.getText()));
				//ce.setDateOuverture(jTdateOuverture.getText());
				isc.creationCompte(cc);
			//	isc.creationCompte(ce);
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
				//Carte ce = new CarteVisaElectron();
				cp.setNumeroCarte(Integer.parseInt(jTnumCarte.getText()));
				//ce.setNumeroCarte(Integer.parseInt(jTnumCarte.getText()));
				isc.creationCarte(cp);
				//isc.creationCarte(ce);
				jTnumCarte.setText("");
			}
		});
		Cte.add(jBValider3);
		//Onglet Supprimer
		JTabbedPane Supprimer = new JTabbedPane();
		Supprimer.addTab("Client", Cl2);
		Supprimer.addTab("Compte", Cpt2);
		Supprimer.addTab("Carte", Cte2);
			//Supprimer client
		Cl2.add(jLidCl);
		Cl2.add(jTidCl);
		jBSuppr.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Je supprime un client de la BDD");
				isc.suppressionClient(Integer.parseInt(jTidCl.getText()));
				jTidCl.setText("");
			}
		});
		Cl2.add(jBSuppr);
			//Supprimer Compte
		Cpt2.add(jLidCpt);
		Cpt2.add(jTidCpt);
		jBSuppr2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Je supprime un compte de la BDD");
				isc.suppressionCompte(Integer.parseInt(jTidCpt.getText()));
				jTidCpt.setText("");
			}
		});
		Cpt2.add(jBSuppr2);
			//Supprimer Carte
		Cte2.add(jLidCte);
		Cte2.add(jTidCte);
		jBSuppr3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Je supprime une carte de la BDD");
				isc.suppressionCarte(Integer.parseInt(jTidCte.getText()));
				jTidCte.setText("");
			}
		});
		Cte2.add(jBSuppr3);
		//Onglet Modification
		JTabbedPane Modifier = new JTabbedPane();
		Modifier.addTab("Client", Cl3);
			//Modification Client
		Cl3.add(jLnom3);
		Cl3.add(jTnom3);
		Cl3.add(jLprenom3);
		Cl3.add(jTprenom3);
		Cl3.add(jLadresse3);
		Cl3.add(jTadresse3);
		Cl3.add(jLville3);
		Cl3.add(jTville3);
		Cl3.add(jLcodePostal3);
		Cl3.add(jTcodePostal3);
		Cl3.add(jLtelephone3);
		Cl3.add(jTtelephone3);
		jBModif.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Je crée un client dans la BDD");
				Client cp = new ClientParticulier();
				Client ce = new ClientEntreprise();
				cp.setNom(jTnom3.getText());
				cp.setPrenom(jTprenom3.getText());
				cp.setAdresse(jTadresse3.getText());
				cp.setVille(jTville3.getText());
				cp.setCodePostal(jTcodePostal3.getText());
				cp.setTelephone(Integer.parseInt(jTtelephone3.getText()));
				ce.setNom(jTnom3.getText());
				ce.setPrenom(jTprenom3.getText());
				ce.setAdresse(jTadresse3.getText());
				ce.setVille(jTville3.getText());
				ce.setCodePostal(jTcodePostal3.getText());
				ce.setTelephone(Integer.parseInt(jTtelephone3.getText()));
				isc.creationClient(cp);
				isc.creationClient(ce);
				jTnom3.setText("");
				jTprenom3.setText("");
				jTadresse3.setText("");
				jTville3.setText("");
				jTcodePostal3.setText("");
				jTtelephone3.setText("");
			}
		});
		Cl3.add(jBModif);

		//Onglet CG
		JTabbedPane CG = new JTabbedPane();
		CG.addTab("Creer", Creer);
		CG.addTab("Modifier", Modifier);
		CG.addTab("Lire", Lire);
		CG.addTab("Supprimer", Supprimer);
		CG.addTab("Virement", Virement);
		CG.addTab("Patrimoine", Patrimoine);
		CG.addTab("Credit", Credit);
		
		//ONGLET CG
			//Onlget Creation
			JTabbedPane Creerc = new JTabbedPane();
			Creerc.addTab("Conseiller", Csr);
			//Creation Client
			Csr.add(jLnomc);
			Csr.add(jTnomc);
			Csr.add(jLprenomc);
			Csr.add(jTprenomc);
			Csr.add(jLemail);
			Csr.add(jTemail);
			Csr.add(jLlogin);
			Csr.add(jTlogin);
			Csr.add(jLmdp);
			Csr.add(jTmdp);
			jBValiderc.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println("Je crée un conseiller dans la BDD");
					EmployeConseiller c = new EmployeConseiller();
					c.setNom(jTnomc.getText());
					c.setPrenom(jTprenomc.getText());
					c.setEmail(jTemail.getText());
					c.setLogin(jTlogin.getText());
					c.setMdp(jTmdp.getText());
					isg.creationConseiller(c);
					jTnomc.setText("");
					jTprenomc.setText("");
					jTemail.setText("");
					jTlogin.setText("");
					jTmdp.setText("");
				}
			});
			Csr.add(jBValiderc);
		//Onglet Supprimer
		JTabbedPane Supprimerc = new JTabbedPane();
		Supprimerc.addTab("Conseiller", Csr2);
			//Supprimer client
			Csr2.add(jLidCsr);
			Csr2.add(jTidCsr);
			jBSupprc.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println("Je supprime un conseiller de la BDD");
					EmployeConseiller c = new EmployeConseiller();
					isg.suppressionConseiller(Integer.parseInt(jTidCsr.getText()));
					jTidCsr.setText("");
				}
			});
			Csr2.add(jBSupprc);
		//Onglet Modifier
		JTabbedPane Modifierc = new JTabbedPane();
		Modifierc.addTab("Conseiller", Csr3); 
			//Modifier Conseiller qvdzv
		Csr3.add(jLidc2);
		Csr3.add(jTidc2);
		Csr3.add(jLnomc2);
		Csr3.add(jTnomc2);
		Csr3.add(jLprenomc2);
		Csr3.add(jTprenomc2);
		Csr3.add(jLemail2);
		Csr3.add(jTemail2);
		Csr3.add(jLlogin2);
		Csr3.add(jTlogin2);
		Csr3.add(jLmdp2);
		Csr3.add(jTmdp2);
		jBModifc.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Je modifie un conseiller dans la BDD");
				EmployeConseiller c = new EmployeConseiller();
				c.setIdConseiller(Integer.parseInt(jTidc2.getText()));
				c.setNom(jTnomc2.getText());
				c.setPrenom(jTprenomc2.getText());
				c.setEmail(jTemail2.getText());
				c.setLogin(jTlogin2.getText());
				c.setMdp(jTmdp2.getText());
				isg.modifierConseiller(c);
				jTidc2.setText("");
				jTnomc2.setText("");
				jTprenomc2.setText("");
				jTemail2.setText("");
				jTlogin2.setText("");
				jTmdp2.setText("");
			}
		});
		Csr3.add(jBModifc);
		
		//Onglet G
		JTabbedPane G = new JTabbedPane();
		G.addTab("Creer", Creerc);
		G.addTab("Modifier", Modifierc);
		G.addTab("Lire", Lirec);
		G.addTab("Supprimer", Supprimerc);
		
		//Regroupement de tous les onglets
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
