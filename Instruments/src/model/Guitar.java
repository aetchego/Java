package model;

public class Guitar extends StringInstrument {

	public Guitar() {
		super();
		this.setBowed(false); 
	}
	
	public Guitar(int size) {
		super(size);
		this.setBowed(false); 
	}
	
	public String getInstrumentName() {
		return "Guitar";
	}
	
}
