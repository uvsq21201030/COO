package fr.uvsq.coo.ex3_9;

import java.util.Stack;

public class Accept implements OperandeCommand{
	protected Stack history;
	
	public Accept(Stack h){ 
		this.history = h; 
	}
	
	public void execute(){
		
	}
}
