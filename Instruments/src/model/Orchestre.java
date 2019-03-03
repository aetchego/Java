package model;

import java.util.ArrayList;

public class Orchestre implements Instrument {

	private ArrayList<AbstractInstrument> instr;
	
	public Orchestre() {
		this.instr = new ArrayList<AbstractInstrument>();
	}
	
	public void add(AbstractInstrument inst) {
		this.instr.add(inst);
	}

	public void playNote(Note note) {
		for (AbstractInstrument i : this.instr)
			System.out.println(i.getInstrumentName()  + " : " + note);		
	}

	public void play(ArrayList<Note> notes) {
		for (AbstractInstrument i : this.instr) {
			System.out.print(i.getInstrumentName() + " : ");
			for (Note n : notes) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
	}
}
