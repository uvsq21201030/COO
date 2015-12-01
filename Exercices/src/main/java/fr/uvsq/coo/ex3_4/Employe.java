package fr.uvsq.coo.ex3_4;

class Employe{
	private final String nom = "";
	private final String adresse = "";
	private double anciennete;
	private double salaire;
	// ...
	
	public Employe(){
		this.anciennete = 0;
		this.salaire = 1500;
	}
	
	public String getNom(){
		return this.nom;
	}
	
	public String getAdresse(){
		return this.adresse;
	}
	
	public double getAnciennete(){
		return this.anciennete;
	}
	
	public double getSalaire(){
		return this.salaire;
	}
	
	public void ajoutAnciennete(){
		this.anciennete ++; 
	}
	
	public double calculSalaire(){
			return this.salaire + this.anciennete * 20; /* calcul du salaire*/ 
	}
}
