package fr.uvsq.coo.ex3_4;

public class Main {
	
	public static void main(String args[]) {
		Employe e = new Employe();
		Vendeur v = new Vendeur(10);
		Manager m = new Manager();
        
		e.ajoutAnciennete();
		
		m.ajoutEmploye(e);
		m.ajoutEmploye(v);
		
		System.out.println("salaire employe: " + e.getSalaire());
		System.out.println("salaire vendeur: " + v.getSalaire());
		System.out.println("salaire manager: " + m.getSalaire());
	}
}
