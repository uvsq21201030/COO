package fr.uvsq.coo.ex4_1;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.derby.iapi.sql.ResultSet;

public class PersonnelJdbcDAO extends DAO<Personnel> {

	public Personnel create (Personnel p){
		try{
			PreparedStatement prepare = connect.conn.prepareStatement(
					"INSERT INTO personnes (nom, prenom) VALUES(?,?)"
					);
					prepare.setString(1, p.getNom());
					prepare.setString(2, p.getPrenom());
					int result = prepare.executeUpdate();
					assert result == 1;
					
		} catch (SQLException e){
			e.printStackTrace();
		}
		
		return p;
	}

	public Personnel find (String nom, String prenom){
		//
		
		try{
			PreparedStatement prepare = connect.conn.prepareStatement(
					"SELECT * FROM personnes WHERE nom = ? AND prenom = ?"
					);
					prepare.setString(1, nom);
					prepare.setString(2, prenom);
					ResultSet result = prepare.executeQuery();
					if(result.first()){
						//Personnel p = new Personnel.Builder(result.getString("nom"), result.getString("prenom"));
					}
		} catch (SQLException e){
			e.printStackTrace();
		}
		
		return null;
	}
	
	public Personnel update(Personnel p){
		return p;
	}
	public void delete(Personnel p){
		
	}
}
