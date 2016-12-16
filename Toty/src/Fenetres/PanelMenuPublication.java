package Fenetres;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class PanelMenuPublication extends JPanel {
	private MenuPublication m;
	public Menu men;

	public void paintComponent(Graphics g) {
		int j = 0;
		int k = 0;
		int l = 0;
		int X[] = new int[1024];
		int Y[] = new int[1024];
		for (int i = 0; i < men.l.sections.size(); i++) {
			g.fillOval(5 + k, 5 + j, 10, 10);
			X[i]=5+k;
			Y[i]=5+j;
			l++;
			k += 50;
			if (l == 5) {
				k = 0;
				j += 20;
			}
		}

		k=1;
		l=1;
		j=1;
		for (int i = 0; i < men.l.sections.size(); i++) {
			for (int aa = 0; aa < men.l.sections.size(); aa++) {
				if (men.l.sections.get(i).departs.equals(men.l.sections.get(aa).arrivées)){
					g.drawLine(X[i], Y[i], X[aa], Y[aa]);
				}
			}
		}

	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PanelMenuPublication(MenuPublication m, Menu men) {

		this.setLayout(null);
		this.men = men;
		this.m = m;
		this.setBackground(Color.RED);

	}
}