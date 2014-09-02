import java.util.Scanner;


public class HelloWorld {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Hva er favorittfargen din!");
		String svar = s.nextLine();
		if(svar.equals("rosa") || svar.equals("lilla"))
			System.out.println("Du er gay!");
		else
			System.out.println("Du er normal!");

	}

}
