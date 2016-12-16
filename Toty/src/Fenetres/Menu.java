package Fenetres;

import javax.swing.JFrame;

import LDVH.Livre;

public class Menu extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public PanelMenu p;
	public Livre l;
	public Menu() {
		this.setTitle("LDVH");
		this.setSize(1024,768 );
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		p = new PanelMenu(this);
		this.setContentPane(p);
		this.setVisible(true);
	}
	
	public void AjouterLivre(String s){
		l = new Livre(s);
	}
}
