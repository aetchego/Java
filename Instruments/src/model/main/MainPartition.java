package model.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import model.Note;
import model.partition.Partition;

public class MainPartition {

	public static void main(String[] args) {
		Partition partition = new Partition();
		//HashMap<Integer, ArrayList<String>> res = line.getLine();
		/*for (ArrayList e : res) {
			System.out.print(e);
		}*/
		//System.out.println(res.get(0));
		//System.out.println(Arrays.asList(res));
		//System.out.print("a");
		ArrayList<Note> notes = new ArrayList<Note>();
		notes.add(Note.La);
		notes.add(Note.Mi);
		notes.add(Note.Sol);
		notes.add(Note.Sol);
		notes.add(Note.Sol);
		notes.add(Note.Sol);
		notes.add(Note.Sol);
		partition.printPartition();
		partition.writeLine(notes);
		partition.printPartition();
		//partition.savePartition("Composition");

	}

}
