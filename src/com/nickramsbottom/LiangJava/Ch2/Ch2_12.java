import java.util.Scanner;

public class Ch2_12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter speed and acceleration: ");
		double a1 = input.nextDouble();
		double d = input.nextDouble();
		
		double a46 = a1 + (46 - 1) * d;
		
		System.out.println(a46);
		input.close();
	}

}
