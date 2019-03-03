package model;

import java.util.ArrayList;

public class StringInstrument extends AbstractInstrument {

	private ArrayList<Boolean> nbStrings;
	private boolean isBowed;
	
	public StringInstrument() {
		this.nbStrings = new ArrayList<Boolean>(10);
	}
	
	public StringInstrument(int size) {
		this.nbStrings = new ArrayList<Boolean>(size);
	}
	
	public void tune() {
		for (Boolean e : this.nbStrings) {
			e = false;
		}
		for (Boolean e : this.nbStrings) {
			e = true;
		}
	}

	public ArrayList<Boolean> getNbStrings() {
		return nbStrings;
	}

	public void setNbStrings(ArrayList<Boolean> nbStrings) {
		this.nbStrings = nbStrings;
	}

	protected boolean isBowed() {
		return isBowed;
	}

	final protected void setBowed(boolean isBowed) {
		this.isBowed = isBowed;
	}
}
