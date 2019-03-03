package model.main;
import java.util.ArrayList;

import model.Flute;
import model.Guitar;
import model.Note;
import model.StringInstrument;
import model.WindInstrument;

public class MainFlute {

	public static void main(String[] args) {
		WindInstrument flute1 = new Flute(10);
		flute1.blow();
		flute1.playNote(Note.Do);
		
		ArrayList<Note> notes = new ArrayList<Note>();
		notes.add(Note.Ré);
		notes.add(Note.Sol);
		notes.add(Note.Si);
		flute1.play(notes);
		
		StringInstrument guitare = new Guitar(10);
		guitare.tune();
		guitare.playNote(Note.Sol);
		guitare.play(notes);
		
		/* Pattern = solution à un problème récurrent
		 * chercher java design pattern
		 * 
		 */
		
		/* Créer une classe orchestre qui va prendre en données membres (attributs de classe)
		 * une collection d'instruments (regarder les types les + pertinents) et sa méthode play
		 * orchestre = pattern composite, on pourra le faire implémenter Instrument, même méthode maos appelé
		 * pour chaque instruments
		 * 
		 * */
	}
}
