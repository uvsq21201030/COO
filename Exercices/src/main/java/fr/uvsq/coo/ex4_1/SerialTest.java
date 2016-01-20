package fr.uvsq.coo.ex4_1;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SerialTest {
	
	Personnel bob = new Personnel.Builder("BOB","Eponge").dateDeNaissance("1950-12-01").numeroTel("06.06.06.06.06").build();
	Personnel p = new Personnel.Builder("p","p").build();
	
	File dataFile =  new File ("C:\\Users\\Alex\\Desktop\\serialTest.txt");

	@Before
	public void ecriture() throws IOException{
	
		try{
			FileOutputStream file= new FileOutputStream(dataFile);
			ObjectOutputStream out = new ObjectOutputStream(file);
				
			out.writeObject(bob);
			
			out.close();
			System.out.println("out nice");
		}
		catch(EOFException e){}
		
	}
	
	@Test
	public void lecture() throws IOException, ClassNotFoundException{
		
		try{ 
			FileInputStream file = new FileInputStream(dataFile);
			ObjectInputStream in = new ObjectInputStream(file);
			
			p = (Personnel)in.readObject();
			
			in.close();
			
			assertEquals(bob.getNom(), p.getNom());
			
			//System.out.println("in nice");
			
		}
		catch(EOFException e){
		}
	}
	
}
