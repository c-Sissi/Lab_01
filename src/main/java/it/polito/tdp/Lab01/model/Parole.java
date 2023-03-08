package it.polito.tdp.Lab01.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Parole implements Comparable <Parole>{
	private List<String> listaParole = new ArrayList<String>();
		
	public Parole() {
		//TODO
	}
	
	public void addParola(String p) {
		listaParole.add(p);
		//TODO
	}
	
	public List<String> getElenco() {
		Collections.sort(listaParole);
		//System.out.println(listaParole);
		return (List<String>) listaParole;
		
	}
	
	public void reset() {
		listaParole.clear();
		
		// TODO
	}

	@Override
	public int compareTo(Parole p1) {
		// TODO Auto-generated method stub
		return this.compareTo(p1);
	}

}