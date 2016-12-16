package Fenetres;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Bouttons.BouttonChargerLivre;
import Bouttons.BouttonCréerEnchainement;
import Bouttons.BouttonCréerLivre;
import Bouttons.BouttonRetourGestionLivre;
import Bouttons.BouttonSuprEnchainement;
import Bouttons.BouttonSuprSection;
import LDVH.Livre;

public class PanelGestionEnchainement extends JPanel {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Menu m;
	BouttonRetourGestionLivre b1;
	BouttonCréerEnchainement b2;
	BouttonSuprEnchainement b3;
	
	private JLabel j1;

	public PanelGestionEnchainement(Menu m) {
		
		this.setLayout(null);
		this.m = m;

		
		
		b1 = new BouttonRetourGestionLivre("Retour", m);
		this.add(b1);
		b1.setSize(150, 50);
		b1.setLocation(m.getWidth()/4,m.getHeight()/4);
		
		b2 = new BouttonCréerEnchainement("Créer Enchainement", m);
		this.add(b2);
		b2.setSize(150, 50);
		b2.setLocation(m.getWidth()/2,m.getHeight()/12);
		
		b3 = new BouttonSuprEnchainement("Supprimer Enchainement", m);
		this.add(b3);
		b3.setSize(150, 50);
		b3.setLocation(m.getWidth()/2,m.getHeight()/4);
		

		this.setBackground(Color.BLUE);
		Font police = new Font("Tahoma", Font.BOLD, 16);
		j1 = new JLabel();
		j1.setSize(1000, 1000);
		j1.setLocation(m.getWidth()/8,m.getHeight()/32);
		j1.setFont(police);
		j1.setVisible(true);
		j1.setText("Bienvenue dans LDVH");
		j1.setForeground(Color.RED);
		this.add(j1);
		
	}
}
