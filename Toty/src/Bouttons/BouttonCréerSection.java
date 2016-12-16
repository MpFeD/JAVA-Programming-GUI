package Bouttons;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import Fenetres.Menu;
import Fenetres.PanelGestionLivre;

public class BouttonCréerSection extends JButton implements MouseListener {

	Menu m;
	PanelGestionLivre p2;

	public BouttonCréerSection(String s, Menu m) {
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
					"Saisir num Section :", null, JOptionPane.PLAIN_MESSAGE);

		String texte2 = "";

		while (texte2.equals(""))
			texte2 = (String) JOptionPane.showInputDialog(null, "Saisir texte",
					null, JOptionPane.PLAIN_MESSAGE);

		String texte3 = "";

		texte3 = (String) JOptionPane.showInputDialog(null,
				"Ajouter objet, vide = pas d'objet", null,
				JOptionPane.PLAIN_MESSAGE);

		m.l.AjouterSection(Integer.parseInt(texte1), texte2);

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