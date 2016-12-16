package Bouttons;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import Fenetres.Menu;
import Fenetres.PanelGestionLivre;
import LDVH.Enchainement;
import LDVH.Section;

public class BouttonCréerEnchainement extends JButton implements MouseListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Menu m;
	PanelGestionLivre p2;

	public BouttonCréerEnchainement(String s, Menu m) {
		super(s);
		this.m = m;
		this.addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {

	}

	@Override
	public void mousePressed(MouseEvent e) {

		Section départ = null,arrivée=null;
		String texte1,texte2;
		int nd=0,na = 0;
		boolean test = false;
		
		while (test==false) {
			texte1 = (String) JOptionPane.showInputDialog(null,
					"Choisir num section de départ", null,
					JOptionPane.PLAIN_MESSAGE);
			
			nd = Integer.parseInt(texte1);
			

			for (int i = 0; i < m.l.sections.size(); i++) {
				if(m.l.sections.get(i).num == nd){
					System.out.println(nd +" "+ m.l.sections.get(i).num);
					départ = m.l.sections.get(i);
					test=true;
					break;
				}
			}
		}
		
		
		test = false;
		
		
		while (test==false) {
			
			do{
			texte2 = (String) JOptionPane.showInputDialog(null,
					"Choisir num section d'arrivée", null,
					JOptionPane.PLAIN_MESSAGE);
			
			na = Integer.parseInt(texte2);
			}while(na==nd);
			

			for (int i = 0; i < m.l.sections.size(); i++) {
				if(m.l.sections.get(i).num == nd){
					arrivée=m.l.sections.get(i);
					test=true;
					break;
				}
			}
		}
		
		Enchainement en=new Enchainement(départ,arrivée);
		
		for (int i = 0; i < m.l.sections.size(); i++) {
			if(m.l.sections.get(i).num == na){
				test = true;
				m.l.sections.get(i).ajouterArrivée(en);
			}
			if(m.l.sections.get(i).num == nd){
				test = true;
				m.l.sections.get(i).ajouterDepart(en);
			}
			
		}
		
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