package fr.uvsq.coo.ex4_1;

public class PersonnelSerialDAO extends DAO<Personnel>{
	public Personnel create (Personnel p){
		return p;
	}

	public Personnel find (String nom, String prenom){
		return null;
	}
	
	public Personnel update(Personnel p){
		return p;
	}
	public void delete(Personnel p){
		
	}
}
