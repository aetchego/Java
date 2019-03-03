package model;

import java.util.ArrayList;

public abstract class WindInstrument extends AbstractInstrument { 
	/* abstract car on ne veut pas qu'il soit possible d'instancier un windInstrument
	 on ne veut instancier que des classes concrètes (un nom d'instrument) */
	
	private int nbTrous;
	
	public WindInstrument() {
		this.nbTrous = 0;
	}
	
	public WindInstrument(int nbTrous) {
		this.nbTrous = nbTrous;
	}
	
	public abstract void blow();

	public int getNbTrous() {
		return nbTrous;
	}

	public void setNbTrous(int nbTrous) {
		this.nbTrous = nbTrous;
	}
	

}
