package Fenetres;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import Bouttons.BouttonRetourGestionLivre;
import java.awt.Graphics;





public class PanelAffichageLivre extends JPanel{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel j1;
	private BouttonRetourGestionLivre b1;
	
	public PanelAffichageLivre(Menu m){
		this.updateUI();
		this.setBackground(Color.BLUE);
		this.setLayout(null);
		Font police = new Font("Tahoma", Font.BOLD, 16);
		j1 = new JLabel();
		j1.setSize(1000, 1000);
		j1.setLocation(m.getWidth()/8,m.getHeight()/32);
		j1.setFont(police);
		j1.setVisible(true);
		String t="";
		  for(int i = 0 ; i < m.l.sections.size(); i++){
			  t = t+"\n\nSection "+ m.l.sections.get(i).num+" : \n";
			  t = t+m.l.sections.get(i).texte;
			 }
		j1.setText(t);
		j1.setForeground(Color.RED);
		this.add(j1);
		
		b1 = new BouttonRetourGestionLivre("Retour", m);
		this.add(b1);
		b1.setSize(150, 50);
		b1.setLocation(m.getWidth()/4,m.getHeight()/4);
	}
}