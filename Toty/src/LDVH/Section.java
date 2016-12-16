package LDVH;

import java.util.ArrayList;

public class Section {
	public int num;
	public String texte;
	public Objet o;
	public ArrayList<Enchainement> departs;
	public ArrayList<Enchainement> arrivées;
	
	public Section(int num,String texte, Objet o){
		departs=new ArrayList<Enchainement>();
		arrivées=new ArrayList<Enchainement>();
		this.num=num;
		this.texte=texte;
		this.o=o;
	}
	
	public Section(int num,String texte, int num2, String nom){
		departs=new ArrayList<Enchainement>();
		arrivées=new ArrayList<Enchainement>();
		this.num=num;
		this.texte=texte;
		this.o=new Objet(num2, nom);
	}
	
	public void ajouterDepart(Enchainement a){
		departs.add(a);
	}
	
	public void ajouterArrivée(Enchainement a){
		arrivées.add(a);
	}
	
	public void supprimerDepart(Enchainement a){
		departs.remove(a);
	}
	
	public void supprimerArrivée(Enchainement a){
		arrivées.remove(a);
	}
	
}
