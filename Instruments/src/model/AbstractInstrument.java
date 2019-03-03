package model;

import java.util.ArrayList;

public abstract class AbstractInstrument implements Instrument {

	public AbstractInstrument() {
	}
	
	public void playNote(Note note) {
		System.out.println("Je joue la note " + note.toString());	
	}

	public void play(ArrayList<Note> notes) {
		System.out.print("Je joue les notes :");
		for (Note n : notes) {
			System.out.print(" " + n.toString());
		}
	}
	
	/*public String getInstrumentName(AbstractInstrument inst) {
		System.out.println("hello");
		// 2 manieres de faire, laquelle est la meilleure ?
		return null;
	}*/
	
	public String getInstrumentName() {
		return "Ceci n'est pas un instrument";
	}
	
}
