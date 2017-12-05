import java.util.Scanner;

public class Ch2_11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of years: ");
		int years = input.nextInt();
		int startPop = 312032486;
		
		int yearInSecs = 365 * 24 * 60 * 60;
				
		int endPop = startPop + years * ((yearInSecs / 7) + (yearInSecs / 45) - (yearInSecs / 13));
		
		
		System.out.println(endPop);
		input.close();
	}

}
