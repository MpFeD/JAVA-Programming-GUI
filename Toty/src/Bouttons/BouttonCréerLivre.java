package Bouttons;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import Fenetres.Menu;
import Fenetres.PanelGestionLivre;

public class BouttonCréerLivre extends JButton implements MouseListener {

	Menu m;
	PanelGestionLivre p2;

	public BouttonCréerLivre(String s, Menu m) {
		super(s);
		this.m = m;
		this.addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {

	}

	@Override
	public void mousePressed(MouseEvent e) {
		
		String texte1 = "";

		while (texte1.equals(""))
			texte1 = (String) JOptionPane.showInputDialog(null,
					"Donnez le titre du livre :", null,
					JOptionPane.PLAIN_MESSAGE);
		
		m.AjouterLivre(texte1);
		
		String texte2 = "";
		
		while (texte2.equals(""))
			texte2 = (String) JOptionPane.showInputDialog(null,
					"Entrez le texte de la première section", null,
					JOptionPane.PLAIN_MESSAGE);
		
		m.l.AjouterSection(1, texte2);
		
		
		m.setContentPane(new PanelGestionLivre(m));
		m.setVisible(true);
	}

	@Override
	public void mouseReleased(MouseEvent e){
	}

	@Override
	public void mouseEntered(MouseEvent e){
	}

	@Override
	public void mouseExited(MouseEvent e){
	}

}
