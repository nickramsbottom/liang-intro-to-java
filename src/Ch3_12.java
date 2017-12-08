import java.util.Scanner;

public class Ch3_12 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int number = input.nextInt();

		input.close();
		
		if (number%10 == (number/100)%10) {
			System.out.println("pallindrome");
		} else {
			System.out.println("not pallindrome");
		}
	}

}
