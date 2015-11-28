package fr.uvsq.coo.ex3_9;

import java.util.Stack;

public class Add implements OperandeCommand{
	protected Stack history;
	
	public Add(Stack h){ 
		this.history = h; 
	}
	
	public void execute(){
		int nb1 = (Integer) this.history.pop();
		int nb2 = (Integer) this.history.pop();
		
		
	}
}
