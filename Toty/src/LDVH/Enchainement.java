package LDVH;

public class Enchainement {
	public int id;
	public Section depart;
	public Section arrivee;
	
	public Enchainement(int id){
		this.id=id;
	}
	
	public Enchainement(Section depart, Section arrivee){
		this.depart = depart;
		this.arrivee = arrivee;
		id = (int)Math.random()*100000;
	}
}
