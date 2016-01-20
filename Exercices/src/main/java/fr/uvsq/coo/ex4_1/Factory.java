package fr.uvsq.coo.ex4_1;

public abstract class Factory {
	public enum DaoType { JDBC, Serial; }
	
	public abstract DAO getPersonnelDAO();
	public abstract DAO getGroupeDAO();
	
	public static Factory getFactory (DaoType type){
		if (type == DaoType.JDBC) return new JdbcDAOFactory ();
		if (type == DaoType.Serial) return new SerialDAOFactory ();
		return null;
	}
}
