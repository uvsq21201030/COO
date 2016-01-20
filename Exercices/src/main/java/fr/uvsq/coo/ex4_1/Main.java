package fr.uvsq.coo.ex4_1;

import java.io.IOException;

public class Main {
	
	public static void main(String args[]) throws IOException {
		/*//Initialise quatre Personne
		Personnel bob = new Personnel.Builder("BOB","Eponge").dateDeNaissance("1950-12-01").numeroTel("06.06.06.06.06").build();
		Personnel alice = new Personnel.Builder("alice","Eponge").dateDeNaissance("1970-08-11").numeroTel("07.07.07.07.07").build();
		Personnel eve = new Personnel.Builder("eve","thai").dateDeNaissance("1980-11-21").numeroTel("08.08.08.08.08").build();
		Personnel u = new Personnel.Builder("chinois","u").dateDeNaissance("1990-10-15").fonction("specialiste wiki").build();
	
        //Initialise deux groupes
        Groupe grp1 = new Groupe();
        Groupe grp2 = new Groupe();
	
        //Compose les groupes
        grp1.add(bob);
        grp1.add(alice);
        
        grp2.add(eve);
        grp2.add(u);
        
        //affichage des groupes

        
        System.out.println("***********grp1**********");
        grp1.affichage();
        
        System.out.println("***********grp2********** ");
        grp2.affichage();
        */
		
		SerialTest test = new SerialTest();
		
		test.ecriture();
		
	}
}
