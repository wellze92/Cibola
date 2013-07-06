package com.example.cibola;


/**
 * 
 * @author Andrew Wells
 * 
 * A card is an object which contains a front and a back. The front contains the key or the other item. The back of the card contains the statue
 * which the user wants to obtain
 *
 */
public class Card {

	private Statue statue;
	

	public Statue getStatue() {
		return statue;
	}

	public void setStatue(Statue statue) {
		this.statue = statue;
	}
	
}
