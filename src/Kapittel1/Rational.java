package Kapittel1;

public class Rational {
	
	final int numerator;
	final int denominator;
	
	public Rational(int num, int den){
		int gcd = gcd(num,den);
		numerator = num/gcd;
		denominator = den/gcd;
	}
	
	private static int gcd(int num, int den) {
		if(den == 0) return num;
		int r = num%den;
		return gcd(den,r);
	}

	public int getNum(){
		return numerator;
	}
	
	public int getDen(){
		return denominator;
	}
	
	public Rational plus(Rational b){
		int numeratorOne = this.getNum()*b.getDen(); 
		int numeratorTwo = b.getNum()*this.getDen();
		int denominator = this.getDen()*b.getDen();
		
		
		return new Rational(numeratorOne+numeratorTwo, denominator);
	}
	
	public Rational minus(Rational b){
		int numeratorOne = this.getNum()*b.getDen(); 
		int numeratorTwo = b.getNum()*this.getDen();
		int denominator = this.getDen()*b.getDen();
		
		
		return new Rational(numeratorOne-numeratorTwo, denominator);
	}
	
	public Rational times(Rational b){
		return new Rational(this.getNum()*b.getNum(), this.getDen()*b.getDen());
	}
	
	public Rational divides(Rational b){
		return new Rational(this.getNum()*b.getDen(), this.getDen()*b.getNum());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + denominator;
		result = prime * result + numerator;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rational other = (Rational) obj;
		if (denominator != other.denominator)
			return false;
		if (numerator != other.numerator)
			return false;
		return true;
	}
	
	@Override
	public String toString(){
		return "" + numerator + "/" + denominator;
	}
	
	
	

}
