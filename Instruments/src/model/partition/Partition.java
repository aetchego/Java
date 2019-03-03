package model.partition;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

import model.Note;

public class Partition {

	private static int width = 100;
	private static int height = 9;
	private static int space = 2;
	private HashMap<Integer, ArrayList<String>> lines;
	private HashMap<Note, Integer> equi;
	private static final String FOLDER = "/Users/Alize/projetJava/Instruments/src/model/partition/PartitionSheets";
	
	public Partition() {
		
		ArrayList<String> lineDash = new ArrayList<String>();
		ArrayList<String> lineSpace = new ArrayList<String>();
		this.lines = new HashMap<Integer, ArrayList<String>>();
			
			for (int j = 0; j < width; j++) {
				lineDash.add("-");
				lineSpace.add(" ");
			}
			
			for (int i = 0; i < height; i++)
			{
				ArrayList<String> add = (i % 2 == 0) ? lineDash : lineSpace; 
				this.lines.put(i, add);
			}
		this.equi = new HashMap<Note, Integer>();
		this.equi.put(Note.Do, 3);
		this.equi.put(Note.Ré, 2);
		this.equi.put(Note.Mi, 8);
		this.equi.put(Note.Fa, 7);
		this.equi.put(Note.Sol,6);
		this.equi.put(Note.La, 5);
		this.equi.put(Note.Si, 4);
	}
	
	public void writeLine(ArrayList<Note> notes) {
		
		int y;
		ArrayList<String> copy;
		
		for (Note e : notes) {
			ArrayList<String> add = new ArrayList<String>();
			y = this.equi.get(e);
			copy = this.lines.get(y);
			for (String i : copy) {
				add.add(i);
			}
			add.set(space, "@");
			this.lines.put(y, add);
			space = space + 5;
		}
	}
	
	public void savePartition(String filename) {
		File newFolder = new File(FOLDER);
		if (!(newFolder.exists() && newFolder.isDirectory()))
		{
			boolean created =  newFolder.mkdir();
	        if(!created)
	            System.out.println("Error while saving partition, please try again.");
		}
		File file = new File(FOLDER + "/" + filename);
		if (file.exists()) {
			System.out.println("File already exists, please chose another name.");
			return;
		}
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try (Writer writer = new BufferedWriter(new OutputStreamWriter(
	              new FileOutputStream(FOLDER + "/" + filename), "utf-8"))) {
			writer.write(this.getPartition() + "\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public String getPartition() {
		String partition;
		
		partition = "";
		for (int i = 0; i < height; i++)
		{
			ArrayList<String> res = this.lines.get(i);
			for (String e : res)
				partition += e;
			partition += "\n";
		}
		return partition;
	}
	
	public void printPartition() {
		System.out.println("Partition\n");
		for (int i = 0; i < height; i++)
		{
			ArrayList<String> res = this.lines.get(i);
			for (String e : res)
				System.out.print(e);
			System.out.println();
		}
		System.out.println("\n");
	}

}
