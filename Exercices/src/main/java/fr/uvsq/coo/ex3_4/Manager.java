package fr.uvsq.coo.ex3_4;

import java.util.ArrayList;

public class Manager extends Employe{
	
	private ArrayList<Employe> equipe;
	
	public Manager(){
		super();
		this.equipe = new ArrayList<Employe>();
	}
	
	public void ajoutEmploye(Employe e){
		this.equipe.add(e);
	}
	
	public double calculSalaire(){
		return this.getSalaire() + this.getAnciennete() * 20 + this.equipe.size() * 100; /* calcul du salaire*/ 
	}
}
