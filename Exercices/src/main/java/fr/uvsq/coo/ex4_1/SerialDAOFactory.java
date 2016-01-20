package fr.uvsq.coo.ex4_1;

public class SerialDAOFactory extends Factory{
	
	public DAO<Personnel> getPersonnelDAO(){
		return new PersonnelSerialDAO();
	}
	
	public DAO<Groupe> getGroupeDAO(){
		return new GroupeSerialDAO();
	}
}
