package focus;
import jm.music.data.Note;
import jm.JMC;
import jm.music.data.*;
import jm.util.*;
import jm.util.Play;

public class main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("hell");

		mrunnable rm= new mrunnable();
		Thread tm= new Thread(rm); 
		nrunnable rn= new nrunnable();
		Thread tn= new Thread(rn);
		tm.start();
		tn .start();
		
		
//		Note note = new Note(600.0, JMC.HALF_NOTE, 90, 0.5);
//		Play.midi(note);
		
		
		
	}

}
