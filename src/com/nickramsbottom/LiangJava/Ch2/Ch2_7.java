import java.util.Scanner;

public class Ch2_7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number of minutes: ");
		int minutes = input.nextInt();
		int minutesInYear = 24 * 60 * 365;
		int years = minutes / minutesInYear;
		
		minutes = minutes % minutesInYear;
		
		int minutesInDay = 24 * 60;
		int days = minutes / minutesInDay;
		
		System.out.println("Years: " + years);
		System.out.println("Days: " + days);
		
		input.close();
	}

}
