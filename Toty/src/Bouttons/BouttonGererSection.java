package Bouttons;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import Fenetres.Menu;
import Fenetres.PanelGestionLivre;
import Fenetres.PanelGestionSection;

public class BouttonGererSection extends JButton implements MouseListener{

	Menu m;
	PanelGestionLivre p2;
	
	public BouttonGererSection(String s,Menu m){
		super(s);
		this.m=m;
		this.addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {

		
	}

	@Override
	public void mousePressed(MouseEvent e) {	
		m.setContentPane(new PanelGestionSection(m));
		m.setVisible(true);
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