package fr.uvsq.coo.ex3_9;

public class MoteurRPN extends Interpreteur{
	
	public MoteurRPN(){
		set.put("quit" , new Quit());
		set.put("undo" , new Undo(history));
		set.put( "+" , new Add(history));
		set.put( "-" , new Sub(history));
		set.put( "*" , new Mult(history));
		set.put( "/" , new Div(history));
		set.put("accept" ,new Accept(history));
	}
}
