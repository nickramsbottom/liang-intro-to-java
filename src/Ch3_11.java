import java.util.Scanner;

public class Ch3_11 {

	public static void main(String[] args) {
		System.out.println("Enter a year: ");
		
		Scanner input = new Scanner(System.in);
		
		int year = input.nextInt();
		
		input.close();
		
		System.out.println("Enter a month number (1-12): ");
		
		int month = input.nextInt();

		int days = 0;
		
		switch(month) {
			case 1:
				days = 31;
				break;
			case 2:
				if ((year % 4 ==0 && year % 100 != 0) || (year % 400 == 0)) {
					days = 29;
				} else {
					days = 28;
				}
				break;
			case 3:
				days = 31;
				break;
			case 4:
				days = 30;
				break;
			case 5:
				days = 31;
				break;
			case 6:
				days = 30;
				break;
			case 7:
				days = 31;
				break;
			case 8:
				days = 31;
				break;
			case 9:
				days = 30;
				break;
			case 10:
				days = 31;
				break;
			case 11:
				days = 30;
				break;
			case 12:
				days = 31;
				break;
		}
		
		System.out.println(days);
	}

}
