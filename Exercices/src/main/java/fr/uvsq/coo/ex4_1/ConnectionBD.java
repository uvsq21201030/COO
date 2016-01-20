package fr.uvsq.coo.ex4_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionBD {
	//Class.forName ("com.mysql.jdbc.Driver");
	String dburl = "jdbc:mysql://localhost/test";
	String userName = "";
	String password = "";
	Connection conn = null;
	Properties connectionProps = new Properties();
	
	public ConnectionBD(){

		connectionProps.put ("user",userName);
		connectionProps.put (" password " , password);
		
		try {
			conn = DriverManager.getConnection ( dburl, connectionProps);
			
		}catch(Exception e){
			
		}finally{
			if (conn != null) {
				try { conn.close(); } 
				catch ( Exception e ) {}
			}
		}
	}
}
