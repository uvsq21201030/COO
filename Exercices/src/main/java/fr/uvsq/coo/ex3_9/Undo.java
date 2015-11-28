package fr.uvsq.coo.ex3_9;

import java.util.Stack;

public class Undo implements Command{

	protected Stack history;
	
	public Undo(Stack h){ 
		this.history = h; 
	}
	
	public void execute(){ 
		this.history.pop();
		//((Command) this.history.pop()).undo(); 
	}
	
	//public void undo(){
	//}
	
	/*public Command clone(){
		
	}*/

}
