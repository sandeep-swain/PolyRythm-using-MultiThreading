package focus;

import jm.music.data.Note;
import jm.JMC;
import jm.music.data.*;
import jm.util.*;
import jm.util.Play;

public class mrunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
//		Note a= new Note(30, 1);
//		Note c= new Note(60,1);
		Score score = new Score("Basic Rhythm");
		Part part = new Part("Drums", 70, 0);
		Phrase phrase = new Phrase(0.0);
		
		Note[] notes = new Note[8];
		notes[0] = new Note(600.0, JMC.HALF_NOTE, 70, 0.5);
		notes[1] = new Note(650.0, JMC.HALF_NOTE, 80, 0.5);
		notes[2] = new Note(500.0, JMC.HALF_NOTE, 90, 0.5);
		notes[3] = new Note(400.0, JMC.HALF_NOTE, 100, 0.5);
		notes[4] = new Note(550.0, JMC.HALF_NOTE, 95, 0.5);
		notes[5] = new Note(650.0, JMC.HALF_NOTE, 85, 0.5);
		notes[6] = new Note(500.0, JMC.HALF_NOTE, 75, 0.5);
		notes[7] = new Note(580.0, JMC.HALF_NOTE, 65, 0.5);
		phrase.addNoteList(notes);
		part.addPhrase(phrase);
		score.addPart(part);
		
		
		
		
		


		for(int i=0;i<3;i++) {
//			Play.midi(a);
//			Play.midi(c);
//			Play.midi(c);
			Play.midi(score);
			

			
			System.out.println("m");
			
		}
		
	}
	
	

	

}
