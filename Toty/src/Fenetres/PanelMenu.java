package Fenetres;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Bouttons.BouttonChargerLivre;
import Bouttons.BouttonCréerLivre;
import LDVH.Livre;

public class PanelMenu extends JPanel {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Menu m;
	BouttonCréerLivre b1;
	BouttonChargerLivre b2;
	private JLabel j1;

	public PanelMenu(Menu m) {
		
		this.setLayout(null);
		this.m = m;
		
		
		b1 = new BouttonCréerLivre("Créer Livre", m);
		this.add(b1);
		b1.setSize(150, 50);
		b1.setLocation(m.getWidth()/2,m.getHeight()/12);
		
		b2 = new BouttonChargerLivre("Charger Livre", m);
		this.add(b2);
		b2.setSize(150, 50);
		b2.setLocation(m.getWidth()/2,m.getHeight()/4);
		
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
