package fr.uvsq.coo.ex3_9;

import java.util.HashMap;
import java.util.Stack;

public class Interpreteur {
	protected Stack history = new Stack();
	protected HashMap set = new HashMap();
	
	public void session(Command command){

		while (true){
			this.history.add(command);
			
			if (command instanceof Quit) {
				return;
			} else {
				command.execute();
			}
		}
				
		/*while (true){
			Command command = getNewCommand();
			if (command instanceof Quit) {
				return;
			} else {
				command.execute();
			}
		}*/
	}
	
/*	protected Command getNewCommand(){
		String s = input.getString();
		
		while (!set.containsKey(s)){
			display.printError("Not a valid command; try again!");
			s = input.getString();
		}
		return((Command) set.get(s)).clone();
	}*/
}
