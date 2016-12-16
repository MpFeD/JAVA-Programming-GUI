package Fenetres;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import Bouttons.BouttonCréerSection;
import Bouttons.BouttonRetourGestionLivre;
import Bouttons.BouttonSuprSection;

public class PanelGestionSection extends JPanel{	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel j1;
	private BouttonRetourGestionLivre b1;
	private BouttonCréerSection b2;
	private BouttonSuprSection b3;
	
	public PanelGestionSection(Menu m){
		this.setBackground(Color.BLUE);
		this.setLayout(null);
		Font police = new Font("Tahoma", Font.BOLD, 16);
		j1 = new JLabel();
		j1.setSize(1000, 1000);
		j1.setLocation(m.getWidth()/8,m.getHeight()/32);
		j1.setFont(police);
		j1.setVisible(true);
		j1.setText("Gestion section");
		j1.setForeground(Color.RED);
		this.add(j1);
		
		b1 = new BouttonRetourGestionLivre("Retour", m);
		this.add(b1);
		b1.setSize(150, 50);
		b1.setLocation(m.getWidth()/4,m.getHeight()/4);
		
		b2 = new BouttonCréerSection("Créer Section", m);
		this.add(b2);
		b2.setSize(150, 50);
		b2.setLocation(m.getWidth()/2,m.getHeight()/16);
		
		b3 = new BouttonSuprSection("Supprimer Section", m);
		this.add(b3);
		b3.setSize(150, 50);
		b3.setLocation(m.getWidth()/2,m.getHeight()/4);
	}
}