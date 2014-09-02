package Kapittel1;
import edu.princeton.cs.introcs.StdOut;

public class Oppgave117 {
	public static void main (String [] args){
		
		oppgaveA();
	}
	
	public static void oppgaveA(){
		double t = 9.0;
		while(Math.abs(t-9.0/t) > .001)
			t = (9.0/t + t)/2.0;
		
		StdOut.printf("%.5f\n",t);
		
		
		
		
	}
}
