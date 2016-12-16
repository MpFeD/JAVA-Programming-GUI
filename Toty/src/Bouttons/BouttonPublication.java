package Bouttons;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

import Fenetres.Menu;
import Fenetres.MenuPublication;
import Fenetres.PanelAffichageLivre;
import Fenetres.PanelGestionLivre;

public class BouttonPublication extends JButton implements MouseListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Menu m;
	PanelGestionLivre p2;
	
	public BouttonPublication(String s,Menu m){
		super(s);
		this.m=m;
		this.addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		m.setContentPane(new PanelAffichageLivre(m));
		m.setVisible(true);
		MenuPublication mmenuplublication = new MenuPublication(m);
	}

	@Override
	public void mousePressed(MouseEvent e) {	
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}
}