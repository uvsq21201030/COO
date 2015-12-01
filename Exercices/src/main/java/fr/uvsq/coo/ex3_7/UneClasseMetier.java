package fr.uvsq.coo.ex3_7;

public class UneClasseMetier {
	Log l = new Log();
	
	public void uneMethodeMetier(){
		l.message(": Debut de uneMethodeMetier"); //log message
		
		//Traitements metiers
		
		l.message(": Fin de uneMethodeMetier"); //log message
	}
}
