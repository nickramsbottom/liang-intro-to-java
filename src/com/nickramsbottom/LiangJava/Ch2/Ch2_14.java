import java.util.Scanner;

public class Ch2_14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter weight in lbs, height in inches: ");
		double weightLbs = input.nextDouble();
		double heightInches = input.nextDouble();
		
		double bmi = (weightLbs * 0.45359237)/Math.pow((heightInches * 0.0254), 2);
		
		System.out.println(bmi);
		input.close();
	}

}
