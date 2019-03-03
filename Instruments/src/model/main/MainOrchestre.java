package model.main;

import java.util.ArrayList;

import model.Flute;
import model.Guitar;
import model.Note;
import model.Orchestre;

public class MainOrchestre {

	public static void main(String[] args) {
		Orchestre orch = new Orchestre();
		
		ArrayList<Note> notes = new ArrayList<Note>();
		notes.add(Note.La);
		notes.add(Note.Ré);
		notes.add(Note.Sol);
		
		
		orch.add(new Guitar());
		orch.add(new Flute());
		orch.add(new Flute());
		
		orch.playNote(Note.La);
		orch.play(notes);

	}

}
