package Fenetres;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.ImageConsumer;
import java.io.File;
import java.io.IOException;
import java.util.Hashtable;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Bouttons.BouttonGererEnchainement;
import Bouttons.BouttonGererSection;
import Bouttons.BouttonPublication;
import Bouttons.BouttonRetourMenu;

public class PanelGestionLivre extends JPanel{	
	private JLabel j1;
	private BouttonRetourMenu b1;
	private BouttonGererSection b2;
	private BouttonGererEnchainement b3;
	private BouttonPublication b4;
	
	public PanelGestionLivre(Menu m){
		this.setBackground(Color.BLUE);
		this.setLayout(null);
		Font police = new Font("Tahoma", Font.BOLD, 16);
		j1 = new JLabel();
		j1.setSize(1000, 1000);
		j1.setLocation(m.getWidth()/8,m.getHeight()/32);
		j1.setFont(police);
		j1.setVisible(true);
		j1.setText("Gestion du livre : " + m.l.nom);
		j1.setForeground(Color.RED);
		this.add(j1);
		
		b1 = new BouttonRetourMenu("Retour", m);
		this.add(b1);
		b1.setSize(150, 50);
		b1.setLocation(m.getWidth()/4,m.getHeight()/4);
		
		b2 = new BouttonGererSection("Gérer Section", m);
		this.add(b2);
		b2.setSize(150, 50);
		b2.setLocation(m.getWidth()/2,m.getHeight()/16);
		
		b3 = new BouttonGererEnchainement("Gérer Enchainement", m);
		this.add(b3);
		b3.setSize(150, 50);
		b3.setLocation(m.getWidth()/2,m.getHeight()/4);
		
		b4 = new BouttonPublication("Publier Livre", m);
		this.add(b4);
		b4.setSize(150, 50);
		b4.setLocation(m.getWidth()/2,m.getHeight()/2);
		
		
		
	}
}