package LDVH;

import java.util.ArrayList;

public class Livre {
	public String nom;
	public String auteur;
	public int id;
	public ArrayList<Section> sections;
	
	
	public Livre(String nom){
		this.nom = nom;
		id = (int)Math.random()*100000;
		sections = new ArrayList<Section>();
	}
	
	public Livre(){
		nom="";
		id = (int)Math.random()*100000;
		sections = new ArrayList<Section>();
	}
	
	
	public void AjouterSection(int num, String texte, String nomObjet, Enchainement depart, Enchainement arrivée){
		
	}
	
	public void AjouterSection(int num, String texte, Enchainement depart, Enchainement arrivée){
		
	}
	
	public void AjouterSection(int num, String texte){
		sections.add(new Section (num,texte,null) );
	}
	
	
	public void Charger(String s){
		
	}
	
	public void setNom(String nom){
		this.nom=nom;
	}
	
	public String getNom(){
		return nom;
	}
	
}
