package focus;

import jm.JMC;
import jm.music.data.Note;
import jm.music.data.Part;
import jm.music.data.Phrase;
import jm.music.data.Score;
import jm.util.Play;

public class nrunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Score score = new Score("Basic Rhythm");
		Part part = new Part("Drums", 110, 0);
		Phrase phrase = new Phrase(0.0);
		
		Note[] notes = new Note[8];
		notes[0] = new Note(JMC.C4, JMC.QUARTER_NOTE, JMC.FF);
		notes[1] = new Note(JMC.REST, JMC.QUARTER_NOTE, JMC.FF);
		notes[2] = new Note(JMC.G2, JMC.QUARTER_NOTE, JMC.FF);
		notes[3] = new Note(JMC.REST, JMC.QUARTER_NOTE, JMC.FF);
		notes[4] = new Note(JMC.C4, JMC.QUARTER_NOTE, JMC.FF);
		notes[5] = new Note(JMC.REST, JMC.QUARTER_NOTE, JMC.FF);
		notes[6] = new Note(JMC.G2, JMC.QUARTER_NOTE, JMC.FF);
		notes[7] = new Note(JMC.REST, JMC.QUARTER_NOTE, JMC.FF);
		phrase.addNoteList(notes);
		part.addPhrase(phrase);
		score.addPart(part);
	

		for(int i=0;i<5;i++) {
			Play.midi(score);

			System.out.println("n");
			
		}
	}

}
