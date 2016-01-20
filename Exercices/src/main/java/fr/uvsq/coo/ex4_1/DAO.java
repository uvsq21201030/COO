package fr.uvsq.coo.ex4_1;

public abstract class DAO<T>{
	protected ConnectionBD connect = new ConnectionBD();
	
	public abstract T create (T obl);
	public abstract T find (String nom, String prenom);
	public abstract T update(T obj);
	public abstract void delete(T obj);
}
