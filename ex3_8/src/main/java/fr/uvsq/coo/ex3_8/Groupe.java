package fr.uvsq.coo.ex3_8;

import java.util.ArrayList;
import java.util.Iterator;

public class Groupe implements Element{
	private ArrayList<Element> grp = new ArrayList<Element>();
	
	public void affichage(){
		/*for (Element e : grp){
			e.affichage();
		}*/
        Iterator i = grp.iterator();
        while(i.hasNext()){
          Element e= (Element)i.next();
          e.affichage();
        }
	}
	
	//Ajoute le graphique à la composition.
	public void add(Element e){
		grp.add(e);
	}
	
	//Retire le graphique de la composition
	public void remove(Element e){
		grp.remove(e);
	}

}
