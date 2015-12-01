package fr.uvsq.coo.ex3_4;

public class Vendeur extends Employe{
	private double commision;
	
	public Vendeur(double comm){
		super();
		this.commision = comm;
	}
	
	public void AugmentationComm(double comm){
		this.commision += comm;
	}
	
	public double calculSalaire(){
		return this.getSalaire() + this.getAnciennete() * 20 + this.commision; /* calcul du salaire*/ 
	}
}
