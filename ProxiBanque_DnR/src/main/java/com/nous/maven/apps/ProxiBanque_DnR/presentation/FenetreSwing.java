package com.nous.maven.apps.ProxiBanque_DnR.presentation;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import com.nous.maven.apps.ProxiBanque_DnR.metier.Client;

public class FenetreSwing extends JFrame{
	private JPanel jPCG = new JPanel();
	private JPanel jPG = new JPanel();
	private JPanel jPA = new JPanel();
	//Onglets C-G
	private JPanel jPCGCreer = new JPanel();
	private JPanel jPCGModifier = new JPanel();
	private JPanel jPCGLire = new JPanel();
	private JPanel jPCGSupprimer = new JPanel();
	private JPanel jPCGVirement = new JPanel();
	private JPanel jPCGPatrimoine = new JPanel();
	private JPanel jPCGCredit = new JPanel();
	private JPanel jPCGCl = new JPanel();
	private JPanel jPCGCpt = new JPanel();
	private JPanel jPCGCte = new JPanel();
	//Onglet jPCGCl
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
	
	public FenetreSwing() {
		setTitle("PROXI-BANQUE");
		setSize(800, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Les onglets
			JTabbedPane onglets = new JTabbedPane();
			onglets.addTab("Conseiller/Gérant", jPCG);
			onglets.addTab("Gérant", jPG);
			onglets.addTab("Auditeur", jPA);
			onglets.addTab("Creer", jPCGCreer);
			onglets.addTab("Modifier", jPCGModifier);
			onglets.addTab("Lire", jPCGLire);
			onglets.addTab("Supprimer", jPCGSupprimer);
			onglets.addTab("Virement", jPCGVirement);
			onglets.addTab("Patrimoine", jPCGPatrimoine);
			onglets.addTab("Credit", jPCGCredit);
			onglets.addTab("Client", jPCGCl);
			onglets.addTab("Compte", jPCGCpt);
			onglets.addTab("Carte", jPCGCte);
		
		jPCGCl.add(jLnom);
		jPCGCl.add(jTnom);
		jPCGCl.add(jLprenom);
		jPCGCl.add(jTprenom);
		jPCGCl.add(jLadresse);
		jPCGCl.add(jTadresse);
		jPCGCl.add(jLville);
		jPCGCl.add(jTville);
		jPCGCl.add(jLcodePostal);
		jPCGCl.add(jTcodePostal);
		jPCGCl.add(jLtelephone);
		jPCGCl.add(jTtelephone);
		jBValider.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Je crée une personne dans la BDD");
				Client c = new Client(c);
				c.setNom(jTnom.getText());
				c.setPrenom(jTprenom.getText());
				c.setAdresse(jTadresse.getText());
				c.setVille(jTville.getText());
				c.setCodePostal(Integer.parseInt(jTcodePostal.getText()));
				c.setTelephone(Integer.parseInt(jTtelephone.getText()));
				isp.creerClient(c);
				jTnom.setText("");
				jTprenom.setText("");
				jTadresse.setText("");
				jTville.setText("");
				jTcodePostal.setText("");
				jTtelephone.setText("");
			}
		});
		jP1.add(jBValider);
		jP1.setBackground(Color.cyan);
		jPCGCl.add(jBValider);
		jPCGCreer.add(jPCGCl);
		
			getContentPane().add(onglets);
	}
	
	public static void main(String[] args) {
		FenetreSwing f = new FenetreSwing();
		f.setVisible(true);
	}

}
