package Fenetres;

import javax.swing.JFrame;

import LDVH.Livre;

public class MenuPublication extends JFrame {
	/**
	 * 
	 */
	Menu m;
	
	private static final long serialVersionUID = 1L;
	public PanelMenuPublication p;
	public MenuPublication(Menu m) {
		this.m=m;
		this.setTitle("LDVH");
		this.setSize(800,600 );
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		p = new PanelMenuPublication(this,m);
		this.setContentPane(p);
		this.setVisible(true);
	}
	
}
