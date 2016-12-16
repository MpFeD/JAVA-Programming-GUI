package Bouttons;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import Fenetres.Menu;
import Fenetres.PanelGestionLivre;

public class BouttonChargerLivre extends JButton implements MouseListener{

	Menu m;
	PanelGestionLivre p2;
	
	public BouttonChargerLivre(String s,Menu m){
		super(s);
		this.m=m;
		this.addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {

		
	}

	@Override
	public void mousePressed(MouseEvent e) {	
		m.l.nom = (String)JOptionPane.showInputDialog( null, "Donnez le titre du livre :", "Titre", JOptionPane.PLAIN_MESSAGE);
		//m.setContentPane(new PanelCréation());
		m.setVisible(true);
		
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		//System.out.println("XXX");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		//System.out.println("XXX");
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		//System.out.println("XXX");
		
	}
	
	
}