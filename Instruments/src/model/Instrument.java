package model;

import java.util.ArrayList;

public interface Instrument {

	public void playNote(Note note);
	public void play(ArrayList<Note> notes); // types de collections, il y'a l'ArrayList
}
