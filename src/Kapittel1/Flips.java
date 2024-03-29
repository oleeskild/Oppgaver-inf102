package Kapittel1;

import edu.princeton.cs.introcs.StdOut;
import edu.princeton.cs.introcs.StdRandom;

public class Flips {

	public static void main (String[] args){
		int T = Integer.parseInt(args[0]);
		
		Counter heads = new Counter("Heads");
		Counter tails = new Counter("Tails");
		
		for(int i = 0; i<T; i++){
			if(StdRandom.bernoulli(0.5))
				heads.increment();
			else
				tails.increment();
		}
			
		StdOut.println(heads);
		StdOut.println(tails);
		int d = heads.tally() - tails.tally();
		StdOut.println("delta: " + Math.abs(d));		
	}
}
