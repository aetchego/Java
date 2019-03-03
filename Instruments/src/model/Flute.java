package model;

public class Flute extends WindInstrument {

	public Flute() {
		super();
	}
	
	public Flute(int nbTrous) {
		super(nbTrous);
	}

	@Override
	public void blow() {
		System.out.println("Je souffle dans ma flute");
	}
	
	public String getInstrumentName() {
		return "Flute";
	}
}
