package Kapittel1;

import edu.princeton.cs.introcs.StdOut;

public class RationalClient {

	public static void main(String[] args) {
		Rational rat = new Rational(4,5);
		StdOut.println(rat);
		
		StdOut.println("Skal bli 1/5, er: " + rat.minus(new Rational(6,10)));
		StdOut.println("Skal bli 9/10 er:" + rat.plus(new Rational(1,10)));
		StdOut.println("Skal bli 2/5 er:" + rat.times(new Rational(1,2)));
		StdOut.println("Skal bli 8/5 er:" + rat.divides(new Rational(1,2)));
		StdOut.println("Skal blir true, er: " + rat.equals(new Rational(8,10)));
		StdOut.println("Skal bli false, er: " + rat.equals(new Rational(15,20)));
		

	}

}
