package Kapittel1;

public class Counter {

	private final String name;
	private int count;
	
	public Counter(String id){
		count = 0;
		name = id; 
	}
	
	public void increment(){
		count++;
	}
	
	public int tally(){
		return count;
	}
	
	@Override
	public String toString(){
		return count + " " + name; 
	}
}
